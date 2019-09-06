package Homework17;

class SumTheDigitsInAnIntegerData {
    private static int sum = 0;

    public static int sumDigits(long n) {
        for (int i = 1; i <= 100000000; i = i * 10) {
            int a = (int) (n / i) % 10;
            sum += a;
        }
        return sum;
    }

    public static void reset() {
        sum = 0;
    }

}
