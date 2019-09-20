package Homework21;

public class BackwardString {
    public static void reverseString(String name) {
        StringBuilder string = new StringBuilder(name);
        string.reverse().toString();
        System.out.println(string);
    }

    public static void main(String[] args) {
        reverseString("gravity");
    }
}
