package Homework4;

import java.util.Scanner;
class Degrees {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );
        double degrees;
        double minutes;
        double seconds;
        System.out.println("Enter a latitude in degrees, minutes, and seconds:");
        System.out.println("First's, enter the degrees:");
        degrees = input.nextDouble();
        System.out.println("Next, enter the minute of arc:");
        minutes = input.nextDouble();
        System.out.println("Finally, enter the second of arc:");
        seconds = input.nextDouble();
        double SecondsInMinutes = seconds / 60;
        double MinutesInDegrees = ( minutes + SecondsInMinutes ) / 60;
        double TotalDegrees = degrees + MinutesInDegrees;
        System.out.printf("%.0f degrees, %.0f minutes, %.0f second = %.4f degrees\n",degrees,minutes,seconds,TotalDegrees);
        }
}