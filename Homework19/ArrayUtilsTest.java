package Homework19;

public class ArrayUtilsTest {
    public static void main(String[] args) {
        int[] arrayOfNumbers = new int[17];
        ArrayUtils.initializeElementsFiveByFive(arrayOfNumbers, 8);

        for (int number : arrayOfNumbers) {
            System.out.print(number + " ");
        }
    }
}
