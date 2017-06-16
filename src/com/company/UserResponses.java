package com.company;

import java.util.Scanner;

/**
 * Created by rodneytressler on 6/14/17.
 */
public class UserResponses {
    private Scanner scanner = new Scanner(System.in);
    private Messages messages;
    private boolean validMove = false;
    private HomeView view;

    public UserResponses(HomeView view) {
        this.view = view;
        messages = new Messages();
    }

    /**
     * Queries the user for their move and makes sure it's a valid response before moving on.
     */
    public Moves getChosenMove() {
        validMove = false;
        while (!validMove) {
            String move = scanner.next();
            switch (move.toLowerCase()) {
                case "rock":
                    validMove = true;
                    return Moves.ROCK;
                case "paper":
                    validMove = true;
                    return Moves.PAPER;
                case "scissors":
                    validMove = true;
                    return Moves.SCISSORS;
                default:
                    messages.invalidResponse();
                    validMove = false;
                    break;
            }
        }
        return Moves.INVALID;
    }

    public void getInterfaceSelection() {
        boolean isValidResponse = false;
        while (!isValidResponse) {
            String response = scanner.next();
            switch (response) {
                case "1":
                    isValidResponse = true;
                    view.gameSelected();
                    break;
                case "2":
                    isValidResponse = true;
                    view.statisticsSelected();
                    break;
                case "3":
                    isValidResponse = true;
                    view.exitApplicationSelected();
                default:
                    messages.invalidResponse();
                    break;
            }
        }
    }
}
