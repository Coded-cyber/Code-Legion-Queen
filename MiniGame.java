import java.util.Scanner;
import java.util.Random;

public class MiniGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("=== Rock Paper Scissors: Victory Edition ===");
        System.out.println("Choose: 1 = Rock, 2 = Paper, 3 = Scissors");
        System.out.print("Your move: ");
        
        int player = input.nextInt();
        
        // Validating player input with conditionals
        if (player < 1 || player > 3) {
            System.out.println("Yah! 1, 2, or 3 only. Game over.");
            input.close();
            return;
        }
        
        int computer = rand.nextInt(3) + 1; // generates 1, 2, or 3
        
        // Convert numbers to words for printing
        String playerMove = "";
        String computerMove = "";
        
        if (player == 1) {
            playerMove = "Rock";
        } else if (player == 2) {
            playerMove = "Paper";
        } else {
            playerMove = "Scissors";
        }
        
        if (computer == 1) {
            computerMove = "Rock";
        } else if (computer == 2) {
            computerMove = "Paper";
        } else {
            computerMove = "Scissors";
        }
        
        System.out.println("You chose: " + playerMove);
        System.out.println("Computer chose: " + computerMove);
        System.out.println("---");
        
        // Main game logic using conditional statements
        if (player == computer) {
            System.out.println("Result: Tie! Great minds think alike.");
        } else if (player == 1 && computer == 3) {
            System.out.println("Result: You WIN! Rock smashes Scissors. victory!");
        } else if (player == 2 && computer == 1) {
            System.out.println("Result: You WIN! Paper covers Rock. Take that!");
        } else if (player == 3 && computer == 2) {
            System.out.println("Result: You WIN! Scissors cut Paper. True Victory!");
        } else {
            System.out.println("Result: You lose haha But you're still my friend.");
        }
        
        input.close();
    }
}