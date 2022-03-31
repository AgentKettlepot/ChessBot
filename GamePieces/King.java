package GamePieces;
public class King extends Piece{
    static int[] pos;
    static int[] isAlive;
    static int[] Color;
    public King (int[] pos, boolean isAlive, boolean Color){
        super(pos, isAlive, Color);
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
        if (Math.abs(new_pos[0] - curr_pos[0]) <=1) return true;
        else if (Math.abs(new_pos[1] - curr_pos[1]) <=1) return true;
        return false;
    }
}
