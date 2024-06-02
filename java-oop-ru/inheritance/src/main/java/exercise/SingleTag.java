package exercise;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

// BEGIN
@Setter
@Getter
public class SingleTag extends Tag {

    String tagName;

    Map<String, String> attributes;
    public SingleTag(String tagName, Map<String, String> attributes) {
        super(tagName, attributes);
        this.tagName = tagName;
        this.attributes = attributes;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
// END
