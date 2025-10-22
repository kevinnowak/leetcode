package com.github.kevinnowak.wincent;

import java.util.ArrayList;
import java.util.List;

public class TestInput {

    private int numberOfGames;
    private List<Game> games;

    public TestInput() {
        this.games = new ArrayList<>();
    }

    public boolean addGame(Game game) {
        return games.add(game);
    }

    public int getNumberOfGames() {
        return numberOfGames;
    }

    public void setNumberOfGames(int numberOfGames) {
        this.numberOfGames = numberOfGames;
    }

    public List<Game> getGames() {
        return games;
    }

    public void setGames(List<Game> games) {
        this.games = games;
    }
}
