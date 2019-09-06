package Homework8;

public class TheTwelveDaysOfChristmas {

    public static void main(String[] args) {
        for (int i = 1; i <= 12; i++) {
            System.out.print("On the ");

            switch (i) {
                case 12:
                    System.out.print("Twelfth");
                    break;


                case 11:
                    System.out.print("Eleventh");
                    break;

                case 10:
                    System.out.print("Tenth");
                    break;

                case 9:
                    System.out.print("Ninth");
                    break;

                case 8:
                    System.out.print("Eighth");
                    break;

                case 7:
                    System.out.print("Seventh");
                    break;
                case 6:
                    System.out.print("Sixth");
                    break;
                case 5:
                    System.out.print("Fifth");
                    break;
                case 4:
                    System.out.print("Fourth");
                    break;
                case 3:
                    System.out.print("Third");
                    break;
                case 2:
                    System.out.print("Second");
                    break;
                case 1:
                    System.out.print("First");
                    break;

            }

            System.out.println(" Day of Christmas my true love gave to me ");

            switch (i) {
                case 12:
                    System.out.println(" Twelve Drummers Drumming ");

                case 11:
                    System.out.println(" Eleven Pipers piping ");

                case 10:
                    System.out.println(" Ten Lords a leaping ");

                case 9:
                    System.out.println(" Nine Ladies Dancing ");

                case 8:
                    System.out.println(" Eight Maids a milking ");

                case 7:
                    System.out.println(" Seven Swans a swimming ");

                case 6:
                    System.out.println(" Six Geese a laying ");

                case 5:
                    System.out.println(" Five Golden Rings ");

                case 4:
                    System.out.println(" Four Calling Birds ");

                case 3:
                    System.out.println(" Three French Hens ");

                case 2:
                    System.out.println(" Two Turtle Doves ");

                case 1:
                    System.out.println(" A partridge in a pear tree ");

            }


        }


    }
}