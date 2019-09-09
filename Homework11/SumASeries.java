package Homework11;


public class SumASeries {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 97; i++) {
            sum += i / (i + 2);
            System.out.printf("%d/%d + ", i, i + 2);
            i++;
        }
        System.out.println("\n" + sum);
    }
}

