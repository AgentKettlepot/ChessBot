public class ChessBoard {
    char[][] board;
    boolean checkMate = false;
    boolean check = false;
    boolean nothing =true;
    public ChessBoard(){
        board = new char[8][8];
    }

    public void AddPiece(int row, int column, char c){
        this.board[row][column] = c;
    }

    public void AddPawn(int row){
        for (int i=0; i<8; i++) {
            board[row][i] = 'p';
        }
    }
}
