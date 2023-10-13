package exercise;


import java.util.List;
import java.util.Map;
import java.util.Set;

// BEGIN
public  class SingleTag extends Tag {
    private String tagName;
    private String key;
    private String value;

    public SingleTag(String tagName, Map<String, String> attribute) {

        this.tagName = tagName;

        Set<Map.Entry<String, String>> entries = attribute.entrySet();
        entries.stream().forEach(item -> {
            this.key = item.getKey();
            this.value = item.getValue();
        });
    }

    public String toString() {
        String result = "<" + tagName + " " + key + "=" + '"' + value + '"' + ">";
        return result;
    }
}
// END
