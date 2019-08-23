package Homework12;

import java.util.Scanner;

public class BusinessCheck_ISBN13 {
    public static void main(String[] args) {
        System.out.println("Enter the first 12 digits of an ISBN-13 as a string:");
        Scanner in = new Scanner(System.in);

        String str = in.nextLine();//978013213080
        int odd = 0;
        int even = 0;
        if (str.length() == 12) {
            char[] c = (str + "00").replaceAll("[\\-]", "").toCharArray();
            for (int i = 0; i < (c.length - 1) / 2; ++i) {
                odd += c[2 * i] - 48;
                even += c[2 * i + 1] - 48;
            }
            int result = 10 - (odd + 3 * even) % 10;
            if (result == 10)
                result = 0;
            System.out.printf("The ISBN-13 number is %s%d%n", str, result);
        } else {
            System.out.printf("%s is an invalid input%n", str);
        }

    }
}
//return type
//return statement
//parameters