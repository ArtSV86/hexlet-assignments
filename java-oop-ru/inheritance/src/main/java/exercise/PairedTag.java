package exercise;

import java.util.Map;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

// BEGIN
public class PairedTag extends Tag {
    private String tagName;
    Map<String, String> attribute;
    private String key;
    private String value;
    private String body;


    public PairedTag(String tagName, Map<String, String> attribute, String body, List<SingleTag> tag) {
        this.tagName = tagName;
        Set<Map.Entry<String, String>> entries = attribute.entrySet();
        entries.stream().forEach(item -> {
            this.key = item.getKey();
            this.value = item.getValue();
            this.attribute.put(this.key,this.value);
        });
        this.body = body;
        tag.stream().forEach(map -> {

    }
    }
    public String toString() {
        String result = "<" + tagName + " " + key + "=" + '"' + value + '"' + ">" +
        return result;
    }
}
// END
