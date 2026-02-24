import java.util.Scanner;
import java.util.Random;
import java.util.HashMap;

public class RPSPuckett {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random rng = new Random();
        int computerChoice = 0;
        int playerChoice = "r";
        
        //rock(r) = 0, paper(p) = 1, scissors(s) = 2 
        HashMap<String, Integer> moves = new HashMap<String, Integer>();
        moves.put("r", 0);
        moves.put("p", 1);
        moves.put("s", 2);


        while (true) {
            computerChoice = rng.nextInt(3);

            System.out.println("Enter 'r' for Rock, 'p' for Paper, or 's' for Scissors");
            playerChoice = moves.get(keyboard.nextLine());

            if (computerChoice == ((playerChoice + 1) % 3)) {
                System.out.println("The Player wins");
            }
            else if (computerChoice == playerChoice) {
                System.out.println("The Match was a tie.");
            }
            else {
                System.out.println("The Computer wins");
            }


            System.out.println("Would you like to play again?(y or n) ");
            if (keyboard.nextLine().compareTo("n") == 0) {
                break;
            }
        }
    } 
}
