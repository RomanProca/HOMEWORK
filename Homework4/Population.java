package Homework4;

import java.util.Scanner;

class Population {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long wp;
        System.out.println("Enter the world's population:");
        wp = input.nextLong();
        long usp;
        System.out.println("Enter the population of the US:");
        usp = input.nextLong();
        double percent = (double) usp / wp * 100;
        System.out.printf("The population of the US in %.5f%% of the world\n", percent);
    }
}