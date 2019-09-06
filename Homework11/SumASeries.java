package Homework11;


public class SumASeries {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 97; i++)
            for (int j = 3; j <= 99; j++) {
                sum += i / j;
                System.out.printf("%d/%d + ", i, j);
                j++;
                i++;
                i++;
            }
        System.out.println(sum);
    }
}


