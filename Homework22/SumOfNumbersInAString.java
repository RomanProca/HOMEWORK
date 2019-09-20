package Homework22;

public class SumOfNumbersInAString {
    public static void sumNumbersSeparatedByCommas(String userNumber) {
        int sum = 0;
        System.out.println("Enter numbers separated by commas: " + userNumber);
        String[] numbers = userNumber.split("[, ]");
        for (String number : numbers) {
            sum += Integer.parseInt(number);
        }
        System.out.println("Sum is: " + sum);
    }
}
