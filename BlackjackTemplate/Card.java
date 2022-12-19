// Class representing a playing card
class Card {
    // Suit of the card (e.g. Hearts, Diamonds, Clubs, Spades)
    private String suit;

    // Value of the card (e.g. 2, 3, 4, 5, 6, 7, 8, 9, 10, Jack, Queen, King, Ace)
    private String value;

    // Constructor that creates a new card with the given suit and value
    // YOUR CODE HERE

    // Method that returns the suit of the card
    // YOUR CODE HERE

    // Method that returns the value of the card
    // YOUR CODE HERE

    // Method that returns a string representation of the card in the form "value of suit"
    @Override
    public String toString() {
        return value + " of " + suit;
    }
}