package Homework11;

public class Display4PatternsUsingLoops {
    public static void main(String[] strings) {

        displayPatternA(6);
        displayPatternB(6);
        displayPatternC(6);
        displayPatternD(6);
        displayPatternA(0);
        displayPatternB(0);
        displayPatternC(0);
        displayPatternD(0);

    }
    private static void displayPatternA(int n){
            System.out.println("\n\nPattern A");
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
        }
    private static void displayPatternB(int n){
            System.out.println("\n\nPattern B");
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= 7 - i; j++) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
        }
    private static void displayPatternC(int n){
            System.out.println("\n\nPattern C");
            for (int i = 1; i <= n; i++) {
                for (int k = 1; k <= 6 - i; k++) {
                    System.out.print("  ");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
        }
    private static void displayPatternD(int n){
        System.out.println("\n\nPattern D");
        for (int i = 1; i <= n; i++) {
            for (int k = i; k > 1; k--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 7 - i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
