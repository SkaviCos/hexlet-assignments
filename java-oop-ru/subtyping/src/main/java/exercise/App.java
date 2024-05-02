package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
public class App {
    public static void swapKeyValue(KeyValueStorage storage) {
        Map<String, String> currentStorage = new HashMap<>(storage.toMap());
        Map<String, String> swapStorage = new HashMap<>();

        for (Map.Entry<String, String> entry : currentStorage.entrySet()) {
            swapStorage.put(entry.getValue(), entry.getKey());
        }

        for (String key : currentStorage.keySet()) {
            storage.unset(key);
        }

        for (Map.Entry<String, String> entry : swapStorage.entrySet()) {
            storage.set(entry.getKey(), entry.getValue());
        }

    }
}
// END
