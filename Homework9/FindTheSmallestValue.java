package Homework9;

import java.util.Scanner;

public class FindTheSmallestValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of integers you are going to enter:");
        int num = input.nextInt();
        input.nextLine();

        int[] numbers = new int[num];
        for (int c = 0; c < num; c++) {
            System.out.printf("\nEnter the %d of %d number:%n", c + 1, num);
            numbers[c] = input.nextInt();
            input.nextLine();
        }
        int lowest = numbers[0];
        for (int c = 1; c < num; c++) {
            if (lowest > numbers[c])
                lowest = numbers[c];
        }
        System.out.printf("\nThe smallest number is %d%n", lowest);
    }
}