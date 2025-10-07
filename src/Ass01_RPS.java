import java.util.Scanner;

public class Ass01_RPS {
    public static void main(String[] args)
    {
        boolean playAgain = false;
        boolean move1 = false;
        boolean move2 = false;
        String player1 = "";
        String player2 = "";
        String cont = "";
        Scanner in = new Scanner(System.in);

        do
        {
            move1 = false;
            move2 = false;
            do
            {
                System.out.println("\nPlayer 1 please enter your move. [R, P, or S]: ");
                player1 = in.nextLine();
                player1 = player1.toUpperCase();
                if(player1.matches("[RPS]"))
                {
                    move1 = true;
                }
                else
                {
                    System.out.println("\nInvalid move, please try again, must enter [R,P,S]");
                }
            } while (!move1);
            do
            {
                System.out.println("\nPlayer 2 please enter your move. [R, P, or S]: ");
                player2 = in.nextLine();
                player2 = player2.toUpperCase();
                if(player2.matches("[RPS]"))
                {
                    move2 = true;
                }
                else
                {
                    System.out.println("\nInvalid move, please try again, must enter [R,P,S]");
                }
            } while (!move2);

            if (player1.equalsIgnoreCase("R"))
            {
                System.out.println("Player B, enter R, P, or S");
                if (player2.equalsIgnoreCase("R"))
                {
                    System.out.println("It's a tie R x R");
                }
                else if (player2.equalsIgnoreCase("P"))
                {
                    System.out.println("Paper covers Rock Player B wins");
                }
                else
                {
                    System.out.println("Rock breaks Scissors Player A wins");
                }
            }
            else if (player1.equalsIgnoreCase("P"))
            {

                if (player2.equalsIgnoreCase("R"))
                {
                    System.out.println("Paper covers Rock Player A wins");
                }
                else if (player2.equalsIgnoreCase("P"))
                {
                    System.out.println("It's a tie P x P");
                }
                else
                {
                    System.out.println("Scissors cuts Paper Player B wins");
                }
            }
            else if (player1.equalsIgnoreCase("S"))
            {
                if (player2.equalsIgnoreCase("R"))
                {
                    System.out.println("Rock breaks Scissors Player B wins");
                }
                else if (player2.equalsIgnoreCase("P"))
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

            }
            System.out.println("\n Do you wish to play again [Y/N]: ");
            cont = in.nextLine().toUpperCase();
            if (cont.equals("Y"))
            {
                playAgain = true;
            }
            else
            {
                playAgain = false;
            }

        }while(playAgain);
        System.out.println("Stored vars: " + player1 + " " + player2);
    }
}
