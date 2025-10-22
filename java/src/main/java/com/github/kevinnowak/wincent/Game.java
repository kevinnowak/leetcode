package com.github.kevinnowak.wincent;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private final int gameNumber;
    private int minX;
    private int minY;
    private int maxX;
    private int maxY;
    private int numberOfPlayers;
    private final List<Player> players;
    private Direction currentDirection;
    private int indexOfCurrentPlayer;
    private int numberOfThrows;
    private int[][] playingField;

    public Game(int gameNumber) {
        this.gameNumber = gameNumber;
        this.players = new ArrayList<>();
    }

    public void play() {
        if (hasInvalidGameData()) {
            System.out.printf("Game %d has invalid game data -> skipping...", gameNumber);
        }

        initializePlayingField();
        startThrowing();
    }

    private void startThrowing() {
        Player player = players.get(indexOfCurrentPlayer - 1);
        Direction next = currentDirection.next();

        // Probe to the direction until bound is reach and check if there is a number
        int probeRow = player.getArrayRow();
        int probeCol = player.getArrayCol();

        while (playingField[probeCol][probeRow] == 0 || playingField[probeCol][probeRow] == indexOfCurrentPlayer) {
            probeRow += next.changeRow;
            probeCol += next.changeCol;
        }


    }

    private boolean hasInvalidGameData() {
        return gameNumber < 1 ||
                numberOfPlayers != players.size() ||
                currentDirection == null ||
                (indexOfCurrentPlayer > 1 || indexOfCurrentPlayer > numberOfPlayers);
    }

    private void initializePlayingField() {
        int width = maxX - minX + 1;
        int height = maxY - minY + 1;
        playingField = new int[height][width];

        int xOffset = Math.max(Math.abs(maxX), Math.abs(minX));
        int yOffset = Math.max(Math.abs(maxY), Math.abs(minY));

        for (int i = 0; i < players.size(); i++) {
            Player player = players.get(i);
            int arrayCol = player.getxCoordinate() + xOffset;
            int arrayRow = player.getyCoordinate() * (-1) + yOffset;

            player.setArrayCol(arrayCol);
            player.setArrayRow(arrayRow);

            playingField[arrayRow][arrayCol] = i + 1;
        }
    }

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public void setNumberOfPlayers(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public boolean addPlayer(Player player) {
        return players.add(player);
    }

    public Direction getCurrentDirection() {
        return currentDirection;
    }

    public void setCurrentDirection(Direction currentDirection) {
        this.currentDirection = currentDirection;
    }

    public int getIndexOfCurrentPlayer() {
        return indexOfCurrentPlayer;
    }

    public void setIndexOfCurrentPlayer(int indexOfCurrentPlayer) {
        this.indexOfCurrentPlayer = indexOfCurrentPlayer;
    }

    public void setMinX(int minX) {
        this.minX = minX;
    }

    public void setMinY(int minY) {
        this.minY = minY;
    }

    public void setMaxX(int maxX) {
        this.maxX = maxX;
    }

    public void setMaxY(int maxY) {
        this.maxY = maxY;
    }
}
