package GamePieces;
public class Pawn extends Piece{
    static int[] pos;
    static int[] isAlive;
    static int[] Color;
    public Pawn(int[] pos, boolean isAlive, boolean Color){
        super(pos, isAlive, Color);
    }

    public int[] Move(int[][] board, int[] curr_pos, boolean color){
        if (color == true){ //black will be on bottom
            if (board[curr_pos[0]][curr_pos[1] + 1]==' '){ //if the space directly above is empty
                curr_pos[0] ++;
            }
        }
        else{ //white will be on top
            if (board[curr_pos[0]][curr_pos[1]]==' '){ //if the space directly below is empty
                curr_pos[0] --;
            }
        }
        return curr_pos;
    }
    public int[] Eat(int[][] board, int[] curr_pos, boolean color){
        if (color == true){ //black eat white
            if (board[curr_pos[0]+1][curr_pos[1] + 1]!=' '){//if the space diagonal above is NOT empty
                curr_pos[0]++;
                curr_pos[1]++;
            }
            else if (board[curr_pos[0]-1][curr_pos[1] + 1]!=' '){ 
                curr_pos[0]--;
                curr_pos[1]++;
            }
        }

        if (color == false){ //white eat black
            if (board[curr_pos[0]+1][curr_pos[1] - 1]!=' '){//if the space diagonal above is NOT empty
                curr_pos[0]++;
                curr_pos[1]--;
            }
            else if (board[curr_pos[0]-1][curr_pos[1] - 1]!=' '){ 
                curr_pos[0]--;
                curr_pos[1]--;
            }
        }
        return curr_pos;
    }
}
