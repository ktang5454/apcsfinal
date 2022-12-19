import java.util.Scanner;

// Class representing a game of blackjack
public class Game {
    // Deck of cards used in the game
    private Deck deck;

    // Hands for the player and dealer
    private Hand playerHand;
    private Hand dealerHand;

    // Constructor that creates a new game with a new deck and empty hands for the player and dealer
    // YOUR CODE HERE

    // Method that plays a game of blackjack
    public void play() {
        // Shuffle the deck
        // YOUR CODE HERE

        // Deal the initial cards
        // YOUR CODE HERE

        // Player's turn
        Scanner input = new Scanner(System.in);
        // Loop until the player busts or stands
        while (playerHand.getTotalValue() <= 21) {
            // Display the player's and dealer's hands
            // YOUR CODE HERE
            // Prompt the player to hit or stand
            // YOUR CODE HERE
            // If the player chooses to hit, deal a new card
            // YOUR CODE HERE
            // If the player chooses to stand, end the loop
            // YOUR CODE HERE
        }

        // Dealer's turn
        // Loop until the dealer has at least 17 points
        while (dealerHand.getTotalValue() < 17) {
            // Deal a new card to the dealer
            // YOUR CODE HERE
        }

        // Determine the winner
        int playerTotal = playerHand.getTotalValue();
        int dealerTotal = dealerHand.getTotalValue();
        if (playerTotal > 21) {
            // YOUR CODE HERE
        } else if (dealerTotal > 21) {
            // YOUR CODE HERE
        } else if (playerTotal > dealerTotal) {
            // YOUR CODE HERE
        } else if (dealerTotal > playerTotal) {
            // YOUR CODE HERE
        } else {
            // YOUR CODE HERE
        }

        // Show final hands
        System.out.println("Your final hand: " + playerHand);
        System.out.println("Dealer's final hand: " + dealerHand);
    }
}
