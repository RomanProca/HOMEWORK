package Homework13;

class BarChartData {
    private String barStar = "";
    Integer salesForChart(int numberOfSales) {
        do {
            if (numberOfSales > 99)
                barStar += "*";
            numberOfSales -= 100;
        } while (numberOfSales > 99);
        return numberOfSales;
    }
    void salesBarChart() {
        System.out.println(barStar);
    }
}
