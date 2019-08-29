package Homework13;


import java.util.Scanner;

public class CountsVowelsAndConsonants {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter a string:");
            String stringToCheck = in.nextLine();

            System.out.println("The number of vowels is " + CountsVowelsAndConsonantsData.countVowelLetters(stringToCheck));
            System.out.println("The number of consonants is " + CountsVowelsAndConsonantsData.countConsonantLetters(stringToCheck));

            System.out.println(CountsVowelsAndConsonantsData.isConsonant('d'));
            System.out.println(CountsVowelsAndConsonantsData.isConsonant('e'));

            System.out.println(CountsVowelsAndConsonantsData.isVowel('d'));
            System.out.println(CountsVowelsAndConsonantsData.isVowel('e'));
        }
    }
