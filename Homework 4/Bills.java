import java.util.Scanner;
class Bills {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Enter a dollar amount:");
        n = input.nextInt();
        int a =  n / 20;
        n = n % 20;
        int b =  n / 10;
        n = n % 10;
        int c =  n / 5;
        int d =  n ;
        System.out.printf("$20 bills: %d\n", a);
        System.out.printf("$10 bills: %d\n", b);
        System.out.printf("$5 bills: %d\n", c);
        System.out.printf("$1 bills: %d\n", d);
    }
}