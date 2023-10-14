package exercise;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.Map;

// BEGIN
public class Tag {
    private final String tag;
    private final Map<String, String> attributes;

    public Tag(String tag, Map<String, String> attributes) {
        this.tag = tag;
        this.attributes = attributes;
    }

    public String getTag() {
        return tag;
    }

    public String stringifyAttributes() {
        Set<Map.Entry<String, String>> setAttributes = attributes.entrySet();

        StringBuilder stringAttributes = new StringBuilder();
        setAttributes.forEach(item -> {
            stringAttributes.append(" ");
            stringAttributes.append(item.getKey());
            stringAttributes.append("=\"");
            stringAttributes.append(item.getValue());
            stringAttributes.append("\"");
        });

        return stringAttributes.toString();
    }
}
// END
