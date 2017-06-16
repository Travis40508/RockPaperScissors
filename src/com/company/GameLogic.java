package com.company;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by rodneytressler on 6/14/17.
 */
public class GameLogic {
    private Messages messages;
    private int gamesPlayed = 0;
    private int gamesWon = 0;
    private int gamesLost = 0;
    private int gamesDrawn = 0;
    private int rockCount = 0;
    private int paperCount = 0;
    private int scissorsCount = 0;

    public GameLogic() {
        messages = new Messages();
    }

    /**
     * Calculates a random computer move. 1/3 chance of each move.
     */
    public Moves generateComputerMove() {
        int randomNum = ThreadLocalRandom.current().nextInt(0, 8);
        if (randomNum < 3) {
            return Moves.ROCK;
        } else if (randomNum < 6) {
            return Moves.PAPER;
        } else {
            return Moves.SCISSORS;
        }
    }

//    /** Calculates a computer move based on an AI model. */
//    public Moves generateComputerMove() {
//        if(rockCount > scissorsCount && rockCount > paperCount) {
//            return Moves.PAPER;
//        } else if (paperCount > rockCount && paperCount > scissorsCount) {
//            return Moves.SCISSORS;
//        } else if (scissorsCount > rockCount && scissorsCount > paperCount) {
//            return Moves.ROCK;
//        } else {
//            return generateRandomMove();
//        }
//    }

    /**
     * Calculates winner based on user move and computer move.
     */
    public String calculateWinner(Moves userMove, Moves computerMove) {
        gamesPlayed += 1;
        if (userMove == Moves.ROCK) {
            rockCount += 1;
            switch (computerMove) {
                case ROCK:
                    gamesDrawn += 1;
                    return messages.gameTie(userMove.getMove());
                case PAPER:
                    gamesLost += 1;
                    return messages.computerWins(userMove.getMove(), computerMove.getMove());
                case SCISSORS:
                    gamesWon += 1;
                    return messages.playerWins(userMove.getMove(), computerMove.getMove());
            }
        } else if (userMove == Moves.PAPER) {
            paperCount += 1;
            switch (computerMove) {
                case PAPER:
                    gamesDrawn += 1;
                    return messages.gameTie(userMove.getMove());
                case SCISSORS:
                    gamesLost += 1;
                    return messages.computerWins(userMove.getMove(), computerMove.getMove());
                case ROCK:
                    gamesWon += 1;
                    return messages.playerWins(userMove.getMove(), computerMove.getMove());
            }
        } else if (userMove == Moves.SCISSORS) {
            scissorsCount += 1;
            switch (computerMove) {
                case SCISSORS:
                    gamesDrawn += 1;
                    return messages.gameTie(userMove.getMove());
                case ROCK:
                    gamesLost += 1;
                    return messages.computerWins(userMove.getMove(), computerMove.getMove());
                case PAPER:
                    gamesWon += 1;
                    return messages.playerWins(userMove.getMove(), computerMove.getMove());
            }
        }
        return null;
    }

    public void displayStatistics() {
        int percent = (gamesWon * 100) / gamesPlayed;
        messages.showWinPercentage(percent);
        messages.showGamesPlayed(gamesPlayed);
        messages.showGamesWon(gamesWon);
        messages.showGamesLost(gamesLost);
        messages.showGamesDrawn(gamesDrawn);
    }

    public Moves generateRandomMove() {
        int randomNum = ThreadLocalRandom.current().nextInt(0, 8);
        if (randomNum < 3) {
            return Moves.ROCK;
        } else if (randomNum < 6) {
            return Moves.PAPER;
        } else {
            return Moves.SCISSORS;
        }
    }
}
