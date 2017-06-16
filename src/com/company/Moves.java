package com.company;

/**
 * Created by rodneytressler on 6/14/17.
 */
public enum Moves {
    /**
     * This class is for both teaching enums and showing how we can associate permanent strings with permanent values
     */

    ROCK("rock"),
    PAPER("paper"),
    SCISSORS("scissors"),
    INVALID("invalid");

    private String move;

    Moves(String move) {
        this.move = move;
    }

    /**
     * Allows us to grab the value of the enum called.
     */
    public String getMove() {
        return move;
    }
}
