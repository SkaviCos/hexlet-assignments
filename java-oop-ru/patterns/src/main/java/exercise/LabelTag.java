package exercise;

import lombok.Getter;
import lombok.Setter;

// BEGIN
@Getter
@Setter
public class LabelTag implements TagInterface {

    String tagName;
    TagInterface tag;

    LabelTag(String tagName, TagInterface tag) {
        this.tagName = tagName;
        this.tag = tag;
    }

    @Override
    public String render() {
        return "<label>" + tagName + tag.render() + "</label>";
    }
}
// END
