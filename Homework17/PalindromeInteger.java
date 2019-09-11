package Homework17;

public class PalindromeInteger {
    private static int reversed = 0;

    public static int reverse(int number) {
        for (; number != 0; number /= 10) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
        }
        return reversed;
    }

    public static boolean isPalindrome(int number) {
        reversed = reverse(number);
        return reversed == reverse(reversed);
    }
}