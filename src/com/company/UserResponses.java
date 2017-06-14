package com.company;

import java.util.Scanner;

/**
 * Created by rodneytressler on 6/14/17.
 */
public class UserResponses {
    private Scanner scanner = new Scanner(System.in);
    private boolean validMove = false;

    /**Queries the user for their move and makes sure it's a valid response before moving on. */
    public Moves getChosenMove() {
        while(!validMove) {
            String move = scanner.next();
            switch (move.toLowerCase()) {
                case "rock" :
                    validMove = true;
                    return Moves.ROCK;
                case "paper" :
                    validMove = true;
                    return Moves.PAPER;
                case "scissors" :
                    validMove = true;
                    return Moves.SCISSORS;
                default:
                    System.out.println("Invalid move, please try again");
                    validMove = false;
                    break;
            }
        }
        return Moves.INVALID;
    }
}
