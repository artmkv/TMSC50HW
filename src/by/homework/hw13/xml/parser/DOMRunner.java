package by.homework.hw13.xml.parser;

import generated.Device;
import generated.Type;
import org.w3c.dom.*;
import org.xml.sax.SAXException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class DOMRunner {

    public static final String FILE_XSD = "devices.xsd";
    public static final String FILE_XML = "devices.xml";
    public static final String RESOURCES = "resources";
    public static final String TAG_DEVICE = "device";
    public static final String TAG_ID = "id";
    public static final String TAG_NAME = "name";
    public static final String TAG_ORIGIN = "origin";
    public static final String TAG_PRICE = "price";
    public static final String TAG_TYPE = "type";
    public static final String TAG_PERIPHERAL = "peripheral";
    public static final String TAG_POWER = "power";
    public static final String TAG_FAN = "fan";
    public static final String TAG_CRITICAL = "critical";


    public static List<generated.Device> getJAXBfromXML(String resources, String fileXML){
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setNamespaceAware(true);
        List<generated.Device> deviceList = new ArrayList<>();
        try {
            DocumentBuilder documentBuilder = factory.newDocumentBuilder();
            Document document = documentBuilder.parse(Path.of(resources, fileXML).toFile());
            Node rootNode = document.getFirstChild();
            NodeList rootChildNodes = rootNode.getChildNodes();
            int id = 0;
            String name = "";
            String origin = "";
            double price = 0;
            boolean peripheral = false;
            double power = 0;
            boolean fan = false;
            boolean critical = false;

            for (int i = 0; i < rootChildNodes.getLength(); i++) {
                if (rootChildNodes.item(i).getNodeType() != Node.ELEMENT_NODE) {
                    continue;
                }
                if (!rootChildNodes.item(i).getNodeName().equals(TAG_DEVICE)) {
                    continue;
                }
                NodeList elementDevice = rootChildNodes.item(i).getChildNodes();
                generated.Device device = new Device();
                generated.Type type = new Type();
                for (int j = 0; j < elementDevice.getLength(); j++) {
                    if (elementDevice.item(j).getNodeType() != Node.ELEMENT_NODE) {
                        continue;
                    }
                    switch (elementDevice.item(j).getNodeName()) {
                        case TAG_ID: {
                            try {
                                id = Integer.valueOf(elementDevice.item(j).getTextContent());
                            } catch (NumberFormatException e) {
                                System.out.println(e.getStackTrace());
                            }
                            break;
                        }
                        case TAG_NAME: {
                            name = elementDevice.item(j).getTextContent();
                            break;
                        }
                        case TAG_ORIGIN: {
                            origin = elementDevice.item(j).getTextContent();
                            break;
                        }
                        case TAG_PRICE: {
                            try {
                                price = Double.valueOf(elementDevice.item(j).getTextContent());
                            } catch (NumberFormatException e) {
                                System.out.println(e.getStackTrace());
                            }
                            break;
                        }
                        case TAG_TYPE: {
                            NodeList nodeTypes = elementDevice.item(j).getChildNodes();
                            for (int k = 0; k < nodeTypes.getLength(); k++) {
                                if (nodeTypes.item(k).getNodeType() != Node.ELEMENT_NODE) {
                                    continue;
                                }
                                switch (nodeTypes.item(k).getNodeName()) {
                                    case TAG_PERIPHERAL: {
                                        try {
                                            peripheral = Boolean.valueOf(nodeTypes.item(k).getTextContent());
                                        } catch (NumberFormatException e) {
                                            System.out.println(e.getStackTrace());
                                        }
                                        break;
                                    }
                                    case TAG_POWER: {
                                        try {
                                            power = Double.valueOf(nodeTypes.item(k).getTextContent());
                                        } catch (NumberFormatException e) {
                                            System.out.println(e.getStackTrace());
                                        }
                                        break;
                                    }
                                    case TAG_FAN: {
                                        try {
                                            fan = Boolean.valueOf(nodeTypes.item(k).getTextContent());
                                        } catch (NumberFormatException e) {
                                            System.out.println(e.getStackTrace());
                                        }
                                        break;
                                    }
                                }
                            }
                            type.setPeripheral(peripheral);
                            type.setPower(power);
                            type.setFan(fan);
                        }
                        case TAG_CRITICAL: {
                            try {
                                critical = Boolean.valueOf(elementDevice.item(j).getTextContent());
                            } catch (NumberFormatException e) {
                                System.out.println(e.getStackTrace());
                            }
                            break;
                        }
                    }
                }
                device.setId(id);
                device.setName(name);
                device.setOrigin(origin);
                device.setPrice(price);
                device.setType(type);
                device.setCritical(critical);
                deviceList.add(device);
            }
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        }
//        generated.Devices genDevices = new generated.Devices();
        return deviceList;
    }

    private static void printDocument(Element device) {
        NodeList childNodes = device.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node node = childNodes.item(i);
            switch (node.getNodeType()) {
                case Node.ELEMENT_NODE:
                    System.out.println("Tag name: " + node.getLocalName());
                    printAttributes(node);
                    printDocument((Element) node);
                    break;
                case Node.TEXT_NODE:
                    String textContent = node.getTextContent();
                    if (textContent.trim().length() != 0) {
                        System.out.println("Tag value: " + textContent);
                    }
                    break;
            }
        }
    }

    private static void printAttributes(Node node) {
        NamedNodeMap attributes = node.getAttributes();
        for (int j = 0; j < attributes.getLength(); j++) {
            Node attribute = attributes.item(j);
            System.out.println("Attribute name: " + attribute.getLocalName() + " attribute value: " + attribute.getNodeValue());
        }
    }
}
