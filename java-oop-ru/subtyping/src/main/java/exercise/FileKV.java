package exercise;

import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

// BEGIN
public class FileKV implements KeyValueStorage {

    Map<String, String> defaulMap = new HashMap<>();
    String path;

    FileKV(String pathToFile, Map<String, String> defaulMap) {
        this.defaulMap.putAll(defaulMap);
        this.path = pathToFile;
        Map<String, String> tempMap = new HashMap<>(defaulMap);
        String mapInString = Utils.serialize(tempMap);
        String absoluteFilePath = Paths.get(this.path).toAbsolutePath().normalize().toString();
        Utils.writeFile(absoluteFilePath, mapInString);
    }

    @Override
    public void set(String key, String value) {
        defaulMap.put(key, value);
    }

    @Override
    public void unset(String key) {
        defaulMap.remove(key);
    }

    @Override
    public String get(String key, String defaultValue) {
        return defaulMap.getOrDefault(key, defaultValue);
    }

    @Override
    public Map<String, String> toMap() {
        return defaulMap;
    }
}
// END
