import java.util.List;
import java.util.ArrayList;
import java.util.Random;

// Class representing a deck of playing cards
class Deck {
    // List of cards in the deck
    private List<Card> cards;

    // Constructor that creates a new deck of 52 cards
    public Deck() {
        // Create a new empty list of cards
        cards = new ArrayList<>();

        // Array of suits in a standard deck of playing cards
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};

        // Array of values in a standard deck of playing cards
        String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        // Iterate over the suits and values and add a new card for each combination
        for (String suit : suits) {
            for (String value : values) {
                cards.add(new Card(suit, value));
            }
        }
    }

    // Method that shuffles the cards in the deck
    public void shuffle() {
        // Create a new Random object for generating random numbers
        Random rand = new Random();

        // If the deck is not complete (less than 52 cards), create a new deck of 52 cards
        if (cards.size() < 52) {
            cards.clear();
            String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
            String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
            for (String suit : suits) {
                for (String value : values) {
                    cards.add(new Card(suit, value));
                }
            }
        }

        // Iterate over the cards in the deck and randomly swap each card with another card in the list
        for (int i = 0; i < cards.size(); i++) {
            int j = rand.nextInt(cards.size());
            Card temp = cards.get(i);
            cards.set(i, cards.get(j));
            cards.set(j, temp);
        }
    }

    // Method that deals the top card from the deck (removes and returns the first card in the list)
    public Card deal() {
        return cards.remove(0);
    }
}
