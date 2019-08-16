package Homework7;

import java.util.Scanner;

public class InternetServiceProvider {
    private static final int ALL_PACKETS_MIN_HOURS = 0;

    private static final char PACKET_A = 'A';
    private static final int PACKET_A_MAX_HOURS = 10;
    private static final double PACKET_A_10_HOURS_CHARGE = 9.95;
    private static final int PACKET_A_ADDITIONAL_HOUR_CHARGE = 2;

    private static final char PACKET_B = 'B';
    private static final double PACKET_B_20_HOURS_CHARGE = 13.95;

    private static final int PACKET_B_MAX_HOURS = 20;

    private static final char PACKET_C = 'C';
    private static final double PACKET_UNLIMITED_HOURS_CHARGE = 19.95;


    public static void main(String[] args) {
        System.out.println("Package A:\n For $9.95 per month 10 hours of access are provided. Additional hours are 2.00$ per hour");
        System.out.println("Package B:\n For $13.95 per month 20 hours of access are provided. Additional hours are 1.00$ per hour");
        System.out.println("Package C:\n For $19.95 per month unlimited access are provided.");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the service (A,B,C):");
        char n = input.next().charAt(0);
        switch (n) {
            case PACKET_A: {
                System.out.println("Enter the number of hours:");
                int h = input.nextInt();
                if (h > ALL_PACKETS_MIN_HOURS && h <= PACKET_A_MAX_HOURS) {
                    System.out.printf("Payment: %.2f$ per mount\n", PACKET_A_10_HOURS_CHARGE);
                } else {
                    double totalCharges = PACKET_A_10_HOURS_CHARGE + ((h - PACKET_A_MAX_HOURS) * PACKET_A_ADDITIONAL_HOUR_CHARGE);
                    System.out.printf("Payment: %.2f$ per mount\n", totalCharges);
                }
                break;
            }
            case PACKET_B: {
                System.out.println("Enter the number of hours:");
                int h = input.nextInt();
                if (h > ALL_PACKETS_MIN_HOURS && h <= PACKET_B_MAX_HOURS) {
                    double save = (PACKET_A_10_HOURS_CHARGE + PACKET_B_MAX_HOURS) - PACKET_B_20_HOURS_CHARGE;
                    System.out.printf("Payment: %.2f$ per mount\n Saved from Packet A: %.2f$", PACKET_B_20_HOURS_CHARGE, save);
                } else {
                    double totalCharges = PACKET_B_20_HOURS_CHARGE + (h - PACKET_B_MAX_HOURS);
                    double save = ((PACKET_A_10_HOURS_CHARGE + ((h - PACKET_A_MAX_HOURS) * PACKET_A_ADDITIONAL_HOUR_CHARGE)) - PACKET_B_20_HOURS_CHARGE) + (h - PACKET_B_MAX_HOURS);
                    System.out.printf("Payment: %.2f$ per mount\n Saved from Packet A: %.2f$", totalCharges, save);
                }
                break;
            }
            case PACKET_C: {
                System.out.println("Enter the number of hours:");
                int h = input.nextInt();
                double save = (PACKET_B_20_HOURS_CHARGE + (h - PACKET_B_MAX_HOURS)) - PACKET_UNLIMITED_HOURS_CHARGE;
                System.out.printf("Payment: %.2f$ per mount\n Saved from Packet B: %.2f$", PACKET_UNLIMITED_HOURS_CHARGE, save);
            }
            break;
        }
    }
}