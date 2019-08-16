package Homework5;

import java.util.Scanner;

import static java.lang.System.out;

class Cylinder {
    public static void main(String[] args) {
        double r;
        double l;
        try (Scanner input = new Scanner(System.in)) {
            out.println("Enter the radius and length of a cylinder:");
            r = input.nextDouble();
            l = input.nextDouble();
        }
        double pi = 3.14159;
        double a = r * r * pi;
        double v = a * l;
        out.printf("The area is %.4f\n", a);
        out.printf("The volume is %.1f\n", v);
    }
}