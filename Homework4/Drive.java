import java.util.Scanner;

class Drive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double km;
        double l;
        System.out.println("Enter the distance(Km):");
        km = input.nextDouble();
        System.out.println("Enter the petrol(L):");
        l = input.nextDouble();
        double n = l / km;
        System.out.printf("Consume:%.2f l/km\n", n);
    }
}