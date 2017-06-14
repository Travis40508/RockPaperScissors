package com.company;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by rodneytressler on 6/14/17.
 */
public class GameLogic {
    private Messages messages;

    /**Calculates a random computer move. 1/3 chance of each move. */
    public GameLogic() {
        messages = new Messages();
    }
    public Moves generateComputerMove() {
        int randomNum = ThreadLocalRandom.current().nextInt(0, 9);
        if(randomNum < 3) {
            return Moves.ROCK;
        } else if(randomNum < 6) {
            return Moves.PAPER;
        } else {
            return Moves.SCISSORS;
        }
    }

    /**Calculates winner based on user move and computer move. */
    public String calculateWinner(Moves userMove, Moves computerMove) {
        if(userMove == Moves.ROCK) {
            switch (computerMove) {
                case ROCK:
                    return messages.gameTie(userMove.getMove());
                case PAPER:
                    return messages.computerWins(userMove.getMove(), computerMove.getMove());
                case SCISSORS:
                    return messages.playerWins(userMove.getMove(), computerMove.getMove());
            }
        } else if (userMove == Moves.PAPER) {
            switch (computerMove) {
                case PAPER:
                    return messages.gameTie(userMove.getMove());
                case SCISSORS:
                    return messages.computerWins(userMove.getMove(), computerMove.getMove());
                case ROCK:
                    return messages.playerWins(userMove.getMove(), computerMove.getMove());
            }
        } else if (userMove == Moves.SCISSORS) {
            switch (computerMove) {
                case SCISSORS:
                    return messages.gameTie(userMove.getMove());
                case ROCK:
                    return messages.computerWins(userMove.getMove(), computerMove.getMove());
                case PAPER:
                    return messages.playerWins(userMove.getMove(), computerMove.getMove());
            }
        }
        return null;
    }
}
