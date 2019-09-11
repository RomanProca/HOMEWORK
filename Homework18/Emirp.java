package Homework18;

import Homework17.IntegerReversedData;

public class Emirp {
    public static void displayEmirp() {

        int count = 0;
        for (int i = 10; count < 100; i++) {
            if (isPrime(i) && isPrime(IntegerReversedData.reverse(i)) && !isPalindrome(i)) {
                System.out.printf("%10d", i);
                count++;
                if (count % 10 == 0 && i != 0) System.out.println();
            }
        }
    }

    public static boolean isPrime(long n) {

        if (n < 2) return false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static boolean isPalindrome(long number) {
        return (number == IntegerReversedData.reverse(number));
    }
}
