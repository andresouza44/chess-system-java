package application;

import chess.ChessExecption;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ChessMatch chessMatch = new ChessMatch();
            while (true) {

                try {
                UI.clearScreen();
                UI.printBoard(chessMatch.getPieces());
                System.out.println();
                System.out.print("Soucer: ");
                ChessPosition source = UI.readChesPosition(sc);
                System.out.print("Targe: ");
                ChessPosition target = UI.readChesPosition(sc);
                ChessPiece capturedPiece = chessMatch.performChessMove(source, target);

                }
                catch (ChessExecption e) {
                    System.out.println(e.getMessage());
                    sc.nextLine();

                }

        }
    }
}
