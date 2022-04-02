package GamePieces;

public class Bishop extends Piece{
    static int[] pos;
    static int[] isAlive;
    Boolean Color;
    public Bishop (int x, int y, boolean isAlive, boolean Color){
            super(x, y, isAlive, Color);
        }
        
    public int[] Move(int[][] board, int[] curr_pos, boolean color, int[] new_pos){
            if (board[new_pos[0]][new_pos[1]]==' '){ //king movement
                curr_pos = new_pos;
            }
        return curr_pos;
    }

    public int[] Eat(int[][] board, int[] curr_pos, boolean color, int[] new_pos){
        if (board[new_pos[0]][new_pos[1]]!=' '){ 
            curr_pos = new_pos;
            }
        return curr_pos;
    }

    public static boolean IsOkMove(int[][] board, int[] curr_pos, boolean color, int[] new_pos){
            if (Math.abs(new_pos[0] - curr_pos[0]) == Math.abs(new_pos[1] - curr_pos[1])) return true;
                return false;
            }

    public String toString(){
        if (Color){
            return "Black Bishop";
        }
        else{
             return "White Bishop";
        }
            }
        }
        