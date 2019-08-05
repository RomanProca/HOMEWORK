import java.util.Scanner;
class E232 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insert 5 numbers:");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        int e = input.nextInt();
        int countOfPositiveIntegers = 0;
        int countOfNegativeIntegers = 0;
        int zero = 0;
        if (a > 0) {
            countOfPositiveIntegers++;
        } else if (a != 0) {
            countOfNegativeIntegers++;
        } else {
            zero++;
        }
        if (b > 0) {
            countOfPositiveIntegers++;
        } else if (b != 0) {
            countOfNegativeIntegers++;
        } else {
            zero++;
        }
        if (c > 0) {
            countOfPositiveIntegers++;
        } else if (c != 0) {
            countOfNegativeIntegers++;
        } else {
            zero++;
        }
        if (d > 0) {
            countOfPositiveIntegers++;
        } else if (d != 0) {
            countOfNegativeIntegers++;
        } else {
            zero++;
        }
        if (e > 0) {
            countOfPositiveIntegers++;
        } else if (e != 0) {
            countOfNegativeIntegers++;
        } else {
            zero++;
        }
        System.out.printf("Positive: %d\n", countOfPositiveIntegers);
        System.out.printf("Negative: %d\n", countOfNegativeIntegers);
        System.out.printf("Zero: %d\n", zero);
    }
}
