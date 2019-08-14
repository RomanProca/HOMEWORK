package Homework8;

import java.util.Scanner;

public class TypeInNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Insert:");

        boolean running = true;
        int sum = 0;
        for (; running; ) {
            int i = in.nextInt();
            if (i != 0)
                System.out.println("Sum:" + (sum += i));
            else
                running = false;

        }
    }
}