import java.util.List;
import java.util.ArrayList;

// Class representing a hand of playing cards
class Hand {
    // List of cards in the hand
    private List<Card> cards;

    // Constructor that creates a new empty hand
    public Hand() {
        cards = new ArrayList<>();
    }

    // Method that adds a card to the hand
    public void addCard(Card card) {
        cards.add(card);
    }

    // Method that returns the list of cards in the hand
    public List<Card> getCards() {
        return cards;
    }

    // Method that calculates the total value of the cards in the hand
    // Aces are worth 1 or 11, face cards are worth 10, and all other cards are worth their face value
    public int getTotalValue() {
        int total = 0;
        int aces = 0;
        for (Card card : cards) {
            // If the card is an Ace, increment the number of aces and the total value by 1
            if (card.getValue().equals("Ace")) {
                total++;
                aces++;
            }
            // If the card is a face card, add 10 to the total value
            else if (card.getValue().equals("Jack") || card.getValue().equals("Queen") || card.getValue().equals("King")) {
                total += 10;
            }
            // Otherwise, add the face value of the card to the total value
            else {
                total += Integer.parseInt(card.getValue());
            }
        }
        // Iterate over the aces and add 10 to the total value as long as it is less than or equal to 11
        // This allows aces to be worth 1 or 11, depending on which value would give the highest total without going over 21
        while (aces > 0 && total <= 11) {
            total += 10;
            aces--;
        }
        return total;
    }

    // Method that returns a string representation of the hand, with each card separated by a comma and a space
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < cards.size(); i++) {
            sb.append(cards.get(i).toString());
            if (i < cards.size() - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }
}
