package boardgame;

import chess.Color;

public abstract class Piece {
    protected Position position;
    private Board board;
    private Color color;

    public Piece(Board board) {
        this.board = board;
        this.position = null;
    }

    public Color getColor() {
        return color;
    }

    protected Board getBoard() {
        return board;
    }

    public abstract boolean [][] possibleMoves();

    public boolean possibleMove( Position position){
        return possibleMoves()[position.getRow()][position.getColumn()];

    }
    public boolean isThereAnyPossibleMoce(){
        boolean [][] mat = possibleMoves();
        for (int i=0; i< mat.length; i++){
            for ( int j =0; j< mat.length; j++){
                if (mat[i][j]){
                    return true;

                }
            }
        }
        return  false;
    }
}
