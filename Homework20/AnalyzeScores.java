package Homework20;

public class AnalyzeScores {
    private static int aboveOrEqual;
    private static int below;
    private static int n;
    private static int average;

    public static void listOfScores(int n) {
        System.out.print("Enter scores: (negative number signifies end): ");

        int[] scores = new int[100];

        int numberOfScores = average = 0;
        for (int i = 0; i < 100; i++) {
            if (n < 0)
                break;

            scores[i] = n;
            average += n;
            numberOfScores++;
        }

        average /= numberOfScores;


        aboveOrEqual = below = 0;
        for (int i = 0; i < numberOfScores; i++) {
            if (scores[i] >= average)
                aboveOrEqual++;
            else
                below++;
        }
        System.out.println("\nAverage of scores: " + average);
    }

    public static void displayResults() {
        System.out.println("Number of scores above or equal to average: " + aboveOrEqual);
        System.out.println("Number of scores below average: " + below);
    }
}

