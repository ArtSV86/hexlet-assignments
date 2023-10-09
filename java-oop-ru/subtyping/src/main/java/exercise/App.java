package exercise;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

// BEGIN
public class App {
public static Map<String,String> swapKeyValue(Map<String,String> storage) {
    Map<String,String> modifiedMap = new HashMap<>();

         for(Map.Entry<String, String> map: storage.entrySet()) {
             String key = map.getValue();
             String value = map.getKey();
             modifiedMap.put(key, value);
         }
         return modifiedMap;
       }

}

// END
