package Classwork;

public class UnicornDemo {
    public static void main(String[] args) {
        Unicorn mikey = new Unicorn("Mikey", "Pink", 999);
        Unicorn hector = new Unicorn("Hector");
        Unicorn haley = new Unicorn();
        System.out.println(mikey);
        System.out.println(hector);
        System.out.println(haley);
        System.out.println();
        System.out.println(Unicorn.TYPE_OF_ANIMAL);
        System.out.println(mikey.TYPE_OF_ANIMAL);
        System.out.println(hector.TYPE_OF_ANIMAL);
        System.out.println(haley.TYPE_OF_ANIMAL);
        mikey.fly();
        mikey.run();
        mikey.executeSuperpower("Sonic Blast");
        mikey.executeSuperpower("Rainbow poop", 5);
        hector.fly();
        hector.run();
        haley.setName("Haley");
        haley.setColor("Pink");
        haley.setAgeInYears(666);
        haley.run();

    }
}
