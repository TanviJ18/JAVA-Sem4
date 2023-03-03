
import java.util.Random;
import java.util.Vector;
import java.util.Scanner;

class Card {
    private int rank;
    private int suit;

    public Card() {
        this.rank = 0;
        this.suit = 0;
    }

    public Card(int rank, int suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public int getRank() {
        return this.rank;
    }

    public int getSuit() {
        return this.suit;
    }

    public void printCard() {
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
        System.out.println(ranks[this.rank] + " of " + suits[this.suit]);
    }

    public static Vector<Card> createDeck() {
        Vector<Card> deck = new Vector<Card>();
        for (int suit = 0; suit < 4; suit++) {
            for (int rank = 0; rank < 13; rank++) {
                deck.add(new Card(rank, suit));
            }
        }
        return deck;
    }

    public static boolean sameCard(Card card1, Card card2) {
        return (card1.rank == card2.rank && card1.suit == card2.suit);
    }

    public static int compareCard(Card card1, Card card2) {
        if (card1.rank > card2.rank) {
            return 1;
        } else if (card1.rank < card2.rank) {
            return -1;
        } else {
            if (card1.suit > card2.suit) {
                return 1;
            } else if (card1.suit < card2.suit) {
                return -1;
            } else {
                return 0;
            }
        }
    }

    public static void sortCard(Vector<Card> deck) {
        deck.sort((card1, card2) -> compareCard(card1, card2));
    }

    public static int findCard(Vector<Card> deck, Card card) {
        for (int i = 0; i < deck.size(); i++) {
            if (sameCard(deck.get(i), card)) {
                return i;
            }
        }
        return -1;
    }

    public static void printDeck(Vector<Card> deck) {
        for (Card card : deck) {
            card.printCard();
        }
    }

    public static void dealCards(Vector<Card> deck) {
        Random rand = new Random();
        System.out.println("Here are your 5 cards:");
        for (int i = 0; i < 5; i++) {
            int index = rand.nextInt(deck.size());
            deck.get(index).printCard();
            deck.remove(index);
        }
    }
}

public class PIJ_Assignment4
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Vector<Card> deck = Card.createDeck();
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Print the deck");
            System.out.println("2. Print a card");
            System.out.println("3. Sort the deck");
            System.out.println("4. Find a card");
            System.out.println("5. Deal 5 cards");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Printing the deck...");
                    Card.printDeck(deck);
                    break;

                case 2:
                    System.out.print("Enter the rank of the card (0-12): ");
                    int rank = scanner.nextInt();
                    System.out.print("Enter the suit of the card (0-3): ");
                    int suit = scanner.nextInt();
                    Card card = new Card(rank, suit);
                    System.out.print("The card is: ");
                    card.printCard();
                    break;

                case 3:
                    System.out.println("Sorting the deck...");
                    Card.sortCard(deck);
                    break;

                case 4:
                    System.out.print("Enter the rank of the card to find (0-12): ");
                    rank = scanner.nextInt();
                    System.out.print("Enter the suit of the card to find (0-3): ");
                    suit = scanner.nextInt();
                    card = new Card(rank, suit);
                    int index = Card.findCard(deck, card);
                    if (index == -1) {
                        System.out.println("Card not found.");
                    } else {
                        System.out.println("Card found at index " + index + ".");
                    }
                    break;

                case 5:
                    Card.dealCards(deck);
                    break;

                case 6:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 6.");
            }
        }
    }
}


