package GamePieces;

public class Piece {
    public static int[] pos;
    public static boolean IsAlive;
    public static boolean Color; //true = black, false = white
    public Piece(){
        pos = new int[2];
        IsAlive = false;
        Color = false;
    }
    public Piece(int[] curr_pos, boolean status, boolean color){
        pos = curr_pos;
        IsAlive = status;
        Color = color;
    }

    public static int[] getPos(){
        return pos;
    }
    public static boolean getAlive(){
        return IsAlive;
    }
    public static boolean getColor(){
        return Color;
    }
}
