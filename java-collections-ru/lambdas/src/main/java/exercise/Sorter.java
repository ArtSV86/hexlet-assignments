package exercise;

import java.time.format.DateTimeFormatter;
import java.util.*;
import java.time.LocalDate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// BEGIN
public class Sorter {
    public static List<String> takeOldestMans(List<Map<String, String>> users) {
        Comparator<Map<String, String>> orderByBirthdate = Comparator.comparing(
                user -> LocalDate.parse(user.get("birthday"))
        );

        Stream<Map<String, String>> sorted = users.stream()
                .sorted(orderByBirthdate);


        List<String> names = sorted
                .filter(user -> user.get("gender").equals("male"))
                .map(user -> user.get("name")).collect(Collectors.toList());

        return names;
    }
}
// END
