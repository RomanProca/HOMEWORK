package Homework20;

public class ReverseTheNumberEntered {
    public static void tenIntegers(int... n) {

        System.out.print("Enter ten integers: ");

        for (int i = n.length - 1; i >= 0; i--)
            System.out.print(n[i] + " ");
        System.out.println();
    }
}
