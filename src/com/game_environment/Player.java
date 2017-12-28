package com.game_environment;

import java.util.Stack;

public class Player {

    private int wins;
    private int points;
    //the deck of cards that belong to the player that is not in the players hands
    private Stack<Card> personalDeck;
    private Stack<Card> handDeck;
    // the current hand of the player
    private Card[] hand;

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

    public boolean handFull() {
        for (int i = 0; i < hand.length; i++) {
            if (hand[i] == null) return false;
        }
        return true;
    }

    public void insertIntoHand() {
        for (int i = 0; i < hand.length; i++) {
            if (hand[i] == null && !(handDeck.isEmpty())) hand[i] =  handDeck.pop();
            hand[i].setDownwards();
        }
    }
}
