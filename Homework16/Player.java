package Homework16;

class Player {
    static final String FIGHT = "All heroes are ready for the battle";

    private String heroName;
    private String heroClass;
    private Integer heroLevel;
    private String heroGender;


    Player(String heroName, String heroClass, Integer heroLevel, String heroGender) {
        {
            System.out.println(heroName + " logged to the game");
        }
        if (heroName.equals(""))
            this.heroName = "unknown";
        else
            this.heroName = heroName;
        if (heroClass.equals("Tank") || heroClass.equals("Mage") || heroClass.equals("Fighter"))
            this.heroClass = heroClass;
        else
            this.heroClass = "Unknown";
        if (heroLevel < 1 || heroLevel > 999)
            this.heroLevel = 0;
        else
            this.heroLevel = heroLevel;
        if (heroGender.equals("Male") || heroGender.equals("Female"))
            this.heroGender = heroGender;
        else
            this.heroGender = "Unknown";
    }

    void divineJudgement() {
        System.out.println(heroName + " use Divine Judgement to hold boss at place for while");
    }

    void swordStorm() {
        System.out.println(heroName + " use  Sword Storm to attack the boss");
    }

    void stardustRain() {
        System.out.println(heroName + " use Stardust Rain to attack the boss");
    }

    void apocalypse() {
        System.out.println(heroName + " use Apocalypse to finish the boss");
    }

    @Override
    public String toString() {
        return "\nHero List" +
                "\nName = " + heroName +
                "\nClass = " + heroClass +
                "\nLevel = " + heroLevel +
                "\nGender = " + heroGender + "\n";
    }
}
