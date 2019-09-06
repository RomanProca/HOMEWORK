package Homework6;

import java.util.Scanner;

class Phone_key_pads {
    public static void main(String... args) {
        System.out.println("Enter a letter:");
        Scanner input = new Scanner(System.in);
        char ch = input.next().charAt(0);
        if (ch == 'a' || ch == 'b' || ch == 'c' || ch == 'A' || ch == 'B' || ch == 'C') {
            System.out.println("The corresponding number is 2");
        } else if (ch == 'd' || ch == 'e' || ch == 'f' || ch == 'D' || ch == 'E' || ch == 'F') {
            System.out.println("The corresponding number is 3");
        } else if (ch == 'g' || ch == 'h' || ch == 'i' || ch == 'G' || ch == 'H' || ch == 'I') {
            System.out.println("The corresponding number is 4");
        } else if (ch == 'j' || ch == 'k' || ch == 'l' || ch == 'J' || ch == 'K' || ch == 'L') {
            System.out.println("The corresponding number is 5");
        } else if (ch == 'm' || ch == 'n' || ch == 'o' || ch == 'M' || ch == 'N' || ch == 'O') {
            System.out.println("The corresponding number is 6");
        } else if (ch == 'p' || ch == 'q' || ch == 'r' || ch == 's' || ch == 'P' || ch == 'Q' || ch == 'R' || ch == 'S') {
            System.out.println("The corresponding number is 7");
        } else if (ch == 't' || ch == 'u' || ch == 'v' || ch == 'T' || ch == 'U' || ch == 'V') {
            System.out.println("The corresponding number is 8");
        } else if (ch == 'w' || ch == 'x' || ch == 'y' || ch == 'z' || ch == 'W' || ch == 'X' || ch == 'Y' || ch == 'Z') {
            System.out.println("The corresponding number is 9");
        } else
            System.out.println("Enter a LETTER!!!!!!");

    }
}