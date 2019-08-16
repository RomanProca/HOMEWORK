package Homework5;

import java.util.Scanner;

class Primitives{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Write a number >");
        long a = in.nextLong();
        if(a > Byte.MIN_VALUE && a < Byte.MAX_VALUE){
            System.out.printf("%d fits in byte%n", a);}
            else if(a > -37268 && a < 37267){
            System.out.printf("%d fits in short%n", a);}
                else if(a > -2147483648 && a < 2147483647){
            System.out.printf("%d fits in int%n", a);}
       else
            System.out.printf("%d fits in long%n", a);
    }
}