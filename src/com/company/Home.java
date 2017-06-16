package com.company;

/**
 * Created by rodneytressler on 6/14/17.
 */
public class Home implements HomeView{
    private Messages messages;
    private UserResponses userResponses;
    private GameLogic gameLogic;
    private Moves userMove;
    private Moves computerMove;
    private String result;

    /**Here we're initializing our classes and starting the game. */
    public void LoadApplication() {
        messages = new Messages();
        userResponses = new UserResponses(this);
        gameLogic = new GameLogic();
        startGame();

    }

    /**This is greeting the user, asking the user its move, setting field variables with the results
     * of the user's move and the computer's move before calculating the winner and displaying the results. */
    public void startGame() {
        messages.GreetUser();
        messages.querySelection();
        userResponses.getInterfaceSelection();
    }

    @Override
    public void gameSelected() {
        messages.QueryUser();
        userMove = userResponses.getChosenMove();
        computerMove = gameLogic.generateComputerMove();
        result = gameLogic.calculateWinner(userMove, computerMove);
        displayResult();
        startGame();
    }

    @Override
    public void statisticsSelected() {
        gameLogic.displayStatistics();
        startGame();
    }

    /**Printing out results of game. */
    private void displayResult() {
        System.out.println(result);
    }


}
