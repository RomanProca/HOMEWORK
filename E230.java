import java.util.Scanner;
public class E230 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x;
        int r = 0;
        System.out.println("Insert nr:");
        x = input.nextLong();
        double a = x / 10000;
        int aa = (int) a;//4
        double b = x / 1000;
        int bb = (int) b;//42
        r = r * 10;
        r = r + bb%10;
        bb = bb/10;
        int bbb = (int) bb;
        double c = x / 100;
        int cc = (int) c;//422
        r = r * 10;
        r = r + cc%10;
        cc = cc/10;
        cc = cc / 10;
        int ccc = (int) cc;
        double d = x / 10;
        int dd = (int) d;//4223
        r = r * 10;
        r = r + dd%10;
        dd = dd/10;
        dd = dd / 100;
        int ddd = (int) dd;
        double e = x;//42239
        int ee = (int) e;
        r = r * 10;
        r = r + ee%10;
        ee = ee/10;
        ee = ee / 1000;
        int eee = (int) ee;
        System.out.printf("%d %d %d %d %d  \n", aa, bbb, ccc, ddd, eee);
    }
}