package Homework15;

import java.util.Random;

class CrapsGameData {
    void startCrapsGame() {
        Random r = new Random();
        do {
            int dice1 = r.nextInt(6) + 1;
            int dice2 = r.nextInt(6) + 1;
            int score = dice1 + dice2;
            System.out.println("You rolled " + dice1 + " + " + dice2 + " = " + score);

            if (score == 7 || score == 11) {
                System.out.println("You win");
                break;
            } else if (score == 2 || score == 3 || score == 12) {
                System.out.println("You lose");
                break;
            } else
                System.out.println("Point is " + score);
        } while (true);
    }
}