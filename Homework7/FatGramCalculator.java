package Homework7;

import java.util.Scanner;

public class FatGramCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number of calories and fat grams in a food item:");
        double calories = input.nextDouble();
        double fatGrams = input.nextDouble();
        double caloriesFromFat = fatGrams * 9;
        double percent = caloriesFromFat / calories;
        System.out.println(percent + " " + "%%");
        if (percent < 30) {
            System.out.println("Food is low in fat");
        }
    }
}

