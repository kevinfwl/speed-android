package com.game_environment;

public class Card {
    public static final int LARGEST_RANK_VALUE = 12;
    public static final int SMALLEST_RANK_VALUE = 0;

    private int rank;
    private int suit;
    private boolean flipped;

    //instance methods
    public Card() {
        rank = 0;
        suit = 0;
        flipped = false;
    }

    public Card(int rank, int suit, boolean flipped) {
        this.rank = rank;
        this.suit = suit;
        this.flipped = flipped;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public int getSuit() {
        return suit;
    }

    public void setSuit(int suit) {
        this.suit = suit;
    }

    public boolean isFlipped() {
        return flipped;
    }

    public void setFlipped(boolean flipped) {
        this.flipped = flipped;
    }

    public String print_card() {
        String str_suit = "";
        String str_rank = "";
        if (suit == 0) str_suit = "D";
        else if (suit == 1) str_suit = "C";
        else if (suit == 2) str_suit = "H";
        else str_suit = "S";

        if (rank >= 0 && rank <= 9) str_rank = Integer.toString(rank + 1);
        else if (rank == 10) str_rank = "J";
        else if (rank == 11) str_rank = "Q";
        else str_rank = "K";

        return str_rank + str_suit;
    }
}
