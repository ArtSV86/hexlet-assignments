package exercise;

import java.util.Arrays;

// BEGIN
public class App {
    public static String[][] enlargeArrayImage(String[][] image) {

        String[][] b = new String[(image.length)*2][];
        for (int i = 0; i < image.length; i++) {
            String[] temp = new String[(image[i].length) * 2];
            System.out.println(temp);

            for (int j = 0; j < image[i].length; j++) {
                temp[j * 2] = image[i][j];
                if (j < (image[i].length) * 2) {
                    temp[j * 2 + 1] = image[i][j];
                }
            }
            b[i * 2] = temp;
            if (i < image.length) {
                b[i * 2 + 1] = temp;
            }
        }
        System.out.println(b);
        return b;

    }
}
// END
