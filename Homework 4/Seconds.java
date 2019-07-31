import java.util.Scanner;
class Seconds{
    public static void main(String[] args){
        Scanner input = new Scanner( System.in );
        long seconds;
        System.out.println("Enter the number of seconds:");
        seconds = input.nextLong();
        double minutes = seconds / 60;//526.666,6666666667...
        int intMinutes = (int) minutes;//526.666
        double hours = intMinutes / 60;//8.777,766666666667‬...
        int intHours = (int) hours;//8.777
        double days = intHours / 24;//365,7083333333333...
        int intDays = (int) days;//365
        double restHours = ( days - intDays ) * 24;
        int intRestHours = (int) restHours;
        double restMinutes = ( restHours - intRestHours ) * 60;
        int intRestMinutes = (int) restMinutes;
        double restSeconds = ( restMinutes - intRestMinutes ) * 60;
        int intRestSeconds = (int) restSeconds;
        System.out.printf("%d seconds = %d days, %d hours, %d minutes, %d seconds\n",seconds,intDays,intRestHours,intRestMinutes,intRestSeconds);
    }
}
