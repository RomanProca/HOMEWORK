package Homework5;

import java.util.Scanner;
class Fahrenheit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a degree in Celsius:");
        Double c = input.nextDouble();
        double f = (9.0 / 5.0) * c + 32;
        System.out.printf("%.0f Celsius is %.1f Fahrenheit\n", c, f);
    }
}