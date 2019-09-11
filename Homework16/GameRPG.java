package Homework16;

public class GameRPG {
    public static void main(String[] args) {
        Player paladin = new Player("Paladin", "Tank", 204, "Male");
        Player sniper = new Player("Shooter", "Fighter", 220, "Female");
        Player swordsman = new Player("Swordsman", "Fighter", 300, "");
        Player warlock = new Player("Warlock", "Tank", 256, "Male");
        Player knight = new Player("Knight", "Tank");
        System.out.println(paladin);
        System.out.println(sniper);
        System.out.println(swordsman);
        System.out.println(warlock);
        System.out.println(knight);
        System.out.println(Player.FIGHT);

        paladin.divineJudgement();
        swordsman.swordStorm();
        sniper.stardustRain();
        warlock.apocalypse();
        knight.executeSkill("Sword Storm", 3);

        System.out.println(Player.VICTORY);


    }
}
