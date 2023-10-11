package exercise;

import java.util.Map;

// BEGIN
public class FileKV implements KeyValueStorage {
    @Override
    public void set(String key, String value) {

    }

    @Override
    public void unset(String key) {

    }

    @Override
    public String get(String key, String defaultValue) {
        return null;
    }

    @Override
    public Map<String, String> toMap() {
        return null;
    }
    public FileKV (String filePath, Map<String, String> map) {

    }
}
// END
