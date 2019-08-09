package Homework4;

import java.util.Scanner;
class Money {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double $;
        System.out.println("Enter an amount:");
        $ = input.nextLong();
        double percent = 5;
        double tax = $ + $ * (percent / 100);
        System.out.printf("With tax added: %.2f\n", tax);
    }
}