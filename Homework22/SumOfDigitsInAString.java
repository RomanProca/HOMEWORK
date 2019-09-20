package Homework22;

public class SumOfDigitsInAString {

    public static void getASumOfDigits(String stringOfDigits) {
        int sum = 0;
        for (int i = 0; i < stringOfDigits.length(); i++) {
            char a = stringOfDigits.charAt(i);
            if (Character.isDigit(a)) {
                int b = Integer.parseInt(String.valueOf(a));
                sum = sum + b;
            }
        }
        System.out.println(sum);
    }
}
