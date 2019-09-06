package Homework9;

import java.util.Scanner;

public class BarChartPrintingProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 5 values form 1 to 10:");
        int v = input.nextInt();
        for (int i = 0; i < v; i++) {
            System.out.println("Enter values:");
            int n = input.nextInt();
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
        }
    }
}
