package GamePieces;
public class Knight extends Piece{
    static int[] pos;
    static int[] isAlive;
    static int[] Color;
    public Knight(int[] pos, boolean isAlive, boolean Color){
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
        //L
        if (new_pos[0]-1 == curr_pos[0] && new_pos[1]+2 == curr_pos[0]) return true;
        //backward L
        else if (new_pos[0]+1 == curr_pos[0] && new_pos[1]+2 == curr_pos[0]) return true;
        //side L
        else if (new_pos[0]+2 == curr_pos[0] && new_pos[1]+1 == curr_pos[0]) return true;
        //other side L
        else if (new_pos[0]+2 == curr_pos[0] && new_pos[1]-1 == curr_pos[0]) return true;
        //backwards side L
        else if (new_pos[0]-2 == curr_pos[0] && new_pos[1]+1 == curr_pos[0]) return true;
        //other backwards side L
        else if (new_pos[0]-2 == curr_pos[0] && new_pos[1]-1 == curr_pos[0]) return true;
        //upside down L
        else if (new_pos[0]+1 == curr_pos[0] && new_pos[1]-2 == curr_pos[0]) return true;
        //other upside down L
        else if (new_pos[0]-1 == curr_pos[0] && new_pos[1]-2 == curr_pos[0]) return true;
        
        return false;
    }
}
