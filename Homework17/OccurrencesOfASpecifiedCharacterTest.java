package Homework17;

import java.util.Scanner;

public class OccurrencesOfASpecifiedCharacterTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string followed by a character: ");
        String string = input.nextLine();

        int k = string.indexOf(", ");
        String str = string.substring(0, k);
        char ch = string.charAt(k + 2);

        System.out.println("The number of occurrences of \"" + ch + "\" in \'" + str + "\" is: " + OccurrencesOfASpecifiedCharacter.count(str, ch));
    }
}
