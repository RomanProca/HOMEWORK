package Homework5;

class Exercise8 {
    static int a = 0;
    private int b = 2;

    public static void main(String[] args) {
        Exercise8 d = new Exercise8();
        Exercise8 f = new Exercise8();
        Exercise8 g = new Exercise8();
        Exercise8 h = new Exercise8();

        System.out.println(a);
        System.out.println(a);
        System.out.println(a);
        System.out.println(a);
        System.out.println(" " + d.b);
        System.out.println(" " + f.b);
        System.out.println(" " + g.b);
        System.out.println(" " + h.b);

        Exercise8.a = 4;
        d.b = 3;
        g.b = 5;
        System.out.println(" " + " " + a);

        System.out.println(" " + " " + a);
        System.out.println(" " + " " + a);
        System.out.println(" " + " " + a);
        System.out.println(" " + " " + a);

        System.out.println(" " + " " + " " + d.b);
        System.out.println(" " + " " + " " + f.b);
        System.out.println(" " + " " + " " + g.b);
        System.out.println(" " + " " + " " + h.b);
    }
}