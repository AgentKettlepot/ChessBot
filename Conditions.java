public class Conditions {
    public boolean IsCheckMate(ChessBoard board){
        return false;
    }

    public boolean IsCheck(ChessBoard board){
        return false;
    }

    public boolean IsNothing(ChessBoard board, boolean IsCheck, boolean IsCheckMate){
        return (IsCheck==false && IsCheckMate==false);
    }
}
