
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
public class RockPaperScissors {
    public static void main(String[] args) {
        Move rock = new Move("Rock");
        Move paper = new Move("Paper");
        Move scissors = new Move("Scissors");

        rock.setStrongAgainst(scissors);
        paper.setStrongAgainst(rock);
        scissors.setStrongAgainst(paper);

        int roundsToWin = 2;

        int playerScore = 0;
        int computerScore = 0;
        int round = 1;

        try (Scanner scanner = new Scanner(System.in)) {
            while (playerScore < roundsToWin && computerScore < roundsToWin) {
                System.out.println("Round " + round);
                System.out.print("Enter your move (Rock, Paper, or Scissors): ");
                String playerMove = scanner.nextLine();
                Move playerChoice = null;
                
                // Convert player's choice to a Move object
                if (playerMove.equalsIgnoreCase("Rock")) {
                    playerChoice = rock;
                } else if (playerMove.equalsIgnoreCase("Paper")) {
                    playerChoice = paper;
                } else if (playerMove.equalsIgnoreCase("Scissors")) {
                    playerChoice = scissors;
                } else {
                    System.out.println("Invalid input. Please choose Rock, Paper, or Scissors.");
                    continue;
                }
                
                int computerChoice = (int) Math.floor(Math.random() * 3) + 1;
                Move computerMove = null;
                
                // Convert computer's choice to a Move object
                switch (computerChoice) {
                    case 1 -> computerMove = rock;
                    case 2 -> computerMove = paper;
                    case 3 -> computerMove = scissors;
                }
                
                System.out.println("Computer chose: " + computerMove.getName());
                
                int result = Move.compareMoves(playerChoice, computerMove);
                
                switch (result) {
                    case 0 -> {
                        System.out.println("You win this round!");
                        playerScore++;
                    }
                    case 1 -> {
                        System.out.println("Computer wins this round!");
                        computerScore++;
                    }
                    default -> System.out.println("It's a tie!");
                }
                
                System.out.println("Player: " + playerScore + " | Computer: " + computerScore);
                round++;
            }
            
            if (playerScore > computerScore) {
                System.out.println("You win the game!");
            } else {
                System.out.println("Computer wins the game!");
            }
        }
    }
}