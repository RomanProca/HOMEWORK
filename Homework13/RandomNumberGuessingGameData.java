package Homework13;

import java.util.Scanner;

class RandomNumberGuessingGameData {

    private int numberFromUser = 0;
    private int numberOfTries = 10;
    private Scanner s = new Scanner(System.in);

    void startNumberGuessingGame(int numberToGuess) {
        System.out.println("Computer made his choice! [?]");
        do {
            System.out.println("Enter your guess (0 - 99) > ");
            int numberFromUser = s.nextInt();
             if (numberFromUser > numberToGuess)
                 System.out.println("Too high!");
             else if (numberFromUser < numberToGuess)
                 System.out.println("Too low!");
             numberOfTries--;
             if (numberOfTries <= 0)
                 break;
         } while (numberToGuess != numberFromUser);
     }
    void resultsNumberGuessingGame(){
        int numberToGuess = -1;
        if (numberToGuess == numberFromUser)
            System.out.println("Hooray, you got it! [" + numberToGuess + "]");
        else
            System.out.println("Ooops, you did not get it... Better luck next time :( [?]");
    }
}
