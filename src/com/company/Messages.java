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

    public void querySelection() {
        System.out.println("Please select a valid option: \n" +
                "1. Play Game \n" +
                "2. View Statistics");
    }

    public void invalidResponse() {
        System.out.println("Invalid move, please try again");
    }

    public void showWinPercentage(int percent) {
        System.out.println("You have won " + percent + "% of your games.");
    }

    public void showGamesWon(int gamesWon) {
        System.out.println("You have won a total of " + gamesWon + " games.");
    }

    public void showGamesLost(int gamesLost) {
        System.out.println("You have lost a total of " + gamesLost + " games.");
    }

    public void showGamesDrawn(int gamesDrawn) {
        System.out.println("You have drawn a total of " + gamesDrawn + " games");
    }
}
