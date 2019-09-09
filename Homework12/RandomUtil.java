package Homework12;

import java.util.Random;

public class RandomUtil {
    public static void main(String[] args) {
        Random r = new Random();
        int n = r.nextInt(50);
        n += 1;
        System.out.println("First solution result: " + n);
        double random = Math.random() * 49 + 1;
        System.out.println("Second solution result: " + random);
        int rand = (int) (Math.random() * 50 + 1);
        System.out.println("Third solution result: " + rand);
    }
}
