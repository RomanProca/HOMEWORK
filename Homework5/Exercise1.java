package Homework5;

class Exercise1 {
    int a;
    private char c;
    private boolean b;
    private Short aShort;
    private String d;

    public void main(String[] args) {
        Exercise1 d = new Exercise1();
        System.out.println(d.a);
        System.out.println(d.b);
        System.out.println(d.c);
        System.out.println(d.aShort);
        System.out.println(d.d);
    }

    public void setC(char c) {
        this.c = c;
    }

    private void setB(boolean b) {
        this.b = b;
    }

    public void setaShort(Short aShort) {
        this.aShort = aShort;
    }

    public void setD(String d) {
        this.d = d;
    }
}