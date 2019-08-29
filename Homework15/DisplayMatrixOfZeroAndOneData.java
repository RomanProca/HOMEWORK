package Homework15;

class DisplayMatrixOfZeroAndOneData {

    Integer printMatrix(int n) {
        System.out.println("Enter a integer for n-by-n matrix: " + n);
        for (int column = 0; column < n; column++) {
            for (int row = 0; row < n; row++) {
                System.out.printf("%1d ", (int) (Math.random() * 2));
            }
            System.out.println(" ");
        }
        return n;
    }
}
