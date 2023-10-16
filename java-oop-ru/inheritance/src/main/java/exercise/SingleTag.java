package exercise;


import java.util.List;
import java.util.Map;
import java.util.Set;

// BEGIN
//public class SingleTag extends Tag {
//    private String tagName;
//    private String key;
//    private String value;
//    public SingleTag(String tag, Map<String, String> attributes) {
//        super(tag, attributes);
//    }
//
//    @Override
//    public void getTag(String tagName, Map<String, String> attribute) {
//        super.getTag();
//
//        this.tagName = tagName;
//
//        Set<Map.Entry<String, String>> entries = attribute.entrySet();
//        entries.stream().forEach(item -> {
//            this.key = item.getKey();
//            this.value = item.getValue();
//        });
//    }
//
//
//@Override
//    public String toString() {
//        String result = "<" + tagName + " " + key + "=" + '"' + value + '"' + ">";
//        return result;
//    }

    public class SingleTag extends Tag {
        public SingleTag(String tag, Map<String, String> attributes) {
            super(tag, attributes);
        }

        @Override
        public String toString() {
            return "<" + super.getTag() + super.stringifyAttributes() + ">";
        }
    }

// END
