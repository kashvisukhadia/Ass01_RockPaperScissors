import java.util.Scanner;
public class Game {
    public static void main (String []args){
        Scanner in = new Scanner(System.in);
        String playerA = " ";
        String playerB = " ";
        String continueYN = " ";
        String trash = " ";
        boolean done = false;
        boolean doneA = false;
        boolean doneB = false;

        do{
            System.out.println("Let's play rock paper scissor!");
            do{
                System.out.println("Player A type R for Rock, P for Paper, and S for Scissor");
                playerA = in.nextLine();
                if (playerA.equalsIgnoreCase("R") || playerA.equalsIgnoreCase("P") || playerA.equalsIgnoreCase("S")){
                    doneA = true;
                }
                else{
                    trash = playerA;
                    System.out.println("Enter a valid input not "+ trash);
                }

            }while(!doneA);


            do{
                System.out.println("Player B type R for Rock, P for Paper, and S for Scissor");
                playerB = in.nextLine();
                if (playerB.equalsIgnoreCase("R") || playerB.equalsIgnoreCase("P") || playerB.equalsIgnoreCase("S")){
                    doneB = true;
                }
                else{
                    trash = playerB;
                    System.out.println("Enter a valid input not "+ trash);
                }

            }while(!doneB);

            System.out.println("Player A chose "+ playerA);
            System.out.println("Player B chose " + playerB);
            if (playerA.equalsIgnoreCase("R")&& playerB.equalsIgnoreCase("R")){
                System.out.println("Rock vs Rock");
                System.out.println("It's a tie!");
            }
            else if (playerA.equalsIgnoreCase("P")&&playerB.equalsIgnoreCase("P")) {
                System.out.println("Paper vs Paper");
                System.out.println("It's a tie!");
            }
            else if (playerA.equalsIgnoreCase("S")&&playerB.equalsIgnoreCase("S")) {
                System.out.println("Scissor vs Scissor");
                System.out.println("It's a tie!");
            }
            else if (playerA.equalsIgnoreCase("S")&&playerB.equalsIgnoreCase("P")) {
                System.out.println("Scissor cuts Paper");
                System.out.println("Player A wins!");
            }
            else if (playerA.equalsIgnoreCase("P")&&playerB.equalsIgnoreCase("S")) {
                System.out.println("Scissor cuts Paper");
                System.out.println("Player B wins!");
            }
            else if (playerA.equalsIgnoreCase("R")&&playerB.equalsIgnoreCase("S")) {
                System.out.println("Rock breaks Scissors");
                System.out.println("Player A wins!");
            }
            else if (playerA.equalsIgnoreCase("S")&&playerB.equalsIgnoreCase("R")) {
                System.out.println("Rock breaks Scissors");
                System.out.println("Player B wins!");
            }
            else if (playerA.equalsIgnoreCase("R")&&playerB.equalsIgnoreCase("P")) {
                System.out.println("Paper covers Rock");
                System.out.println("Player A wins!");
            }
            else{
                System.out.println("Paper cover Rock");
                System.out.println("Player B wins!");
            }
            System.out.println("Should we continue [Y/N]?");
            continueYN = in.nextLine();
            if (continueYN.equalsIgnoreCase( "N")){
                done = true;
            }


        }while(!done);

        System.out.println("Thank you for playing!");


    }
}
