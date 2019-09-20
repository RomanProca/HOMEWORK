package Homework21;

import java.util.Scanner;

import Homework13.CountsVowelsAndConsonants;

public class VowelsAndConsonants {
    private static Scanner input = new Scanner(System.in);

    public static void menu() {
        System.out.println("a. Count the number of vowels in the string");
        System.out.println("b. Count the number of consonants in the string");
        System.out.println("c. Count both the vowels and the consonants in the string");
        System.out.println("d. Enter another String");
        System.out.println("e. Exit the program");
    }

    public static void inputMenu() {
        Scanner input = new Scanner(System.in);
        boolean working = true;
        do {
            System.out.println("Enter a string:\n");
            String string = input.nextLine();
            if (string.equals(""))
                string = input.nextLine();
            menu();
            char c = input.next().charAt(0);
            switch (c) {
                case 'a':
                    System.out.println("Vowel: ");
                    System.out.println(CountsVowelsAndConsonants.countVowelLetters(string));
                    break;
                case 'b':
                    System.out.println("Consonant: ");
                    System.out.println(CountsVowelsAndConsonants.countConsonantLetters(string));
                    break;
                case 'c':
                    System.out.println("Vowel: ");
                    System.out.println(CountsVowelsAndConsonants.countVowelLetters(string));
                    System.out.println("Consonant: ");
                    System.out.println(CountsVowelsAndConsonants.countConsonantLetters(string));
                    break;
                case 'd':
                    continue;
                case 'e':
                    working = false;
                    break;
                default:
                    break;
            }
        } while (working);
    }
}
