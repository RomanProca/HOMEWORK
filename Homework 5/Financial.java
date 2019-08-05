import java.util.Scanner;
class Financial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the subtotal and a gratuity rate:");
        int s = input.nextInt();
        int g = input.nextInt();
        double gratuity = (double)s * ((double)g / 100);
        double total = (double)s + gratuity;
        System.out.printf("The gratuity is $%.1f and total is $%.1f\n", gratuity, total);
    }
}