package Classwork;

import java.util.Random;

public class CrapsGame2 {

    private int firstDiceRolledResult;
    private int secondDiceRolledResult;
    private int establishedPoint;
    private int sumOfRolledDices;
    private Random r = new Random();

    public void play() {
        throwAHandOfDices();
        if (isCraps()) {
            printMessagesWithScores("You lose");
        } else if (isNatural()) {
            printMessagesWithScores("You win");
        } else {
            establishedPoint = sumOfRolledDices;
            printMessagesWithScores("Point is " + establishedPoint);
            continueThrowing();
        }
        reset();
    }

    private void continueThrowing() {
        boolean conditionIsMet;
        do {
            throwAHandOfDices();
            if (isSevenOut()) {
                printMessagesWithScores("You lose");
                conditionIsMet = true;
            } else if (isTheSamePoint()) {
                printMessagesWithScores("You win");
                conditionIsMet = true;
            } else {
                conditionIsMet = false;
            }
        } while (!conditionIsMet);
    }

    private void throwAHandOfDices() {
        firstDiceRolledResult = rollADice();
        secondDiceRolledResult = rollADice();
        sumOfRolledDices = firstDiceRolledResult + secondDiceRolledResult;
    }

    private int rollADice() {
        return r.nextInt(6) + 1;
    }

    private boolean isCraps() {
        return sumOfRolledDices == 2 || sumOfRolledDices == 3 || sumOfRolledDices == 12;
    }

    private boolean isNatural() {
        return sumOfRolledDices == 7 || sumOfRolledDices == 11;
    }

    private boolean isTheSamePoint() {
        return establishedPoint == sumOfRolledDices;
    }

    private boolean isSevenOut() {
        return sumOfRolledDices == 7;
    }

    private void printRolledResults() {
        System.out.println("You rolled " + firstDiceRolledResult + " + " + secondDiceRolledResult + " = " + sumOfRolledDices);
    }

    private void printMessagesWithScores(String message) {
        printRolledResults();
        System.out.println(message);
    }

    public void reset() {
        firstDiceRolledResult = 0;
        secondDiceRolledResult = 0;
        establishedPoint = 0;
        sumOfRolledDices = 0;
    }
}
