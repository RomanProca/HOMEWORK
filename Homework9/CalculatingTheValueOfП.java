package Homework9;

public class CalculatingTheValueOfП {
    public static double piValue() {
        double pi = 4.0;
        double computedValue = 0;
        for (int i = 0, j = 3; i < 200000; i++, j += 2) {
            if (i % 2 == 0)
                computedValue += 4.0 / j;
            else
                computedValue -= 4.0 / j;
        }
        return pi - computedValue;
    }
}