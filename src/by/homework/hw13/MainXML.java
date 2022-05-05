package by.homework.hw13;

import by.homework.hw13.domain.Device;
import by.homework.hw13.domain.Devices;
import by.homework.hw13.domain.Type;
import by.homework.hw13.json.JSONRunner;
import by.homework.hw13.xml.parser.DOMRunner;
import by.homework.hw13.xml.utils.XMLUtils;
import generated.ObjectFactory;

import java.util.Arrays;
import java.util.List;


public class MainXML {

    public static final String RESOURCES = "resources";
    public static final String DEVICES_XML = "devices.xml";
    public static final String DEVICES_XSD = "devices.xsd";
    public static final String DEVICES_JSON = "devices.json";
    public static final String RESOURCES_DEVICES_XSD = "resources/devices.xsd";
    public static final String DIRECTORY_TO_GENERATE_POJO = "src";

    public static void main(String[] args) {

        System.out.print("Generate JAXB Objects: ");
        System.out.println(XMLUtils.generateJAXBObjects(DIRECTORY_TO_GENERATE_POJO, RESOURCES_DEVICES_XSD));
        //Domain part
        Device hdd = new Device(1, "HDD", "China", 23.5, new Type(false, 10, true), true);
        Device cpu = new Device(2, "CPU", "Japan", 95.2, new Type(false, 45, false), true);
        Device ram = new Device(3, "RAM", "Taiwan", 45.6, new Type(false, 22, false), true);
        Device motherboard = new Device(4, "Motherboard", "China", 55.2, new Type(false, 36, true), true);
        Device display = new Device(5, "Display", "Poland", 125.2, new Type(true, 42, false), false);
        Device keyboard = new Device(6, "Keyboard", "China", 12.0, new Type(true, 1, false), false);
        Devices devices = new Devices(Arrays.asList(hdd, cpu, ram, motherboard, display, keyboard));
        //JAXB part
        ObjectFactory factory = new ObjectFactory();
        generated.Devices jaxbDevices = factory.createDevices();
        for (Device dev : devices.getDevicesList()) {
            generated.Device jaxbDev = factory.createDevice();
            jaxbDev.setId(dev.getId());
            jaxbDev.setName(dev.getName());
            jaxbDev.setOrigin(dev.getOrigin());
            jaxbDev.setPrice(dev.getPrice());
            generated.Type jaxbTypeDev = factory.createType();
            jaxbTypeDev.setPeripheral(dev.getType().isPeripheral());
            jaxbTypeDev.setPower(dev.getType().getPower());
            jaxbTypeDev.setFan(dev.getType().isFan());
            jaxbDev.setType(jaxbTypeDev);
            jaxbDev.setCritical(dev.isCritical());
            jaxbDevices.getDevice().add(jaxbDev);
        }
        System.out.println("Marshalling JAXB Objects to XML: ");
        XMLUtils.marshallToXml(jaxbDevices, DEVICES_XML);
        System.out.print("Validate XSD and XML:   ");
        System.out.println(XMLUtils.validateXml(DEVICES_XSD, DEVICES_XML));
        ///Parsing
        List<generated.Device> deviceListFromXML = DOMRunner.getJAXBfromXML(RESOURCES,DEVICES_XML);
        generated.Devices devicesFromXML = XMLUtils.unmarshallXml(DEVICES_XML);
        // Devices to JSON
        JSONRunner.objectsToJSON(devicesFromXML, RESOURCES, DEVICES_JSON);
        // Device from JSON
        Devices devicesFromJSON = JSONRunner.getDevicesFromJSON(RESOURCES, DEVICES_JSON);
    }
}
