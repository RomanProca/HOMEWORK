package Homework21;

public class WordCounter {
    public static int countWordsUsingSplit(String word) {
        if (word == null || word.isEmpty()) {
            return 0;
        }
        String[] words = word.split("\\s+");
        return words.length;
    }
}
