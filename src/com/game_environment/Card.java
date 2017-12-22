package com.game_environment;

public class Card {
    private int number;

    //instance methods
    private Card() {
        number = 0;
    }

    private Card(int number) {
        this.number = number;
    }

    private void setNumber(int number) {
        this.number = number;
    }

    private int getNumber() {
        return number;
    }
    //Converts the number of the card into a value of the thing
    private String GetValue() {

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
