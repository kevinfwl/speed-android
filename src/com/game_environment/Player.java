package com.game_environment;
import java.util.Stack;

public class Player {
    public static final int NUMBER_OF_CARDS_IN_HAND = 5;

    private int wins;
    private int points;
    //the deck of cards that belong to the player that is not in the players hands
    private Stack<Card> personalDeck;

    //the cards the player has to play
    private Stack<Card> handDeck;
    // the current hand of the player
    private Card[] hand;

    public Player() {
        wins = 0;
        points = 0;
        personalDeck = new Stack<Card>();
        handDeck = new Stack<Card>();
        hand = new Card[5];
    }

    public Player(int wins, int points, Stack<Card> personalDeck, Stack<Card> handDeck, Card[] hand) {
        this.wins = wins;
        this.points = points;
        this.personalDeck = personalDeck;
        this.handDeck = handDeck;
        this.hand = hand;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public Stack<Card> getPersonalDeck() {
        return personalDeck;
    }

    public void setPersonalDeck(Stack<Card> personalDeck) {
        this.personalDeck = personalDeck;
    }

    public Stack<Card> getHandDeck() {

        return handDeck;
    }

    public void setHandDeck(Stack<Card> handDeck) {
        this.handDeck = handDeck;
    }

    public Card[] getHand() {
        return hand;
    }

    public void setHand(Card[] hand) {
        this.hand = hand;
    }

    public boolean isFinished() {
        return handDeck.isEmpty();
    }

    public Card play_card(int card_index) {
        Card card = hand[card_index];
        hand[card_index] = null;
        return card;
    }

    public boolean handFull() {
        for (int i = 0; i < hand.length; i++) {
            if (hand[i] == null) return false;
        }
        return true;
    }

    public void insertIntoHand() {
        for (int i = 0; i < hand.length; i++) {
            if (hand[i] == null && !(handDeck.isEmpty())) hand[i] =  handDeck.pop();
            hand[i].setFlipped(false);
        }
    }

    public int cardsInHand() {
        int number_of_cards = 0;
        for (int i = 0; i < hand.length; i++) {
            if (hand[i] != null) number_of_cards++;
        }
        return number_of_cards;
    }

    //flip the personal deck of the player
    public Card flip_next_deck() {
        return personalDeck.pop();
    }

    // display the hand of the player (return it)
    public String print_hand() {
        String hand_str = "";
        for (int i = 0; i < hand.length; i++) {
            if (hand[i] != null) {
                hand_str = hand_str + hand[i].print_card() + " ";
            }
            else {
                hand_str = hand_str + "## ";
            }
        }
        return hand_str;
    }
}
