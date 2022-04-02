package GamePieces;
public class Pawn extends Piece{
    static int[] pos = new int[2];
    boolean isAlive;
    boolean Color;
    public Pawn(int x, int y, boolean isalive, boolean color){
        //super(x, y, isAlive, Color);
        pos[0] = x;
        pos[1] = y;
        isAlive = isalive;
        Color = color;

    }

    public int[] Move(int[][] board, int[] curr_pos, boolean color, int[] new_pos){
        if (IsOkMove(board, curr_pos, color, new_pos)){
            if (color == true){ //black will be on bottom
                if (board[curr_pos[0]][curr_pos[1] + 1]==' '){ //if the space directly above is empty
                    curr_pos = new_pos;
                }
            }
            else{ //white will be on top
                if (board[curr_pos[0]][curr_pos[1]]==' '){ //if the space directly below is empty
                    curr_pos = new_pos;
                }
            }
            return curr_pos;
        }
        else return curr_pos;
    }
    
    public int[] Eat(int[][] board, int[] curr_pos, boolean color, int[] new_pos){
        if (color == true){ //black eat white
            if (board[curr_pos[0]+1][curr_pos[1] + 1]!=' ' ||
                board[curr_pos[0]-1][curr_pos[1] + 1]!=' '){ 
                curr_pos = new_pos;
            }
        }

        if (color == false){ //white eat black
            if (board[curr_pos[0]+1][curr_pos[1] - 1]!=' '
            || board[curr_pos[0]-1][curr_pos[1] - 1]!=' '){ 
                curr_pos = new_pos;
            }
        }
        return curr_pos;
    }
    public static boolean IsOkMove(int[][] board, int[] curr_pos, boolean color, int[] new_pos){
        if (color == true){ //black eat white
            if (board[curr_pos[0]+1][curr_pos[1] + 1]==' ' ||
                board[curr_pos[0]-1][curr_pos[1] + 1]==' '){ 
                return true;
            }
        }
        else{
            if (board[curr_pos[0]+1][curr_pos[1] - 1]==' '
            || board[curr_pos[0]-1][curr_pos[1] - 1]==' '){ 
                return true;
            }
        }
        return false;
    }

    public String toString(){
        if (Color){
            return "Black Pawn";
        }
        else{
            return "White Pawn";
        }
    }
}
