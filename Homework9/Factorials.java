package Homework9;

import java.util.Scanner;

public class Factorials {
    public static void main(String[] args) {
        System.out.println("Enter a value: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        long factorial = 1;
        System.out.printf("%5s%10s\n", "factorial", "value");
        for (int i = 1; i <= n; i++) {
            factorial *= i;
            System.out.printf("%d! %15d \n", i, factorial);
        }
    }
}
