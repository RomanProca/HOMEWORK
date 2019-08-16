package Homework7;

import java.util.Scanner;

import static java.lang.System.out;

public class TheSpeedOfSound {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        out.println("Enter (air,water or steel):");
        String n = input.nextLine();
        out.println("Enter a distance");
        Double distance = input.nextDouble();
        double time;

        switch (n) {
            case "air":
                out.println("Air:");
                out.println("Speed: 1,100 feet per seconds");
                out.printf("Distance: %.2f\n", distance);
                time = distance / 1.100;
                out.printf("Time %s seconds%n", time);
                break;

            case "water":
                out.println("Water:");
                out.println("Speed: 4,900 feet per seconds");
                out.printf("Distance: %.2f\n", distance);
                time = distance / 4.900;
                out.printf("Time %s seconds%n", time);
                break;

            case "steel":
                out.println("Steel:");
                out.println("Speed: 16,400 feet per seconds");
                out.printf("Distance: %.2f\n", distance);
                time = distance / 16.400;
                out.printf("Time %s seconds%n", time);
                break;

            default:
                out.println("Error");
                break;
        }
    }
}

