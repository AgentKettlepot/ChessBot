import GamePieces.Piece;

public class ChessBoard {
    Piece[][] board;
    boolean checkMate = false;
    boolean check = false;
    boolean nothing =true;
    public ChessBoard(){
        board = new Piece[8][8];
    }

    public void AddPiece(Piece p){
        this.board[p.getPos()[0]][p.getPos()[1]] = p;
    }

}
