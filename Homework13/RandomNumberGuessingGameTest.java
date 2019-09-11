package Homework13;

import java.util.Random;
import java.util.Scanner;

public class RandomNumberGuessingGameTest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        RandomNumberGuessingGame rnggd = new RandomNumberGuessingGame();
        rnggd.startNumberGuessingGame(r.nextInt(99));
        rnggd.resultsNumberGuessingGame();
    }
}
