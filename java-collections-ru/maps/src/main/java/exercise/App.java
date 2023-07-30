package exercise;

import java.util.*;

//BEGIN

public class App {
    public static Map getWordCount(String sentence) {
        if (sentence.equals("")) {
            Map<String, Integer> data = Collections.emptyMap();
            return data;
        }
        String[] words = sentence.split(" ");
        int wordsLength = words.length;
        List<String> listOfWords = new ArrayList<>();
        for (int j = 0; j < wordsLength; j++) {
            listOfWords.add(words[j]);
        }

        Map<String, Integer> sortedMap = new HashMap<>();

        for (int i = 0; i < listOfWords.size(); i++) {
            String word = listOfWords.get(i);
            sortedMap.put(word, sortedMap.get(word) == null ? 1 : sortedMap.get(word) + 1);
        }
        return sortedMap;
    }

    public static String toString(Map sortedMap) {
        String str = "  {";
        if (sortedMap.equals(Collections.emptyMap())) {
            str = "{}";
            return str;
        }


        for (Object key : sortedMap.keySet()) {
            Object value = sortedMap.get(key);
            str = str + "\n" + "  " + key + ": " + value;
        }
        str = str + "\n" + "}";
        return str;
    }
}
//END
