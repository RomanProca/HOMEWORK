package Homework7;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input month number(1-12):");
        int n = input.nextInt();
        switch (n) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Total number of days = 31");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Total number of days = 30");
                break;
            case 2: {
                System.out.println("Total number of days = 28 (29 in leap years)");
            }
            break;
            default: {
                System.out.println("Wrong Input");
            }
        }
    }
}
