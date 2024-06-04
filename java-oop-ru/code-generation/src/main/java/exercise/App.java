package exercise;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

// BEGIN
public class App {

    public static void save(Path path, Car car) throws IOException {
        String json = Car.serialize(car);
        Files.writeString(path, json);
    }

    public static Car extract(Path path) throws IOException {
        String car = Files.readString(path);
        var carObj = Car.unserialize(car);
        return carObj;
    }
}
// END
