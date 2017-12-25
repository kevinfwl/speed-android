package com.game_environment;

public class Player {

    private int wins;
    //the deck of cards that belong to the player that is not in the players hands
    private Card[] personalDeck;
    // the current hand of the player
    private Card[] hand;
    private int points;

    public Player() {
        wins = 0;
        personalDeck = new Card[10];
        hand = new Card[17];
        points = 0;

    }

    public Player(Card[] personalDeck, Card[] hand) {
        wins = 0;
        this.personalDeck = personalDeck;
        this.hand = hand;
        points = 0;
    }

    public Player(int wins, Card[] personalDeck, Card[] hand, int points) {
        this.wins = wins;
        this.personalDeck = personalDeck;
        this.hand = hand;
        this.points = points;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public void setPersonalDeck(Card[] personalDeck) {
        this.personalDeck = personalDeck;
    }

    public void setHand(Card[] hand) {
        this.hand = hand;
    }

    public int getWins() {
        return wins;
    }

    public int getPoints() {
        return points;
    }

    public Card[] getPersonalDeck() {
        return personalDeck;
    }

    public Card[] getHand() {
        return hand;
    }



    //shuffle
}
