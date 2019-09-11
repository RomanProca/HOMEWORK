package Homework18;


public class FormatAnInteger {
    public static String format(int number, int width) {
        String zero = " ";
        int numberOfDigits = 0;
        for (int j = 1; j < number; j *= 10) {
            numberOfDigits++;
        }
        for (int i = 0; i < width - numberOfDigits; i++) {
            zero += "0";
        }
        return zero + number;
    }
}
