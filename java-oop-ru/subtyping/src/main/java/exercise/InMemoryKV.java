package exercise;

import java.util.Map;
import java.util.HashMap;

// BEGIN
public class InMemoryKV implements KeyValueStorage {
    Map<String, String> data;
    String value;

    @Override
    public void set(String key, String value) {
        this.data.put(key, value);
    }

    @Override
    public void unset(String key) {
        data.remove(key);
    }

    @Override
    public String get(String key, String defaultValue) {
        return value = (data.containsKey(key)) ? data.get(key) : defaultValue;
    }

    @Override
//    public Map<String, String> toMap(Map <String, String> storage) {
//        data.putAll(storage);
//        return data;
//    }
    public Map<String, String> toMap() {
        return data;
    }

    public InMemoryKV(Map<String, String> storage) {
        this.data = new HashMap<>(storage);
    }
}
// END
