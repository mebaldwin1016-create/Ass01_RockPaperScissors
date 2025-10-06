import java.util.Scanner;

public class Ass01_RPS {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String playA = "R";
        String playB = "P";
        String continueYN = "Y/N";
        boolean playAgain = true;

        boolean done = false;
        String newLine = "";
        String trash = "";

        do
        {
            System.out.println("Player A, enter R, P, or S");
            in.nextLine();
            if (playA.equalsIgnoreCase("R"))
            {
                System.out.println("Player B, enter R, P, or S");
                if (playB.equalsIgnoreCase("R"))
                {
                    System.out.println("It's a tie R x R");
                }
                else if (playB.equalsIgnoreCase("P"))
                {
                    System.out.println("Paper covers Rock Player B wins");
                }
                else
                {
                    System.out.println("Rock breaks Scissors Player A wins");
                }
            }
            else if (playA.equalsIgnoreCase("P"))
            {

                if (playB.equalsIgnoreCase("R"))
                {
                    System.out.println("Paper covers Rock Player A wins");
                }
                else if (playB.equalsIgnoreCase("P"))
                {
                    System.out.println("It's a tie P x P");
                }
                else
                {
                    System.out.println("Scissors cuts Paper Player B wins");
                }
            }
            else if (playA.equalsIgnoreCase("S"))
            {
                if (playB.equalsIgnoreCase("R"))
                {
                    System.out.println("Rock breaks Scissors Player B wins");
                }
                else if (playB.equalsIgnoreCase("P"))
                {
                    System.out.println("Scissors cuts Paper Player A wins");
                }
                else
                {
                    System.out.println("It's a tie S x S");
                }
            }
            else
            {
                trash = in.nextLine();
                System.out.println("You entered a wrong value");
                done = false;
            }

        }while(playAgain);
        if (continueYN.equals("N"))
        {
            playAgain = false;
        }
        if (continueYN.equals("Y"))
        {
            playAgain = true;
        }
    }
}
