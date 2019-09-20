package Homework21;

import java.util.Scanner;

public class VowelsAndConsonantsDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Please input your word: ");
        String word = in.nextLine();
        StringWrapper wrappedString = new StringWrapper(word);

        boolean isRunning = true;

        while (isRunning) {
            showMenu(word);
            System.out.println("Your choice: ");
            String choice = in.nextLine().toLowerCase();
            switch (choice) {
                case "a":
                    System.out.println("Number of vowels is " + wrappedString.getNumberOfVowels());
                    break;
                case "b":
                    System.out.println("Number of consonants is " + wrappedString.getNumberOfConsonants());
                    break;
                case "c":
                    System.out.println("Number of vowels and consonants is " +
                            (wrappedString.getNumberOfVowels() + wrappedString.getNumberOfVowels()));
                    break;
                case "d":
                    System.out.println("Please input another word");
                    word = in.nextLine();
                    wrappedString = new StringWrapper(word);
                    break;
                case "e":
                    isRunning = false;
                    break;
                default:
                    System.out.println("A wrong value has been inserted. Please try again!");
            }
        }
    }

    static void showMenu(String word) {
        System.out.println("=====================");
        System.out.println("<< MENU >>");
        System.out.println("Current string is <<" + word + ">>");
        System.out.println("a. Count the number of vowels in the string. ");
        System.out.println("b. Count the number of consonants in the string.");
        System.out.println("c. Count both the number of consonants and vowels in the string.");
        System.out.println("d. Enter another string.");
        System.out.println("e. Exit the program");
    }
}

