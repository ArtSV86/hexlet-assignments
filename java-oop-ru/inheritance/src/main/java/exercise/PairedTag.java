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

    public PairedTag(String tag, Map<String, String> attributes) {
        super(tag, attributes);
    }

    @Override
    public void getTag(String tagName, Map<String, String> attribute, String body, List<SingleTag> tag) {
        super.getTag();
        this.tagName = tagName;
        Set<Map.Entry<String, String>> entries = attribute.entrySet();
        entries.stream().forEach(item -> {
            this.key = item.getKey();
            this.value = item.getValue();
            this.attribute.put(this.key, this.value);
        });
        this.body = body;


        public String toString () {
            String result = "<" + tagName + " " + key + "=" + '"' + value + '"' + ">" +
            return result;
        }
    }
// END
