package com.github.kevinnowak.wincent;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {

    static TestInput getTestInputFromFileName(final String fileName) {
        File file = new File(fileName);
        TestInput testInput = new TestInput();

        try (Scanner scanner = new Scanner(file)) {

            if (scanner.hasNextLine()) {
                testInput.setNumberOfGames(Integer.parseInt(scanner.nextLine()));
            }

            for (int i = 0; i < testInput.getNumberOfGames() && scanner.hasNextLine(); i++) {
                Game game = new Game(i + 1);
                game.setNumberOfPlayers(Integer.parseInt(scanner.nextLine()));

                int minX = 0;
                int minY = 0;
                int maxX = 0;
                int maxY = 0;

                for (int j = 0; j < game.getNumberOfPlayers() && scanner.hasNextLine(); j++) {
                    String line = scanner.nextLine();
                    String[] arr = line.split(" ");

                    if (arr.length > 1) {
                        int xValue = Integer.parseInt(arr[0]);
                        int yValue = Integer.parseInt(arr[1]);

                        minX = Math.min(minX, xValue);
                        minY = Math.min(minY, yValue);
                        maxX = Math.max(maxX, xValue);
                        maxY = Math.max(maxY, yValue);

                        Player player = new Player(xValue, yValue);
                        game.addPlayer(player);
                    }
                }

                game.setMinX(minX);
                game.setMinY(minY);
                game.setMaxX(maxX);
                game.setMaxY(maxY);

                if (scanner.hasNextLine()) {
                    game.setCurrentDirection(Direction.valueOf(scanner.nextLine().trim().toUpperCase()));
                }

                if (scanner.hasNextInt()) {
                    game.setIndexOfCurrentPlayer(Integer.parseInt(scanner.nextLine()));
                }

                testInput.addGame(game);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return testInput;
    }

    public static void main(String[] args) {
        TestInput testInput = getTestInputFromFileName("src/main/java/com/github/kevinnowak/wincent/input");
        testInput.getGames().forEach(Game::play);
    }
}
