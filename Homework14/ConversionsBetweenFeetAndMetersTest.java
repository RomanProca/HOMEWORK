package Homework14;

import static Homework14.ConversionsBetweenFeetAndMeters.footToMeter;
import static Homework14.ConversionsBetweenFeetAndMeters.meterToFoot;

public class ConversionsBetweenFeetAndMetersTest {
    public static void main(String[] args) {
        System.out.println("This program converts between feet and meters");
        System.out.printf("%5s%12s%6s%12s%12s\n", "Feet", "Meters", "|", "Meters", "Feet");
        System.out.println("_______________________________________________");

        for (double f = 1.0, m = 20; f <= 10.0; f++, m += 5.0) {
            System.out.printf("%5.1f%12.3f%6s%12.1f%12.3f\n", f, footToMeter(f), "|", m, meterToFoot(m));
        }
    }
}
