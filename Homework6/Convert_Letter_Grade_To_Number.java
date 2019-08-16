package Homework6;

import java.util.Scanner;
 class Convert_Letter_Grade_To_Number {
     public static void main(String... args) {
         System.out.println("Enter a letter grade:");
         Scanner input = new Scanner(System.in);
         char ch = input.next().charAt(0);
         if (ch == 'A') {
             int A = 4;
             System.out.printf("the numeric value for grade %c is %d", ch, A);
         } else if (ch == 'B') {
             int B = 3;
             System.out.printf("the numeric value for grade %c is %d", ch, B);
         } else if (ch == 'C') {
             int C = 2;
             System.out.printf("the numeric value for grade %c is %d", ch, C);
         } else if (ch == 'D') {
             int D = 1;
             System.out.printf("the numeric value for grade %c is %d", ch, D);
         } else if (ch == 'F') {
             int F = 0;
             System.out.printf("the numeric value for grade %c is %d", ch, F);
         } else {
             System.out.printf("%c is an invalid grade", ch);
         }
     }
 }