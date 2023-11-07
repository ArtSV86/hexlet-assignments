package exercise;

import com.fasterxml.jackson.core.JsonProcessingException;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.nio.file.Path;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;

// BEGIN
public class App {
    public static void save(Path path, Car car) throws JsonProcessingException {
    String stringJson = Car.serialize(car);
    }

    public static Car extract(Path path, Car car) {
        FileInputStream fileInputStream = new FileInputStream(path);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

         = () objectInputStream.readObject();

        }
}
// END
