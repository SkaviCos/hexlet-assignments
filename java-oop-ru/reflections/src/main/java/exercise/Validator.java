package exercise;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// BEGIN
public class Validator {

    public static List<String> validate(Object obj) throws IllegalAccessException {

        List<String> nonValidField = new ArrayList<>();
        for (Field field : obj.getClass().getDeclaredFields()) {
            field.setAccessible(true);
            if (field.isAnnotationPresent(NotNull.class) && (field.get(obj) == null)) {
                nonValidField.add(field.getName());
            }
        }
        return nonValidField;
    }

    public static HashMap<String, ArrayList<String>> advancedValidate(Object obj) throws IllegalAccessException {
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        Field[] fields = obj.getClass().getDeclaredFields();

        for (Field field : fields) {
            map.put(field.getName(), new ArrayList<>());
        }

        for (Field field : fields) {
            field.setAccessible(true);
            if (field.isAnnotationPresent(NotNull.class) && (field.get(obj)) == null) {
                map.get(field.getName()).add("can not be null");
            }
            if ((field.isAnnotationPresent(MinLength.class) && field.get(obj) != null)
                    && (field.get(obj).toString().length() < field.getAnnotation(MinLength.class).minLength())) {
                map.get(field.getName()).add("length less than 4");
            }
        }

        for (Field field : fields) {
            map.remove(field.getName(), List.of());
        }
        return map;
    }
}
// END
