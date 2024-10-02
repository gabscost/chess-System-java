import boardgame.Board;
import boardgame.Position;
import chess.ChessMatch;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());

    }
}