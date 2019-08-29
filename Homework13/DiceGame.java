package Homework13;

public class DiceGame {
    public static void main(String[] args) {
        DiceGameData diceGameData = new DiceGameData();
        diceGameData.printResults();
        diceGameData.startPlaying(20);
        diceGameData.printResults();
        diceGameData.printResults();
        diceGameData.printScores();
        diceGameData.startPlaying(25);
    }
}

