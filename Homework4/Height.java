package Homework4;

class Height {
    public static void main(String[] args) {
        double height = 175;
        Conversion(height);
    }

    private static void Conversion(double height) {
        double inch = 0.3937 * height;
        int intPart = (int) inch;
        System.out.printf("Height in integer inches: %d \n", intPart);
        double feet = intPart / 12;
        double rest = intPart - feet * 12;
        System.out.printf("Height in integer inches converted to feet and inches: %.2f feet and %.2f inch\n", feet, rest);

    }
}

