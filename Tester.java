//Input: 8x8 2D Array
import GamePieces.*;

public class Tester{
    public static void main (String[] args){
        ChessBoard Testboard = new ChessBoard();
        Piece p1 = new Pawn(0, 1, true, true);
        Testboard.AddPiece(p1);
        Piece p2 = new Pawn(1, 1, true, true);
        Testboard.AddPiece(p2);
        Piece p3 = new Pawn(2, 1, true, true);
        Testboard.AddPiece(p3);
        Piece p4 = new Pawn(3, 1, true, true);
        Testboard.AddPiece(p4);
        Piece p5 = new Pawn(4, 1, true, true);
        Testboard.AddPiece(p5);
        Piece p6 = new Pawn(5, 1, true, true);
        Testboard.AddPiece(p6);
        Piece p7 = new Pawn(6, 1, true, true);
        Testboard.AddPiece(p7);
        Piece p8 = new Pawn(7, 1, true, true);
        Testboard.AddPiece(p8);

        Piece p9 = new Pawn(0, 6, true, false);
        Testboard.AddPiece(p9);
        Piece p10 = new Pawn(1, 6, true, false);
        Testboard.AddPiece(p10);
        Piece p11 = new Pawn(2, 6, true, false);
        Testboard.AddPiece(p11);
        Piece p12 = new Pawn(3, 6, true, false);
        Testboard.AddPiece(p12);
        Piece p13 = new Pawn(4, 6, true, false);
        Testboard.AddPiece(p13);
        Piece p14 = new Pawn(5, 6, true, false);
        Testboard.AddPiece(p14);
        Piece p15 = new Pawn(6, 6, true, false);
        Testboard.AddPiece(p15);
        Piece p16 = new Pawn(7, 6, true, false);
        Testboard.AddPiece(p16);

        Piece BlackQueen = new Queen(4, 0, true, true);
        Testboard.AddPiece(BlackQueen);
        Piece BlackKing = new King(3, 0, true, true);
        Testboard.AddPiece(BlackKing);
        Piece WhiteQueen = new Queen(3, 7, false, true);
        Testboard.AddPiece(WhiteQueen);
        Piece WhiteKing = new King(4, 7, false, true);
        Testboard.AddPiece(WhiteKing);

        Piece BlackRook1 = new Rook(0, 0, true, true);
        Testboard.AddPiece(BlackRook1);
        Piece BlackRook2 = new Rook(7, 0, true, true);
        Testboard.AddPiece(BlackRook2);
        Piece WhiteRook1 = new Rook(0, 7, false, false);
        Testboard.AddPiece(WhiteRook1);
        Piece WhiteRook2 = new Rook(7, 7, false, false);
        Testboard.AddPiece(WhiteRook2);

        Piece BlackKnight1 = new Rook(1, 0, true, true);
        Testboard.AddPiece(BlackKnight1);
        Piece BlackKnight2 = new Rook(6, 0, true, true);
        Testboard.AddPiece(BlackKnight2);
        Piece WhiteKnight1 = new Rook(1, 7, false, false);
        Testboard.AddPiece(WhiteKnight1);
        Piece WhiteKnight2 = new Rook(6, 7, false, false);
        Testboard.AddPiece(WhiteKnight2);
        
        Piece BlackBishop1 = new Rook(2, 0, true, true);
        Testboard.AddPiece(BlackBishop1);
        Piece BlackBishop2 = new Rook(5, 0, true, true);
        Testboard.AddPiece(BlackBishop2);
        Piece WhiteBishop1 = new Rook(2, 7, false, false);
        Testboard.AddPiece(WhiteBishop1);
        Piece WhiteBishop2 = new Rook(5, 7, false, false);
        Testboard.AddPiece(WhiteBishop2);

        System.out.println(Testboard.printBoard());
        //Get User to input every piece
    }
}