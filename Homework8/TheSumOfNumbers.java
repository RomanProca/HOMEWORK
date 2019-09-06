package Homework8;

import java.util.Scanner;

public class TheSumOfNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insert min number:");
        int a = input.nextInt();
        System.out.println("Insert max number:");
        int b = input.nextInt();
        int sum = 0;
        for (int i = a; i <= b; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
