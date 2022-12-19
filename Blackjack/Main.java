import java.util.Scanner;

// Class containing the main method for the blackjack game
class Main {
    // Main method that creates and plays games of blackjack until the player chooses to stop
    public static void main(String[] args) {
        Game game;

        // Loop the game until the player wants to stop
        while (true) {
            game = new Game();
            game.play();

            // Ask the player if they want to play again
            System.out.print("Do you want to play again (y/n)? ");
            Scanner input = new Scanner(System.in);
            String choice = input.nextLine();

            // If the player does not want to play again, break out of the loop
            if (choice.equals("n")) {
                break;
            }
        }
    }
}