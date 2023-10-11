package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
public class FileKV implements KeyValueStorage {
    private Map<String, String> mainStorage;
    private String filePath;
    @Override
    public void set(String key, String value) {

    }

    @Override
    public void unset(String key) {

    }

    @Override
    public String get(String key, String defaultValue) {
        return mainStorage.getOrDefault(key, defaultValue);
    }

    @Override
    public Map<String, String> toMap() {
        return new HashMap<>(mainStorage);
    }
    public FileKV (String filePath, Map<String, String> mainStorage) {
        this.mainStorage = new HashMap<>(mainStorage);
        this.filePath = filePath;
    }
}
// END
