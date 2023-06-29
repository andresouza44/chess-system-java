package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;
import chesspiece.King;
import chesspiece.Rook;

public class ChessMatch {
    Board board;

    public ChessMatch() {
        board = new Board(8, 8);
        initialSetup();

    }

    public ChessPiece[][] getPieces() {
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColums()];
        for (int i = 0; i < board.getRows(); i++) {
            for (int j = 0; j < board.getColums(); j++) {
                mat[i][j] = (ChessPiece) board.piece(i, j);
            }
        }
        return mat;
    }
    public void initialSetup(){
        board.placePiece(new Rook(board,Color.WHITE),new Position(2,1));
        board.placePiece(new Rook(board,Color.WHITE),new Position(6,3));
        board.placePiece(new King(board,Color.WHITE),new Position(2,2));
    }

}
