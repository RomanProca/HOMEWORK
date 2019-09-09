package Homework11;

public class ComputePI {
    public static void main(String[] args) {
        int pi1 = 0;
        int pi2 = 0;
        int pi3 = 0;
        int series = 0;
        for (int i = 1; i <= 10000; i++) {
            series += (Math.pow((-1), i + 1)) / (2 * i - 1);
        }
        pi1 = 4 * series;
        System.out.println(pi1);
        for (int i = 1; i <= 20000; i++) {
            series += (Math.pow((-1), i + 1)) / (2 * i - 1);
        }
        pi2 = 4 * series;
        System.out.println(pi2);
        for (int i = 1; i <= 100000; i++) {
            series += (Math.pow((-1), i + 1)) / (2 * i - 1);
        }
        pi3 = 4 * series;
        System.out.println(pi3);
    }
}
