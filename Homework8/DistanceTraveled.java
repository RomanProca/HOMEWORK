package Homework8;

import java.util.Scanner;

public class DistanceTraveled {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the speed of a vehicle(m/h):");
        int speed = input.nextInt();
        System.out.println("Enter the hours vehicle traveled:");
        int hours = input.nextInt();
        System.out.printf("%-5s%10s\n", "Hours", "Distance");
        System.out.println("---------------");
        for (int i = 1; i <= hours; i++) {
            int distance = speed * i;
            System.out.printf("%2d %8d \n", i, distance);

        }
    }
}