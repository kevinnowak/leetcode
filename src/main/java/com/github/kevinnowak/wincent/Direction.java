package com.github.kevinnowak.wincent;

public enum Direction {
    N(-1, 0),
    NE(-1, 1),
    E(0, 1),
    SE(1, 1),
    S(1, 0),
    SW(1, -1),
    W(0, -1),
    NW(-1, -1);

    final int changeCol;
    final int changeRow;

    Direction(int changeRow, int changeCol) {
        this.changeCol = changeCol;
        this.changeRow = changeRow;
    }

    public Direction next() {
        Direction[] values = values();
        int nextIndex = (ordinal() + 1) % values.length;

        return values[nextIndex];
    }
}
