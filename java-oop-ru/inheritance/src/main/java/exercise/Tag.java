package exercise;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

// BEGIN
@Setter
@Getter
public class Tag {

    String tagName;

    Map<String, String> attributes;

    public Tag(String tagName,  Map<String, String> attributes){
        this.tagName = tagName;
        this.attributes = attributes;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("<" + tagName + " ");
        for (String key : attributes.keySet()) {
            str.append(key).append("=").append("\"").append(attributes.get(key)).append("\"").append(" ");
        }
        return str.deleteCharAt(str.length() - 1).append(">").toString();
    }

}
// END
