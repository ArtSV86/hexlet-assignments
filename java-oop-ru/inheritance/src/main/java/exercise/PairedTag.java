package exercise;

import java.util.Map;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

// BEGIN
public class PairedTag extends Tag {

    private final String body;
    private final List<Tag> child;

    public PairedTag(String tag, Map<String, String> attributes, String body, List<Tag> child) {
        super(tag, attributes);
        this.body = body;
        this.child = child;
    }

    @Override
    public String toString() {
        StringBuilder stringChild = new StringBuilder();
        child.forEach(stringChild::append);
        return "<" + super.getTag() + super.stringifyAttributes() + ">" + body + stringChild + "</" + super.getTag() + ">";
    }
}

// END
