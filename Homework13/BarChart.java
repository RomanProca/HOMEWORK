package Homework13;

public class BarChart {
    public static void main(String[] args) {
        BarChartData barChartData = new BarChartData();
        System.out.println("Enter today's sales for store 1: " + barChartData.salesForChart(1000));
        barChartData.salesBarChart();
        System.out.println("Enter today's sales for store 2: " + barChartData.salesForChart(1200));
        barChartData.salesBarChart();
        System.out.println("Enter today's sales for store 3: " + barChartData.salesForChart(1800));
        barChartData.salesBarChart();
        System.out.println("Enter today's sales for store 4: " + barChartData.salesForChart(800));
        barChartData.salesBarChart();
        System.out.println("Enter today's sales for store 5: " + barChartData.salesForChart(1900));
        barChartData.salesBarChart();


    }
}
