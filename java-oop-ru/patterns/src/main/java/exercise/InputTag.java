package exercise;

// BEGIN
public class InputTag implements TagInterface {
    private final String type;
    private final String value;


    @Override
    public String render() {
        char quote = '"';
        String result = "<input type=" + quote + type + quote + " value=" + quote + value + quote + ">";
        return result;
    }

    public InputTag(String type, String value) {
        this.type = type;
        this.value = value;
    }
}
// END
