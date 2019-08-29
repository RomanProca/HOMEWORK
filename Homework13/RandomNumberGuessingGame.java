package Homework13;

import java.util.Random;
import java.util.Scanner;

public class RandomNumberGuessingGame {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
    RandomNumberGuessingGameData rnggd = new RandomNumberGuessingGameData();
    rnggd.startNumberGuessingGame(r.nextInt(99));
    rnggd.resultsNumberGuessingGame();
    }
}
