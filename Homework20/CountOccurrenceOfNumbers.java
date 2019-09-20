package Homework20;

public class CountOccurrenceOfNumbers {
    public static void listOfNumbers(int... n) {
        int[] num = new int[100];
        int[] count = new int[100];
        int i, temp;
        System.out.println("Enter the integers between 1 and 100: ");
        for (i = 0; i < num.length; i++) {
            num = n;
            if (num[i] == 0) {
                break;
            }
        }
        for (i = 0; i < num.length; i++) {
            temp = num[i];
            count[temp]++;
        }
        for (i = 1; i < count.length; i++) {

            if (count[i] == 1) {
                System.out.printf("%d occurs %d time\n", i, count[i]);
            } else if (count[i] >= 2) {
                System.out.printf("%d occurs %d times\n", i, count[i]);
            }
        }
    }
}