**Introduction to Classes and Objects in Java**

A class in Java serves as a model or blueprint for building objects. It specifies the data and behavior (methods) of the objects derived from the class. Objects, with their own collection of data (known as instance variables) and methods, represent a particular instance of a class.

**Defining a Class**

In Java, the class keyword is used in conjunction with the class name to define a class. The following components should be part of the class definition:



1. Instance variables: These are variables that depict the data or state of an object. They are also known as fields or attributes.
2. Constructors: These unique methods are employed in the creation and initialization of objects. They have identical names to the class and lack a return type.
3. Methods: These are functions that define the behavior of an object. They may accept arguments and have a return type. 

Here is an example of a straightforward Java class definition:



![alt_text](images/image1.png "image_tooltip")


Name and age are two attributes that belong to the Student class. The two arguments it accepts in its constructor, are used to initialize the instance variables. Four additional methods exist: getName(), setName(), getAge(), and setAge(). Because you can use these methods to access (get) or modify (set) the value of the instance variables, they are known as accessor and mutator methods. The Student object's information is printed using the printDetails() method.

**Creating Objects**

Using the new keyword, the class name, and the constructor with the necessary arguments, we can create an object from a class. An example of how to create an object of the Student class is provided below:



![alt_text](images/image2.png "image_tooltip")


This generates an object of the Student class named "John" who is 20 years old. Then, you can access, change, or perform actions on the object's data using its methods. For instance:


![alt_text](images/image3.png "image_tooltip")


**Conclusion**

In this overview, we covered Java classes and objects. We learned how to define classes by using instance variables and constructors. We also learned how to create objects as instances of these classes. By using methods including accessors and mutators, we can read and change the data of objects as well as perform other actions.	



**Blackjack Game Outline**



1. Go to the file Card.java
    1. Create the constructor for a card with a suit and a value
    2. Create the Card.getSuit() method which returns the suit of the card
    3. Create the Card.getSuit() method which returns the value of the card
2. Go to the file Deck.java
    1. Create the constructor for a deck of 52 cards
        1. Create an empty ArrayList of cards
        2. Create a String array with the four suits
        3. Create a String array with the thirteen values
        4. Use a nested for loop to add all possible cards to the empty ArrayList
    2. Complete the Deck.shuffle() method by adding code similar to the code in the constructor to create a new Deck of 52 cards
    3. Create the Deck.deal() method which uses the ArrayList.remove() method to remove a card from the deck and return the removed card
3. Go to the file Hand.java
    1. Create the constructor for an empty hand
    2. Create the Hand.addCard(Card card) method which uses the ArrayList.add() method to add a given card to the hand
    3. Create the Hand.getCards() method which returns the list of cards in the hand
    4. Complete the Hand.getTotalValue() method which loops through each card in the Hand to calculate the total value
        1. If a card is an ace, increment the total and ace variables by 1
        2. If a card is a face card, increment the total by 10
        3. If a card is not an ace or a face card, increment the total variable by the number on the card using the Integer.parseInt() method
        4. For each ace in the hand, increment the total by 10 repeatedly as long as the total does not go over 21
4. Go to the file Game.java
    1. Create the constructor for a blackjack game which creates a new deck and empty hands for the player and dealer
    2. Complete the Game.play() method which plays a game of blackjack
        1. Shuffle the deck and deal two cards to each player
        2. Code the events of the player’s turn, which displays the hands of both players (only the first card of the dealer), prompts the player to choose an action, and acts accordingly
        3. Code the events of the dealer’s turn, which deals a card to the dealer if they don’t have at least 17 points
        4. Complete the conditional to print messages for the outcome of the game
5. Go to the file Main.java
    1. In the infinite loop, create a new Game object and call the Game.play() method
    2. At the end of the loop, ask the player if they want to play again, breaking out of the loop if they want to stop
