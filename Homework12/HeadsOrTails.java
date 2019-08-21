package Homework12;

public class HeadsOrTails {
    public static void main(String[] args) {
        int heads = 0;
        int tails = 0;
        for(int x=0;x<1000000;x++){
            if (Math.random() < 0.5) {
                tails = tails +1;
            } else {
                heads = heads +1;
            }
        }
        System.out.printf("Heads total: %d%n", heads);
        System.out.printf("Tails total: %d%n", tails);
    }
}
