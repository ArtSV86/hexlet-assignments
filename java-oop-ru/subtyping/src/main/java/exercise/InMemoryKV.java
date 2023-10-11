package exercise;

import java.util.Map;
import java.util.HashMap;

// BEGIN
public class InMemoryKV implements KeyValueStorage {
    private Map<String, String> mainStorage;

    @Override
    public void set(String key, String value) {
        this.mainStorage.put(key, value);
    }

    @Override
    public void unset(String key) {
        mainStorage.remove(key);
    }

    @Override
    public String get(String key, String defaultValue) {
        return mainStorage.getOrDefault(key, defaultValue);
    }

    @Override
//    public Map<String, String> toMap(Map <String, String> storage) {
//        data.putAll(storage);
//        return data;
//    }
    public Map<String, String> toMap() {
        return new HashMap<>(mainStorage);
    }

    public InMemoryKV(Map<String, String> mainStorage) {
        this.mainStorage = new HashMap<>(mainStorage);
    }
}
// END
