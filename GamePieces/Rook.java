package GamePieces;
public class Rook extends Piece{
    static int[] pos;
    static int[] isAlive;
    boolean Color;
    public Rook(int x, int y, boolean isAlive, boolean Color){
        super(x, y, isAlive, Color);
    }

    public int[] Move(int[][] board, int[] curr_pos, boolean color, int[] new_pos){
        if (IsOkMove(board, curr_pos, color, new_pos)){
           curr_pos = new_pos;
        }
        return curr_pos;
    }
    
    public int[] Eat(int[][] board, int[] curr_pos, boolean color, int[] new_pos){
        if (IsOkMove(board, curr_pos, color, new_pos)){
            curr_pos = new_pos;
        }
        return curr_pos;
    }
    public static boolean IsOkMove(int[][] board, int[] curr_pos, boolean color, int[] new_pos){
        if (new_pos[0]==curr_pos[0]) return true;
        if (new_pos[1]==curr_pos[1]) return true;
        return false;
    }

    public String toString(){
        if (Color){
            return "Black Rook";
        }
        else{
            return "White Rook";
        }
    }
}
