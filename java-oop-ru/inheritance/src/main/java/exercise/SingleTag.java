package exercise;


import java.util.List;
import java.util.Map;
import java.util.Set;

// BEGIN
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
