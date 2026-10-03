import java.util.Scanner;
public class Ass01_RockPaperScissors
{
    public static void main()
    {
        Scanner input = new Scanner(System.in);
        String playerA = "";
        String playerB = "";
        String continuePlaying = "";
        do
        {
            do
            {
                System.out.print("Enter Player A - R, P, or S: ");
                playerA = input.nextLine();
            }
            while (!playerA.equalsIgnoreCase("R") && !playerA.equalsIgnoreCase("P") && !playerA.equalsIgnoreCase("S"));
            do
            {
                System.out.print("Enter Player B - R, P, or S: ");
                playerB = input.nextLine();
            }
            while (!playerB.equalsIgnoreCase("R") && !playerB.equalsIgnoreCase("P") && !playerB.equalsIgnoreCase("S"));
            if (playerA.equalsIgnoreCase(playerB))
            {
                System.out.println("It's a tie");
            }
            else if (playerA.equalsIgnoreCase("R") && playerB.equalsIgnoreCase("P"))
            {
                System.out.println("Paper covers Rock Player B wins");
            }
            else if (playerA.equalsIgnoreCase("R") && playerB.equalsIgnoreCase("S"))
            {
                System.out.println("Rock breaks Scissors Player A wins");
            }
            else if (playerA.equalsIgnoreCase("P") && playerB.equalsIgnoreCase("R"))
            {
                System.out.println("Paper covers Rock Player A wins");
            }
            else if (playerA.equalsIgnoreCase("P") && playerB.equalsIgnoreCase("S"))
            {
                System.out.println("Scissors cuts Paper Player B wins");
            }
            else if (playerA.equalsIgnoreCase("S") && playerB.equalsIgnoreCase("R"))
            {
                System.out.println("Rock breaks Scissors Player B wins");
            }
            else if (playerA.equalsIgnoreCase("S") && playerB.equalsIgnoreCase("P"))
            {
                System.out.println("Scissors cuts Paper Player A wins");
            }
            System.out.print("Do you want to continue playing (y or n): ");
            continuePlaying = input.nextLine();
        }
        while (continuePlaying.equalsIgnoreCase("y"));
    }
}
