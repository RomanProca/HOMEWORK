package Homework17;

public class SumTheDigitsInAnIntegerTest {
    public static void main(String[] args) {
        System.out.println(SumTheDigitsInAnInteger.sumDigits(234));
        SumTheDigitsInAnInteger.reset();
        System.out.println(SumTheDigitsInAnInteger.sumDigits(234));
        SumTheDigitsInAnInteger.reset();
        System.out.println(SumTheDigitsInAnInteger.sumDigits(424));
        SumTheDigitsInAnInteger.reset();
    }
}
