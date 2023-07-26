package exercise;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

// BEGIN
public class App {

    public static boolean scrabble(String text, String word) {
        int counter = 0;
        if ((text.length() < word.length()) || text.length() == 0 || word.length() == 0) {
            return false;
        }

        var textLowerCase = text.toLowerCase();
        var wordLowerCase = word.toLowerCase();
        List<Character> textCharList = new ArrayList<>();
        for (char cText : textLowerCase.toCharArray()) {
            textCharList.add(cText);
        }

        List<Character> wordCharList = new ArrayList<>();
        for (char cWord : wordLowerCase.toCharArray()) {
            wordCharList.add(cWord);
        }
        for (int i = 0; i < word.length(); i++) {

            if (textCharList.contains(wordCharList.get(i))) {
                textCharList.remove(wordCharList.get(i));
                counter++;
            }
        }
        return word.length() == counter;

    }

}

//END
