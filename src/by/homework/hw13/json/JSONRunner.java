package by.homework.hw13.json;


import by.homework.hw13.domain.Devices;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.nio.file.Path;


public class JSONRunner {

    public static Devices getDevicesFromJSON(String directory, String fileJSON) {
        ObjectMapper objectMapper = new ObjectMapper();
        Devices devicesFromJson = new Devices();
        try {
            devicesFromJson = objectMapper.readValue(Path.of(directory, fileJSON).toFile(), Devices.class);
//            System.out.println(devicesFromJson);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return devicesFromJson;
    }

    public static void objectsToJSON(Object objects, String directoryToWrite, String fileToJSON) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.writerWithDefaultPrettyPrinter()
                    .writeValue(
                            Path.of(directoryToWrite, fileToJSON).toFile(),
                            objects
                    );
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
