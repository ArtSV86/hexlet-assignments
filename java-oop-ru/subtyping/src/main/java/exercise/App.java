package exercise;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;


// BEGIN
public class App {
    public static Map<String, String> swapKeyValue(KeyValueStorage storage) {

        Map<String, String> temp = storage.toMap();

        for (Map.Entry<String, String> map : temp.entrySet()) {
            String key = map.getValue();
            String value = map.getKey();
            storage.unset(value);
            storage.set(key, value);
        }
        return storage.toMap();
    }

//        Map<String, String> map = storage.toMap();
//        Set<Map.Entry<String, String>> entries = map.entrySet();
//
//        entries.stream().forEach(item -> {
//            storage.unset(item.getKey());
//            storage.set(item.getValue(), item.getKey());
//        });
//
//
//        return storage.toMap();
//    }
}
// END
