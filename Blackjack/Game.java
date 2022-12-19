import java.util.Scanner;

// Class representing a game of blackjack
public class Game {
    // Deck of cards used in the game
    private Deck deck;

    // Hands for the player and dealer
    private Hand playerHand;
    private Hand dealerHand;

    // Constructor that creates a new game with a new deck and empty hands for the player and dealer
    public Game() {
        deck = new Deck();
        playerHand = new Hand();
        dealerHand = new Hand();
    }

    // Method that plays a game of blackjack
    public void play() {
        // Shuffle the deck
        deck.shuffle();

        // Deal the initial cards
        playerHand.addCard(deck.deal());
        dealerHand.addCard(deck.deal());
        playerHand.addCard(deck.deal());
        dealerHand.addCard(deck.deal());

        // Player's turn
        Scanner input = new Scanner(System.in);
        // Loop until the player busts or stands
        while (playerHand.getTotalValue() <= 21) {
            // Display the player's and dealer's hands
            System.out.println("Your hand: " + playerHand);
            System.out.println("Dealer's hand: " + dealerHand.getCards().get(0) + ", ?");
            // Prompt the player to hit or stand
            System.out.print("Hit or stand (h/s)? ");
            String choice = input.nextLine();
            // If the player chooses to hit, deal a new card
            if (choice.equals("h")) {
                playerHand.addCard(deck.deal());
            }
            // If the player chooses to stand, end the loop
            else {
                break;
            }
        }

        // Dealer's turn
        // Loop until the dealer has at least 17 points
        while (dealerHand.getTotalValue() < 17) {
            // Deal a new card to the dealer
            dealerHand.addCard(deck.deal());
        }

        // Determine the winner
        int playerTotal = playerHand.getTotalValue();
        int dealerTotal = dealerHand.getTotalValue();
        if (playerTotal > 21) {
            System.out.println("You bust! Dealer wins.");
        } else if (dealerTotal > 21) {
            System.out.println("Dealer busts! You win.");
        } else if (playerTotal > dealerTotal) {
            System.out.println("You win!");
        } else if (dealerTotal > playerTotal) {
            System.out.println("Dealer wins.");
        } else {
            System.out.println("It's a tie.");
        }

        // Show final hands
        System.out.println("Your final hand: " + playerHand);
        System.out.println("Dealer's final hand: " + dealerHand);
    }
}
