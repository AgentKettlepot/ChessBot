package GamePieces;
public class Queen extends Piece{
    static int[] pos;
    static int[] isAlive;
    boolean Color;
    public Queen(int x, int y, boolean isAlive, boolean Color){
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
        if (new_pos[0]==curr_pos[0]) return true; //straights
        if (new_pos[1]==curr_pos[1]) return true;
        if (Math.abs(new_pos[0] - curr_pos[0]) == Math.abs(new_pos[1] - curr_pos[1])) return true; //diagonals
        return false;
    }

    public String toString(){
        if (Color){
            return "Black Queen";
        }
        else{
            return "White Queen";
        }
    }
}
