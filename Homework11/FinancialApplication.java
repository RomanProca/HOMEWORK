package Homework11;

import java.util.Scanner;

public class FinancialApplication {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double annualInterestRate = 5.000;
        System.out.println("Loan amount: ");
        int loanAmount = input.nextInt();

        System.out.print("Number of Years: ");
        int numberOfYears = input.nextInt();

        System.out.printf("%-1s%20s%20s\n", "Interest Rate", "Monthly Payment", "Total Payment");

        for (double i = annualInterestRate; i <= 8.000; i += 0.125) {

            double monthlyInterestRate = i / 1200;
            double monthlyPayment = loanAmount + (monthlyInterestRate / (1 - (1 / Math.pow(monthlyInterestRate, numberOfYears * 12))));
            double totalPayment = monthlyPayment * numberOfYears * 12;

            System.out.printf("%-1.3f%s%17.2f%24.2f \n", annualInterestRate, "%", (int) (monthlyPayment * 100) / 100.0, (int) (totalPayment * 100) / 100.0);
            System.out.println(monthlyInterestRate);
        }
    }
}
