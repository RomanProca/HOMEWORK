public class Lanterns {

    public static void main(String[] args)
    {
        display();
    }

    static void display() {
        displayVoidOne();
        displayOne();
        displayTwo();
        displayFor();
        displayVoidOne();
        displayOne();
        displayTree();
        displayTwo();
        displayTwo();
        displayTree();
        displayTree();
    }
        static void displayOne ()
        {
            displayTree ();
            System.out.println("  *********  ");
            displayFor ();
        }
        static void displayTwo ()
        {
            System.out.println("* | | | | | *");
        }
        static void displayTree ()
        {
            System.out.println("    *****    ");
        }
        static void displayFor ()
        {
            System.out.println("*************");
        }
        static void displayVoid ()
        {
            System.out.println(" ");
        }
        static void displayVoidOne ()
        {
            displayOne ();
            displayVoid ();
        }

}