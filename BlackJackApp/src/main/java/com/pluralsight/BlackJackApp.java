package com.pluralsight;

import java.util.Scanner;

public class BlackJackApp {
    static Scanner myScanner = new Scanner(System.in);
    //creates the deck
    static Deck deck = new Deck();
    //create hand
    static Hand dealer = new Hand();
    static Hand hand1 = new Hand();

    public static void main(String[] args) {
        //creates welcome message
        welcome();

        //ask user for their name
        String name = askName();

        //shuffles the deck and deals it
        deck.shuffle();
        deal();

        System.out.println(name + " hand is worth: " + hand1.getValue());
        boolean actionRunning = true;
        while(actionRunning){
            if(hand1.getValue() == 21){
                System.out.println("BLACKJACK! You win!");
                actionRunning = false;
                break;
            }
            String actionChoice = action().toLowerCase();
            switch (actionChoice){
                case "h":
                    hit();
                    System.out.println(name + " hand is now worth: " + hand1.getValue());
                    if(hand1.getValue() > 21){
                        System.out.println("You have busted, dealer wins! \nBetter luck next time!");
                        actionRunning = false;
                    }
                    break;
                case "s":
                    stand();
                    actionRunning = false;
                    break;
                case "f":
                    System.out.println("You have folded and lost! Better luck next time!");
                    actionRunning = false;
                    break;
            }
        }

        if(dealer.getValue() <21 && hand1.getValue() < 21) {
            dealerAction();
            if(dealer.getValue() < 21 && hand1.getValue() < 21){
                getWinner(name);
            }
        }



    }

    public static void welcome(){
        System.out.println("Welcome to the Kasino!");
        System.out.println("\n \n \n");
    }
    public static String askName(){
        System.out.println("What is your name?");
        String name = myScanner.nextLine();
        System.out.println("\n \n \n");
        return name;
    }
    public static void deal(){
        for(int i = 0; i < 2; i++){
            Card playerCard = deck.deal();
            hand1.deal(playerCard);
            Card dealerCard = deck.deal();
            dealer.deal(dealerCard);
        }
    }

    public static String action(){
        String action = "";
        while(true) {
            System.out.println("What would you like to do? \n[H] Hit \n[S] Stand \n[F] Fold");
            action = myScanner.nextLine();
            break;
        }
        return action;
    }

    public static void hit(){
        System.out.println("\n \n \n");
        System.out.println("You chose hit");
        Card playerCard = deck.deal();
        hand1.deal(playerCard);

    }
    public static void stand(){

        System.out.println("You chose stand");

    }
    public static void dealerAction(){
        System.out.println("\n \n \n");
        if(dealer.getValue() == 21){
            System.out.println("The dealer hit BLACKJACK! You lose!");
            return;
        }
        boolean dealerAction = true;
        while(dealerAction){
            if (dealer.getValue() <=16) {
                dealerHit();
                System.out.println("The dealer hits! \nThe dealer now has: " + dealer.getValue());
            }else if(dealer.getValue() > 21) {
                System.out.println("The dealer busted! You win!");
                dealerAction = false;
            }else {
                System.out.println("The dealer stands with " + dealer.getValue());
                dealerAction = false;
            }
        }
    }
    public static void dealerHit(){
        System.out.println("\n \n \n");
        System.out.println("The dealer shows: " + dealer.getValue());
        Card dealerCard = deck.deal();
        dealer.deal(dealerCard);

    }
    public static void getWinner(String name){
        if(dealer.getValue()<=21 && hand1.getValue() < dealer.getValue()){
            System.out.println("The dealer wins with " + dealer.getValue() + " over the " + name + "'s " + hand1.getValue());
        }else if(hand1.getValue()<=21 && dealer.getValue() < hand1.getValue()){
            System.out.println(name +" wins with " + hand1.getValue() + " over the dealer's " + dealer.getValue());
        }else if(dealer.getValue() == hand1.getValue()){
            System.out.println("Nobody wins!");
        }
    }


}
