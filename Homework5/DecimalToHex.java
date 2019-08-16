package Homework5;

import java.util.Scanner;

public class DecimalToHex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a decimal value (0 to 15): ");
        int decimal = input.nextInt();


        if (decimal <= 15 && decimal  >= 10) {
            int value = ('A' + decimal - 10);
            System.out.printf("The hex value is %s%n", (char) value);
        }

        else if (decimal  <= 10 && decimal  >= 0) {
            System.out.printf("The hex value is %d%n", decimal);
        }

        else {
            System.out.printf("%d is an invalid input.%n", decimal);
        }
    }
}