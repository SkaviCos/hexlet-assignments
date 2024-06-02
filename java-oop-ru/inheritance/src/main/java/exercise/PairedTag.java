package exercise;

import java.util.List;
import java.util.Map;

// BEGIN
public class PairedTag extends Tag {
    String tagName;
    Map<String, String> attributes;
    String body;
    List<Tag> child;

    public PairedTag(String tagName, Map<String, String> attributes, String body, List<Tag> child) {
        super(tagName, attributes);
        this.tagName = tagName;
        this.attributes = attributes;
        this.body = body;
        this.child = child;
    }

    @Override
    public String toString() {
        Tag tag = new SingleTag(tagName, attributes);
        StringBuilder str = new StringBuilder(tag.toString());
        str.append(body);
        for (Tag element : child) {
            str.append(new SingleTag(element.getTagName(), element.getAttributes()));
        }
        return str.append("</").append(tagName).append(">").toString();
    }

}
// END
