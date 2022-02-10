//Input: 8x8 2D Array
//Output: A true/false for each possible scenario
public class Tester{
    public static void main (String[] args){
        ChessBoard Testboard = new ChessBoard();
        Testboard.AddPiece(0, 0, 'r');
        Testboard.AddPiece(7, 0, 'r');
        Testboard.AddPiece(1, 0, 'k');
        Testboard.AddPiece(6, 0, 'k');
        Testboard.AddPiece(2, 0, 'b');
        Testboard.AddPiece(5, 0, 'b');
        Testboard.AddPiece(3, 0, 'q');
        Testboard.AddPiece(4, 0, 'k');
        Testboard.AddPiece(0, 0, 'r');
        Testboard.AddPiece(0, 0, 'r');
        Testboard.AddPiece(0, 0, 'r');
        Testboard.AddPiece(0, 0, 'r');
        Testboard.AddPiece(0, 0, 'r');
        Testboard.AddPiece(0, 0, 'r');
        Testboard.AddPiece(0, 0, 'r');

        //Get User to input every piece
    }
}