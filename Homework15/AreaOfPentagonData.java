package Homework15;

import Homework9.CalculatingTheValueOfП;

class AreaOfPentagonData {
    static void area() {

        System.out.println("Enter the side: " + 5.5);

        double area = (5 * Math.pow(5.5, 2)) / (4 * Math.tan(CalculatingTheValueOfП.piValue() / 5));

        System.out.println("The area of pentagon is " + area);

    }


}
