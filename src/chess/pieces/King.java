package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public class King extends ChessPiece {
    public King(Board board, Color Color) {
        super(board, Color);
    }
    @Override
    public String toString(){
        return "K";
    }
}
