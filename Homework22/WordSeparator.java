package Homework22;

import java.util.Arrays;

public class WordSeparator {
    public static void wordSeparator(String text) {
        String[] separators = text.split("");
        System.out.println(Arrays.toString(separators));
        System.out.println(text);
    }
}
