package Homework17;

public class IntegerReversedData {
    private static int reversed = 0;
    public static void reverse(int number){
        for (; number != 0; number /= 10) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
        }
        System.out.println(reversed);
    }
}
