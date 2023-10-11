package exercise;


import java.util.HashMap;
import java.util.Map;


// BEGIN
public class App {
    public static Map<String, String> swapKeyValue(KeyValueStorage storage) {
        Map<String, String> modifiedMap = new HashMap<>();
        Map<String, String> temp = storage.toMap();

        for (Map.Entry<String, String> map : temp.entrySet()) {
            String key = map.getValue();
            String value = map.getKey();
            modifiedMap.put(key, value);
        }
        return modifiedMap;
    }

}

// END
