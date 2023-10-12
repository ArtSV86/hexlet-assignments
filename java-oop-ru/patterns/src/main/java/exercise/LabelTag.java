package exercise;

// BEGIN
public class LabelTag implements TagInterface {
    private String lable;
    private TagInterface inputTag;

    @Override
    public String render() {
        String result = "<label>" + lable + inputTag.render() + "</label>";
        return result;
    }

    public LabelTag(String lable, TagInterface inputTag) {
        this.lable = lable;
        this.inputTag = inputTag;
    }
}
// END
