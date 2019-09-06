package Homework15;

class NumberOfDaysInAYear {
    public static void main(String[] args) {
        NumberOfDaysInAYearData numberOfDaysInAYearData = new NumberOfDaysInAYearData();
        System.out.println("The number of days in year from 2000 to 2020 is " + numberOfDaysInAYearData.daysYear(2000, 2020));
        System.out.println("The number of days in year from 2005 to 2020 is " + numberOfDaysInAYearData.daysYear(2005, 2020));
        System.out.println("The number of days in year from 2010 to 2020 is " + numberOfDaysInAYearData.daysYear(2010, 2020));
        System.out.println("The number of days in year from 2015 to 2020 is " + numberOfDaysInAYearData.daysYear(2015, 2020));
        System.out.println("The number of days in year from 2019 to 2020 is " + numberOfDaysInAYearData.daysYear(2019, 2020));

    }
}
