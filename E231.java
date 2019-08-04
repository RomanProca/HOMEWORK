import java.io.PrintStream;

public class E231 {
    public static void main(String[] args) {
        PrintStream out = System.out;
        out.printf("%-10s%3$-10s%1$-10s\n", "numbers", "square", "cube");
        out.printf("%-10d%-10d%-10d\n", 1, 1, 1);
        out.printf("%-10d%-10d%-10d\n", 2, 2 * 2, 2 * 2 * 2);
        out.printf("%-10d%-10.0f%-10.0f\n", 3, Math.pow(3, 2), Math.pow(3, 3));
        out.printf("%-10d%-10.0f%-10.0f\n", 4, Math.pow(4, 2), Math.pow(4, 3));
    }
}