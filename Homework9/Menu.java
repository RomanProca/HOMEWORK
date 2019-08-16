package Homework9;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

            System.out.println("a - tree          b-apple");
            System.out.println("c - car           d-game");
            System.out.println("Enter a letter:");
                char c = in.nextLine().toLowerCase().charAt(0);
                switch (c) {
                    case 'a':
                        System.out.println("tree");
                        break;
                    case 'b':
                        System.out.println("apple");
                        break;
                    case 'c':
                        System.out.println("car");
                        break;
                    case 'd':
                        System.out.println("game");
                        break;

                }
            }
        }