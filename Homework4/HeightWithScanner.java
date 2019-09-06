package Homework4;

import java.util.Scanner;

class HeightWithScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double userHeight;
        System.out.println("What is your height?(cm)");//813
        userHeight = input.nextDouble();
        double inches = userHeight * 0.3937;
        int intPart = (int) inches;
        double feet = intPart / 12;
        double rest = intPart - feet * 12;
        System.out.printf("Your height in integer inches is %d\n", intPart);
        System.out.printf("Height in integer inches converted to feet and inches: %.1f feet and %.1f inch\n", feet, rest);
    }
}
