import java.util.Scanner;

class Primitives{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Write a number >");
        Integer a = in.nextInt();
        if(a > Byte.MIN_VALUE && a < Byte.MAX_VALUE){
            System.out.println(a + "fits in byte");}
            if(a > -37268 && a < 37267){
                System.out.println(a + "fits in short");}
                if(a > -2147483648 && a < 2147483647){
                    System.out.println(a + "fits in int");}
                    if(a > Long.MIN_VALUE && a < Long.MAX_VALUE){
                        System.out.println(a + "fits in long");}
        }
    }