package Homework4;

import java.util.Scanner;

class Balance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter amount of loan:");
        double loan = input.nextDouble();
        System.out.println("Enter interest rate:");
        double interest = input.nextDouble();
        System.out.println("Enter monthly payment:");
        double payment = input.nextDouble();
        double first = loan - payment;
        double second = first - payment - payment * (interest / 100);
        double third = second - payment - (payment * (interest / 100));
        System.out.printf("Balance remaining after first payment: %.2f\n", first);
        System.out.printf("Balance remaining after second payment: %.2f\n", second);
        System.out.printf("Balance remaining after third payment: %.2f\n", third);
    }
}


