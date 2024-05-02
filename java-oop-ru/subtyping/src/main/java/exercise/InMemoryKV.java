package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
public class InMemoryKV implements KeyValueStorage {

    Map<String, String> defaulMap;

    public InMemoryKV(Map<String, String> defaulMap) {
        this.defaulMap = new HashMap<>(defaulMap);
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
        return new HashMap<>(defaulMap);
    }
}
// END
