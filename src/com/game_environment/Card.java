package com.game_environment;

public class Card {
    private int number;
    private int status;

    //instance methods
    public Card() {
        number = 0;
        status = 0;
    }

    public Card(int number, int status) {
        this.number = number;
        this.status = status;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setStatus(int status) {
        this.status = number;
    }

    public int getStatus() {
        return status;
    }

    //Converts the number of the card into a value of the thing
    public String GetValue() {

        if (number == 53) {
            return "Joker1";
        } else if (number == 54) {
            return "Joker2";
        }

        int modded_value = (number % 4);
        String suit = "";
        String Number = "";
        switch (modded_value) {
            case 0:
                suit = "D";
                break;
            case 1:
                suit = "C";
                break;
            case 2:
                suit = "H";
                break;
            case 3:
                suit = "S";
                break;
        }

        switch ((54 - modded_value) / 4) {
            case 10:
                Number = "J";
                break;
            case 11:
                Number = "Q";
                break;
            case 12:
                Number = "K";
                break;
            default:
                Number = Integer.toString((54 - modded_value) / 4);
                break;
        }
        return suit + " " + Number;
    }

}
