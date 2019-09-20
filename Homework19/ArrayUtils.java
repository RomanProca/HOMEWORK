package Homework19;

public class ArrayUtils {
    static void initializeElementsFiveByFive(int[] array, int variableToInitialize) {
        if (array.length < 5) {
            System.out.println("Array length is too short!");
        } else {
            for (int i = 0; i < array.length / 5; i++) {
                for (int j = i * 5; j < (i * 5) + 5; j++) {
                    array[j] = variableToInitialize;
                }
            }
        }
    }
}

