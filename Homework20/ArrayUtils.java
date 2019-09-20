package Homework20;

public class ArrayUtils {
    public int[] addElementsToIntegerArray(int[] array, int elementToAdd) {
        int[] tempArray = new int[array.length + 1];

        for (int i = 0; i < array.length; i++) {
            tempArray[i] = array[i];
        }
        tempArray[array.length] = elementToAdd;
        return tempArray;
    }

    static void printIntegerArrayValues(int[] array) {
        for (int a : array) {
            System.out.print(a + " ");
        }
    }
}
