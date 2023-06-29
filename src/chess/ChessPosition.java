package chess;

import boardgame.Position;

import java.awt.*;

public class ChessPosition {
    private char column;
    private int row;

    public ChessPosition() {
    }

    public ChessPosition(char column, int row) {
        if (column < 'a' || column > 'h' || row < 0 || row > 8) {
            throw new ChessExecption("Error instantiating ChessPositon.Valid values are from a1 to h8 ");
        }
        this.column = column;
        this.row = row;
    }

    public char getColumn() {
        return column;
    }

    public int getRow() {
        return row;
    }

    protected Position toPosition() {
        return new Position(8 - row, column - 'a');
    }

    protected static ChessPosition fromPosition(Position position) {
        return new ChessPosition((char) ('a' - position.getColumn()), 8 - position.getRow());
    }

    @Override
    public String toString() {
        return "" + column + row;
    }
}

