package Homework16;

class Player {
    static final String FIGHT = "All heroes are ready for the battle\n";
    static final String VICTORY = "\nBoss was defeated";

    private String heroName;
    private String heroClass;
    private Integer heroLevel;
    private String heroGender;

    Player() {
        {
            this.heroName = "Unknown";
            this.heroClass = "Unknown";
            this.heroLevel = 0;
            this.heroGender = "Unknown";
            {
                System.out.println(heroName + " logged to the game");
            }
        }
    }

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

    Player(String heroName, String heroClass) {
        this(heroName, heroClass, 0, "Unknown");
    }

    void divineJudgement() {

        System.out.println(heroName + " use Divine Judgement to hold boss at place for while");
    }

    void swordStorm() {
        System.out.println(heroName + " use Sword Storm to attack the boss");
    }

    void stardustRain() {
        System.out.println(heroName + " use Stardust Rain to attack the boss");
    }

    void apocalypse() {
        System.out.println(heroName + " use Apocalypse to finish the boss");
    }

    void executeSkill(String skill, int numberOfTimes) {
        for (int i = 1; i <= numberOfTimes; i++) {
            System.out.println(heroName + " use " + skill + " in chain to attack the boss " + i + " combo");
        }
        System.out.println(heroName + " executed " + skill + " " + numberOfTimes + " combo");
    }

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public String getHeroClass() {
        return heroClass;
    }

    public void setHeroClass(String heroClass) {
        this.heroClass = heroClass;
    }

    public Integer getHeroLevel() {
        return heroLevel;
    }

    public void setHeroLevel(Integer heroLevel) {
        this.heroLevel = heroLevel;
    }

    public String getHeroGender() {
        return heroGender;
    }

    public void setHeroGender(String heroGender) {
        this.heroGender = heroGender;
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

