import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get player 1's choice
        System.out.println("Player 1: Enter your choice (rock, paper, scissors): ");
        String player1 = sc.next().toLowerCase();

        // Get player 2's choice
        System.out.println("Player 2: Enter your choice (rock, paper, scissors): ");
        String player2 = sc.next().toLowerCase();

        // Determine the winner
        String result = getWinner(player1, player2);
        System.out.println(result);
    }

    public static String getWinner(String player1 , String player2){

        if(player1.equals(player2)){
            return "Its a draw";
        }

        if((player1.equals("rock") && player2.equals("scissors")) ||  
        (player1.equals("scissors") && player2.equals("paper")) ||
         (player1.equals("paper") && player2.equals("rock"))){
            return "player1 wins";
        }

        return "player2 wins";
    }
}
