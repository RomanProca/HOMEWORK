package Homework5;

import java.util.Scanner;

class E232v2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Insert 5 numbers:");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        int e = in.nextInt();
        Integer countOfPositiveIntegers = 0;
        Integer countOfNegativeIntegers = 0;
        Integer countOfZero = 0;
        if (a > 0) {
            countOfPositiveIntegers++;
        } else if (a < 0) {
            countOfNegativeIntegers++;
        } else {
            countOfZero++;
        }
        if (b > 0) {
            countOfPositiveIntegers++;
        } else if (b < 0) {
            countOfNegativeIntegers++;
        } else {
            countOfZero++;
        }
        if (c > 0) {
            countOfPositiveIntegers++;
        } else if (c < 0) {
            countOfNegativeIntegers++;
        } else {
            countOfZero++;
        }
        if (d > 0) {
            countOfPositiveIntegers++;
        } else if (d < 0) {
            countOfNegativeIntegers++;
        } else {
            countOfZero++;
        }
        if (e > 0) {
            countOfPositiveIntegers++;
        } else if (e < 0) {
            countOfNegativeIntegers++;
        } else {
            countOfZero++;
        }
        System.out.printf("Positive: %d\n", countOfPositiveIntegers);
        System.out.printf("Negative: %d\n", countOfNegativeIntegers);
        System.out.printf("Zero: %d\n", countOfZero);
    }
}
