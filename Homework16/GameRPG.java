package Homework16;

public class GameRPG {
    public static void main(String[] args) {
        Player paladin = new Player("Paladin","Tank",204,"Male");
        Player sniper = new Player("Shooter","Fighter",220,"Female");
        Player swordsman = new Player("Swordsman","Fighter",300,"");
        Player warlock = new Player("Warlock","Tank",256,"Male");
        System.out.println(paladin);
        System.out.println(sniper);
        System.out.println(swordsman);
        System.out.println(warlock);
        System.out.println(Player.FIGHT);
        paladin.divineJudgement();
        swordsman.swordStorm();
        sniper.stardustRain();
        warlock.apocalypse();
        System.out.println("Boss was defeated");
    }
}
