package Homework11;

public class CancellationErrors {
    public static void main(String[] args) {
        double number1 = 100000000.0 + 0.000000001;
        System.out.println(number1);
        int number2 = 0;
        for (int n = 1; n <= 50000; n++) {
            number2 += n;
        }
        System.out.println(number2);
    }
}
