package Homework7;

import java.util.Scanner;

public class TheSpeedOfSound {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter (air,water or steel):");
        String n = input.nextLine();
        System.out.println("Enter a distance");
        Double distance = input.nextDouble();
        switch (n) {
            case "air": {
                System.out.println("Air:");
                System.out.println("Speed: 1,100 feet per seconds");
                System.out.printf("Distance: %.2f\n", distance);
                double time = distance / 1.100;
                System.out.println("Time" + " " + time + " " + "seconds");
                break;
            }
            case "water": {
                System.out.println("Water:");
                System.out.println("Speed: 4,900 feet per seconds");
                System.out.printf("Distance: %.2f\n", distance);
                double time = distance / 4.900;
                System.out.println("Time" + " " + time + " " + "seconds");
                break;
            }
            case "steel": {
                System.out.println("Steel:");
                System.out.println("Speed: 16,400 feet per seconds");
                System.out.printf("Distance: %.2f\n", distance);
                double time = distance / 16.400;
                System.out.println("Time" + " " + time + " " + "seconds");
                break;
            }
            default:
                System.out.println("Error");
                break;
        }
    }
}

