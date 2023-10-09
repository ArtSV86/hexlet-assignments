package exercise;

import java.util.Map;
import java.util.HashMap;

// BEGIN
public class InMemoryKV implements KeyValueStorage {
    Map<String, String> data = map.toMap();
    String value;
    @Override
    public void set(String key, String value) {
        if (!data.containsKey(key)) {
            data.put(key, value);
        } else {
            data.put(key, value);
        }
    }
    @Override
    public void unset(String key) {
     data.remove(key);
    }
    @Override
    public String get(String key, String defaultValue) {
        if (data.containsKey(key)) {
            value = data.get(key);
        } else {
            value = defaultValue;
        }
     return value;
    }
    @Override
    public Map<String, String> toMap(){
    return
    }
    public InMemoryKV(Map<String,String> map) {

    }
}
// END
