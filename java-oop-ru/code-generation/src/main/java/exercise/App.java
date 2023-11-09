package exercise;

import com.fasterxml.jackson.core.JsonProcessingException;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;

// BEGIN
public class App {
    public static void save(Path filePath, Car instance) throws Exception {
//    String stringJson = Car.serialize(car);
//        PrintWriter out;
//        try{
//            out = new PrintWriter(new FileOutputStream(path.toFile()), true);
//            out.println(stringJson);
//            out.flush();
//            out.close();
//        }catch (Exception e) {
//            e.printStackTrace();
//        }

        String jsonRepresentation = Car.serialize(instance);
        Files.writeString(filePath, jsonRepresentation, StandardOpenOption.WRITE);
    }

    public static Car extract(Path filePath) throws Exception {

        String jsonRepresentation = Files.readString(filePath);
        Car instance = Car.unserialize(jsonRepresentation);
        return instance;
        }
}
// END
