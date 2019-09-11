package Homework13;


import java.util.Scanner;

public class CountsVowelsAndConsonantsTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string:");
        String stringToCheck = in.nextLine();

        System.out.println("The number of vowels is " + CountsVowelsAndConsonants.countVowelLetters(stringToCheck));
        System.out.println("The number of consonants is " + CountsVowelsAndConsonants.countConsonantLetters(stringToCheck));

        System.out.println(CountsVowelsAndConsonants.isConsonant('d'));
        System.out.println(CountsVowelsAndConsonants.isConsonant('e'));

        System.out.println(CountsVowelsAndConsonants.isVowel('d'));
        System.out.println(CountsVowelsAndConsonants.isVowel('e'));
    }
}
