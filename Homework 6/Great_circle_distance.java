import java.util.Scanner;
class Great_circle_distance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter point 1 (latitude and longitude) in degrees:");
        double latitudeOne = input.nextDouble();
        double longitudeOne = input.nextDouble();
        System.out.println("Enter point 2 (latitude and longitude) in degrees:");
        double latitudeTwo = input.nextDouble();
        double longitudeTwo = input.nextDouble();
        double radius = 6371.01;
        double d = radius * Math.asin(Math.sin(latitudeOne) * Math.sin(latitudeTwo) + Math.cos(latitudeOne) * Math.cos(latitudeTwo) * Math.cos(longitudeOne - longitudeTwo));
        System.out.printf("The distance between the two points is %.4f km\n", d);
    }
}
