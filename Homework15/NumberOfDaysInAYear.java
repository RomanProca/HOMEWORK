package Homework15;

class NumberOfDaysInAYear {

    Integer daysYear(int fromYear, int toYear) {
        int totalDays = 0;
        for (; fromYear < toYear; fromYear++) {
            int days;
            if (fromYear % 4 == 0)
                days = 366;
            else
                days = 365;
            totalDays += days;
        }
        return totalDays;
    }
}

