package com.company;

/**
 * Created by rodneytressler on 6/14/17.
 */
public class Messages {
    /**This should all be self-explanatory. */


    public void GreetUser() {
        System.out.println("Prepare to battle in a game of rock, paper, scissors!\n");
    }

    public void QueryUser() {
        System.out.println("Pick a move!\n");
    }

    public String gameTie(String move) {
        return("You picked " + move + " and the computer picked " + move + ". Tie game!");
    }

    public String computerWins(String playerMove, String computerMove) {
        return ("You picked " + playerMove + " and the computer picked " + computerMove + ". Computer Wins!");
    }

    public String playerWins(String playerMove, String computerMove) {
        return ("You picked " + playerMove + " and the computer picked " + computerMove + ". You Win!");
    }
}
