package Homework13;

public class DiceGameTest {
    public static void main(String[] args) {
        DiceGame diceGame = new DiceGame();
        diceGame.printResults();
        diceGame.startPlaying(20);
        diceGame.printResults();
        diceGame.printResults();
        diceGame.printScores();
        diceGame.startPlaying(25);
    }
}

