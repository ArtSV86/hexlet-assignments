package exercise;


import java.util.List;
import java.util.stream.Collectors;


// BEGIN
public class App {
    public static Integer getCountOfFreeEmails(List<String> listOfEmails) {
        List<String> listOfFreeEmails = listOfEmails.stream()
                .filter( s -> s.contains("@gmail.com") || s.contains("@yandex.ru") || s.contains("@hotmail.com") )
                .collect(Collectors.toList());

        return listOfFreeEmails.size();
    }

}

// END
