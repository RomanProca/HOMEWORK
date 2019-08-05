import java.util.Scanner;
class Cylinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius length of a cylinder:");
        double r = input.nextDouble();
        double l = input.nextDouble();
        double pi = 3.14159;
        double a = r * r * pi;
        double v = a * l;
        System.out.printf("The area is %.4f\n", a);
        System.out.printf("The volume is %.1f\n", v);
    }
}