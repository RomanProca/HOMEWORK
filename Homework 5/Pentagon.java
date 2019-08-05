import java.util.Scanner;
class Pentagon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length from center to a vertex:");
        double r = input.nextDouble();
        double side = (2 * r) * (Math.sin(Math.PI/5));
        double area = (5 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI /5));
        System.out.printf("The area of pentagon is %.2f\n", area);
    }
}