package com.game_environment;

import java.util.Random;
import java.util.Stack;
import java.math.*;

//methods to use:
//        randomize cards in a stack
//        play a card from hand
//        deals card to the table
//        p1/p2 playcard
//        p1/p2 cardplayable
//        show top hand of deck
//        stack another card-

public class Table {
    private Stack<Card> playingField1;
    private Stack<Card> playingField2;
    private Player player1;
    private Player player2;

    // main method
    public static void Main(String[] args) {
    }

    //static methods
    public static Stack<Card> randomizeStack(Stack<Card> card_stack) {
        Card[] all_cards = new Card[card_stack.size()];
        for (int i = 0; i < all_cards.length; i++) {
            all_cards[i] = card_stack.pop();
        }

        Random random_generator = new Random();
        int numberofRandomizations = all_cards.length * 2;

        for (int i = 0; i < numberofRandomizations; i++) {
            int starting_index = random_generator.nextInt(all_cards.length);
            int ending_index = random_generator.nextInt(all_cards.length);
            //switch the indexes
            Card temp = all_cards[starting_index];
            all_cards[starting_index] = all_cards[ending_index];
            all_cards[ending_index] = temp;
        }

        Stack<Card> rearranged_cards = new Stack<Card>();
        for (Card card : all_cards) {
            rearranged_cards.push(card);
        }
        return rearranged_cards;
    }

    //instance methods
    public void flip_to_next_card_player_1() {
            playingField1.push(player1.flip_next_deck());
    }

    public void flip_to_next_card_player_2() {
        playingField1.push(player2.flip_next_deck());
    }

    /*
          NEED FIX T OONLY ONE PLAYER
     */
    public void play_card(int player_number, int card_index, int playing_field_number) {
        if (!card_playable(player_number, card_index, playing_field_number)) return;
        // set the players
        Player player;
        Stack<Card> playing_field;
        if (player_number == 1) player = player1;
        else player = player2;

        if (playing_field_number == 1) playing_field = playingField1;
        else playing_field = playingField2;

        //plays the card
        playing_field.push(player.play_card(card_index));
    }

    //player number 1 or 2 for player 1 and player 2
    public boolean card_playable(int player_number, int card_index, int playing_field_number) {
        int difference_card_rank = 1;

        if (card_index < 0 || card_index > 4) return false;
        Player player;
        Stack<Card> playing_field;
        if (player_number == 1) player = player1;
        else player = player2;

        if (playing_field_number == 1) playing_field = playingField1;
        else playing_field = playingField2;


        int player_card_rank = player.getHand()[card_index].getRank();
        int playing_field_card_rank =  playing_field.peek().getRank();

        //show that the cards are right beside each other;
        if (Math.abs(player_card_rank - playing_field_card_rank) == Card.LARGEST_RANK_VALUE ||
                Math.abs(player_card_rank - playing_field_card_rank) == difference_card_rank) return true;
        return false;
    }



    //default instance methods
    //constructor
    public Table(Stack<Card> playingField1, Stack<Card> playingField2, Player player1, Player player2) {
        this.playingField1 = playingField1;
        this.playingField2 = playingField2;
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
