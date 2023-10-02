package exercise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;



// BEGIN
public class App {
    public static List<String> buildApartmentsList(List<Home> apartments, int count) {
//        List<Home> sortedList = apartments.stream()
        return apartments.stream()
                .sorted(Home::compareTo)
                .limit(count)
                .map(Home::toString)
                .collect(Collectors.toList());
    }
}
// END
