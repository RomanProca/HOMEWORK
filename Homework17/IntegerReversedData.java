package Homework17;

public class IntegerReversedData {
    public static void reverseVoid(int number) {
        long reverse = 0;
        while (number != 0) {
            reverse *= 10;
            reverse += number % 10;
            number /= 10;
        }
        System.out.println(reverse);
    }

    public static long reverse(long number) {
        long reverse = 0;
        while (number != 0) {
            reverse *= 10;
            reverse += number % 10;
            number /= 10;
        }
        return reverse;
    }
}

