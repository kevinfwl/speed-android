package com.game_environment;

public class Card {
    private int number;
    private boolean Upwards;

    //instance methods
    public Card() {
        number = 0;
        Upwards = true;
    }

    public Card(int number, boolean upwards) {
        this.number = number;
        Upwards = upwards;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean isUpwards() {
        return Upwards;
    }

    public void setUpwards() {
        Upwards = true;
    }

    public void setDownwards( ) {
        Upwards = false;
    }

    public String getSuit() {
        if (number == 53 || number == 54) return "";
        int modded_value = (number % 4);
        switch (modded_value) {
            case 0:
                return "D";
            case 1:
                return "C";
            case 2:
                return "H";
            case 3:
                return "S";
            default:
                return "";
        }
    }

    public String getRank() {
        if (number == 53) {
            return "Joker1";
        } else if (number == 54) {
            return "Joker2";
        }

        int modded_value = (number % 4);
        switch ((54 - modded_value) / 4) {
            case 10:
                return "J";
            case 11:
                return "Q";
            case 12:
                return "K";
            default:
                return Integer.toString((54 - modded_value) / 4);
        }
    }
    //Converts the number of the card into a value of the thing
    public String GetValue() {
        return getSuit() + " " + getRank();
    }

}
