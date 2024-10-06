package boardgame;

import static java.lang.constant.ConstantDescs.NULL;

public class Board {
    private  int rows;
    private  int columns;
    private  Piece[][] pieces;

    public Board(int rows, int columns){


        pieces = new Piece[rows][columns];
    }

    public int getRows() {
        return rows;
    }



    public int getColumns() {
        return columns;
    }



    public Piece piece (int row, int column){
        if(!positionExists(row,column)){
            throw new IllegalArgumentException("Position not on the board ");
        }
        return pieces[row][column];
    }
    public Piece piece(Position position){
        return pieces[position.getRow()][position.getColumn()];
    }

    public void placePiece(Piece piece, Position position){
        pieces[position.getRow()][position.getColumn()] =piece;
        piece.position =position;
    }

    private boolean positionExists(int row, int column){
      return row >=0 && row < row && column >=0 && column <column;
    }
    public boolean positionExists(Position position){
    return positionExists(position.getRow(),position.getColumn());
    }
    public boolean thereISAPiece(Position position){
      return piece(position)!= NULL;
    }
}
