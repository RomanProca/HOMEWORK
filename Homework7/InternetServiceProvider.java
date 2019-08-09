package Homework7;

import java.util.Scanner;

public class InternetServiceProvider {
    public static void main(String[] args) {
        System.out.println("Package A:\n For $9.95 per month 10 hours of access are provided. Additional hours are 2.00$ per hour");
        System.out.println("Package B:\n For $13.95 per month 20 hours of access are provided. Additional hours are 1.00$ per hour");
        System.out.println("Package C:\n For $19.95 per month unlimited access are provided.");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the service (A,B,C):");
        char n = input.next().charAt(0);
        switch (n) {
            case 'A': {
                System.out.println("Enter the number of hours:");
                int h = input.nextInt();
                if (h > 0 && h <= 10) {
                    double totalCharges = 9.55;
                    System.out.printf("%.2f$ per mount", totalCharges);
                } else {
                    double totalCharges = 9.95 + (h - 10) * 2;
                    System.out.printf("%.2f$ per mount", totalCharges);
                }
                break;
            }
            case 'B': {
                System.out.println("Enter the number of hours:");
                int h = input.nextInt();
                if (h > 0 && h <= 20) {
                    double totalCharges = 13.95;
                    double save = 9.55 + 20 - 13.95;
                    System.out.printf("%.2f$ per mount and saved %.2f$", totalCharges,save);
                } else {
                    double totalCharges = 13.95 + (h - 20);
                    double save = 9.95 + (h - 10) * 2  -  13.95 + (h - 20);
                    System.out.printf("%.2f$ per mount and saved %.2f$", totalCharges,save);
                }
                break;
            }
            case 'C': {
                System.out.println("Enter the number of hours:");
                int h = input.nextInt();
                double totalCharges = 19.95;
                double save =13.95 + (h - 20) - 19.95;
                System.out.printf("%.2f$ per mount and saved %.2f$", totalCharges,save);
            }
            break;
        }
    }
}