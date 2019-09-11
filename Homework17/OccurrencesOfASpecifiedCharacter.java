package Homework17;

public class OccurrencesOfASpecifiedCharacter {
    public static int count(String str, char a) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (a == str.charAt(i))
                count++;
        }
        return count;
    }

    public static String string(String str) {
        return str;
    }
}