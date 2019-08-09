package Homework4;

import java.util.Scanner;
class SecondsV2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long n;
        System.out.println("Enter the number of seconds:");
        n = input.nextLong();
        long day =(int) n / (24 * 3600);

        n = n % (24 * 3600);
        long hour = (int) n / 3600;

        n %= 3600;
        long minutes = (int) n / 60;

        n %= 60;
        long seconds = n;

        System.out.println(day + " " + "days " + hour + " " + "hours " + minutes + " " + "minutes " + seconds + " " + "seconds ");
    }
}