package Homework8;

public class TheProductOfOddIntegers {
    public static void main(String[] args) {
        int n = 1;

        for (int x = 1; x <= 15; x++)
            if (x % 2 != 0)
                n *= x;
        System.out.printf("Product is %d\n", n);
    }
}
