package Homework17;

public class PentagonalNumbersTest {
    public static void main(String... args) {
        PentagonalNumbers.getPentagonalNumber(1);
        for (int n = 1; n <= 100; n++) {
            System.out.printf("%-6d", PentagonalNumbers.getPentagonalNumber(n));
            if (n % 10 == 0) System.out.println();
            n++;
        }
    }
}