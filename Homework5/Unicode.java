package Homework5;

import java.util.Scanner;

class Unicode{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ASCII code:");
        char ch = input.next().charAt(0);
        int code = (int) ch;
        System.out.printf("The Unicode for character %c is %d\n",ch,code);
    }
}
