public class FightSong
{

    public static void main(String[] args)
    {
        display();
    }

    static  void  display()
    {
        displayGo();
        System.out.println(" ");
        displayGo();
        displayBest ();
        System.out.println(" ");
        displayGo ();
        displayBest ();
        System.out.println(" ");
        displayGo ();

    }
    static void displayGo ()
    {
        System.out.println("Go, team, go!");
        System.out.println("You can do it.");
    }
    static void displayBest ()
    {
        System.out.println("You're the best,");
        System.out.println("In the West.");
    }
}