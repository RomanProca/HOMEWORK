package Homework7;

import java.util.Scanner;

public class SwitchVowelOrConsonant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input alphabet:");
        char n = input.next().charAt(0);
        switch (n) {
            case 'a':
            case 'A':
            case 'e':
            case 'E':
            case 'i':
            case 'I':
            case 'o':
            case 'O':
            case 'u':
            case 'U':
                System.out.printf("%c is vowel\n", n);
            default:
                System.out.printf("%c is consonant\n", n);
        }
    }
}
