package com.github.kevinnowak.wincent;

public class Player {

    private final int xCoordinate;
    private final int yCoordinate;
    private int arrayCol;
    private int arrayRow;

    public Player(int positionX, int positionY) {
        this.xCoordinate = positionX;
        this.yCoordinate = positionY;
    }

    public int getxCoordinate() {
        return xCoordinate;
    }

    public int getyCoordinate() {
        return yCoordinate;
    }

    public void setArrayCol(int arrayCol) {
        this.arrayCol = arrayCol;
    }

    public void setArrayRow(int arrayRow) {
        this.arrayRow = arrayRow;
    }

    public int getArrayCol() {
        return arrayCol;
    }

    public int getArrayRow() {
        return arrayRow;
    }
}
