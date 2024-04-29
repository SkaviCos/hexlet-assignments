package exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// BEGIN
public class App {
    public static List<String> buildApartmentsList(List<Home> homes, int n) {
//        homeSort(homes);
        Collections.sort(
                homes,
                Comparator.comparingDouble(Home::getArea)
        );

        List<Home> selectHome = homes.subList(0, Math.min(n, homes.size()));
        List<String> result = new ArrayList<>();
        for (Home home : selectHome) {
            result.add(home.toString());
        }
        return result;

    }
}
// END
