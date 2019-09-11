package Homework13;

public class BarChartTest {
    public static void main(String[] args) {
        BarChart barChart = new BarChart();
        System.out.println("Enter today's sales for store 1: " + barChart.salesForChart(1000));
        barChart.salesBarChart();
        System.out.println("Enter today's sales for store 2: " + barChart.salesForChart(1200));
        barChart.salesBarChart();
        System.out.println("Enter today's sales for store 3: " + barChart.salesForChart(1800));
        barChart.salesBarChart();
        System.out.println("Enter today's sales for store 4: " + barChart.salesForChart(800));
        barChart.salesBarChart();
        System.out.println("Enter today's sales for store 5: " + barChart.salesForChart(1900));
        barChart.salesBarChart();


    }
}
