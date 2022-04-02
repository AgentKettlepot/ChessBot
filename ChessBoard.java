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

    public String printBoard(){
        String res = "";
        for (int r=0; r<board.length; r++){
            for (int c=0; c<board[0].length; c++){
                if (board[r][c]==null){
                    res += " ";
                }
                else{
                    res +=board[r][c].toString();
                }
         
            }
            res +="\n";
        }
        return res;
    }

}
