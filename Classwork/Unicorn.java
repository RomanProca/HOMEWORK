package Classwork;

public class Unicorn {
    public static final String TYPE_OF_ANIMAL = "Mythic";


    private String name;
    private String color;
    private int ageInYears;

    //getter 0 method parameter 1 return
    {
        System.out.println("Un unicorn is being born");
    }

    public Unicorn() {
        this("Unknown", "Unknown", 0);
    }

    public Unicorn(String name) {
        this(name, "Pink", 1001);
    }

    public Unicorn(String name, String color, int ageInYears) {
        this.name = name;
        this.color = color;
        this.ageInYears = ageInYears;
    }

    public String getName() {
        return name;
    }

    //setter 1 method parameter 0 return
    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAgeInYears() {
        return ageInYears;
    }

    public void setAgeInYears(int ageInYears) {
        this.ageInYears = ageInYears;
    }

    public void fly() {
        System.out.println(name + " flying...");
    }

    public void run() {
        System.out.println(name + " running...");
    }

    public void executeSuperpower(String superpower) {
        System.out.println(name + " executing <" + superpower + " >");
    }

    public void executeSuperpower(String superpower, int numberOfTimes) {
        for (int i = 0; i < numberOfTimes; i++)
            executeSuperpower(superpower);
        //local>method>instance>class
    }

    public void singVerses(String... verses) {
        System.out.println("Singing: ");
        for (int i = 0; i < verses.length; i++) {
            System.out.println();
        }
    }

    @Override
    public String toString() {
        return "Unicorn{ name = " +
                this.name + ", color = " +
                this.color + ", ageInYears = " +
                this.ageInYears + " }";

    }
}
