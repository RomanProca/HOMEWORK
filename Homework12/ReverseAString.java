package Homework12;

import java.util.Scanner;

public class ReverseAString {
    public static void main(String[] args)
    {
        System.out.println("Enter string to reverse:");

        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        StringBuilder sb = new StringBuilder(str);

        System.out.println("Reversed string is:");
        System.out.println(sb.reverse().toString());
    }
}

