package exercise;

import lombok.Getter;
import lombok.Setter;

// BEGIN
@Getter
@Setter
public class InputTag implements TagInterface {

    String type;
    String value;


    InputTag(String type, String value) {
        this.type = type;
        this.value = value;
    }


    @Override
    public String render() {
        return "<input type=\"" + type + "\" value=\"" + value + "\">";
    }
}
// END
