package com.game_logic;
import com.game_environment.*;
import java.util.Stack;


public class Game_menu {
    public static void main(String[] args) {
        Stack
        Table table = new table

    }

    public static void prtinf() {

    }


    public static void print_Menu(Table table){
        System.out.println("Player 1 hand: ");
        System.out.println(table.getPlayer1().print_hand());
        System.out.println("");
        System.out.println(table.getPlayingField1().peek().print_card() + "          " + table.getPlayingField1().peek().print_card());
        System.out.println("");
        System.out.println("Player 2 hand: ");
        System.out.println(table.getPlayer2().print_hand());
    }
}
