package Homework17;

public class PentagonalNumbers {
    public static void main(String... args) {
        PentagonalNumbersData.getPentagonalNumber(1);
        for (int n = 1; n <= 100; n++) {
            System.out.printf("%-6d", PentagonalNumbersData.getPentagonalNumber(n));
            if (n % 10 == 0) System.out.println();
            n++;
        }
    }
}