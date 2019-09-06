package Homework3;

class Lanterns {

    public static void main(String[] args) {
        display();
    }

    private static void display() {
        displayVoidOne();
        displayOne();
        displayTwo();
        displayFor();
        displayVoidOne();
        displayOne();
        displayTree();
        displayTwo();
        displayTwo();
        displayTree();
        displayTree();
    }

    private static void displayOne() {
        displayTree();
        System.out.println("  *********  ");
        displayFor();
    }

    private static void displayTwo() {
        System.out.println("* | | | | | *");
    }

    private static void displayTree() {
        System.out.println("    *****    ");
    }

    private static void displayFor() {
        System.out.println("*************");
    }

    private static void displayVoid() {
        System.out.println(" ");
    }

    private static void displayVoidOne() {
        displayOne();
        displayVoid();
    }

}