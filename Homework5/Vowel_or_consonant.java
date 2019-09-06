package Homework5;

import java.util.Scanner;

public class Vowel_or_consonant {
    public static void main(String... args) {
        System.out.println("Enter a letter :");
        Scanner input = new Scanner(System.in);
        char ch = input.next().charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.printf("%c is vowel", ch);
        } else {
            System.out.printf("%c is consonant", ch);
        }
    }
}