package Homework5;

import java.util.Scanner;
class AsciiCode {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ASCII code:");
        int code = input.nextInt();
        char character = (char) code;
        System.out.printf("The character for ASCII code %d is %c\n",code,character);
    }
}