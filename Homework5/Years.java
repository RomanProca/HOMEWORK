package Homework5;

import java.util.Scanner;

class Years {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long n;
        System.out.println("Enter the number of minutes:");
        n = input.nextLong();//1000000000
        long minutes = n;
        long years = (int) n / (365 * 1440);
        n = n % (365 * 1440);
        long days = (int) n / 1440;
        System.out.println(minutes + " " + "minutes is approximately " + years + " " + "years and" + " " + days + " " + "days");
    }
}