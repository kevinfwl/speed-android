package com.game_environment;


import java.util.Random;
import java.util.Stack;

public class Table {
    private Stack<Card> playingField1;
    private Stack<Card> playingField2;
    private int roundNumber;
    private Player player1;
    private Player player2;

    public static void Main(String[] args) {
    }

    public static Stack ProduceRandomizedDeck() {
        Card[] Deck = new Card[54];
        for (int i = 0; i < 54; i++) {
            Deck[i] = new Card(i , false);
        }

        Random random = new Random();
        int number_of_randomizations = 50;
        for (int i = 0; i < number_of_randomizations; i++) {
            int first_Index = random.nextInt(54);
            int second_Index = random.nextInt(54);
            while (first_Index ==  second_Index) {
                second_Index = random.nextInt(54);
            }
            Card temp = Deck[first_Index];
            Deck[second_Index] = Deck[first_Index];
            Deck[first_Index] = temp;
        }

        Stack stackedDeck = new Stack();
        for (int i = 0; i < number_of_randomizations; i++) {
            stackedDeck.push(Deck[i]);
        }

        return stackedDeck;

    }

    //deal cards to player one and player 2
    public void Deal_Cards(Stack<Card> stack_of_cards) {
        personalHand1
        for (int i = 0 ; i < stack_of_cards.size(); i++ ) {

        }
    }

    public boolean CardsPlayable() {
        //check player1
    }


    //instance methods
    //constructor
    public Table(Stack<Card> playingField1, Stack<Card> playingField2, int roundNumber, Player player1, Player player2) {
        this.playingField1 = playingField1;
        this.playingField2 = playingField2;
        this.roundNumber = roundNumber;
        this.player1 = player1;
        this.player2 = player2;
    }
    //selector
    public Stack<Card>  getPlayingField1() {
        return playingField1;
    }

    public void setPlayingField1(Stack<Card>  playingField1) {
        this.playingField1 = playingField1;
    }

    public Stack<Card> getPlayingField2() {
        return playingField2;
    }

    public void setPlayingField2(Stack<Card>  playingField2) {
        this.playingField2 = playingField2;
    }

    public int getRoundNumber() {
        return roundNumber;
    }

    //mutator
    public void setRoundNumber(int roundNumber) {
        this.roundNumber = roundNumber;
    }

    public Player getPlayer1() {
        return player1;
    }

    public void setPlayer1(Player player1) {
        this.player1 = player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public void setPlayer2(Player player2) {
        this.player2 = player2;
    }
}
