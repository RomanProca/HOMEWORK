import java.util.Scanner;
class Bills {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a dollar amount:");
        int n = input.nextInt();//93
        int a =  n / 20;
        n %= 20;
        int b =  n / 10;
        n %= 10;
        int c =  n / 5;
        n %= 5;//corrected: operation was missing
        int d =  n ;
        System.out.printf("$20 bills: %d\n", a);//4
        System.out.printf("$10 bills: %d\n", b);//1
        System.out.printf("$5 bills: %d\n", c);//0
        System.out.printf("$1 bills: %d\n", d);//3
    }
}