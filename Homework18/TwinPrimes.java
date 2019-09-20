package Homework18;

public class TwinPrimes {
    public static void displayTwinPrimes(int n) {
        for (int i = 1; i < n; i++) {
            if (isPrime(i) && isPrime(i + 2)) {
                System.out.printf("(%d, %d)\n", i, i + 2);
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
}
