package puzzle_15;
import java.util.*;

public class Board {
	public static int n=4,row=3,col=3;
    public static int[][] board = new int[n][n];
    
    public static int[][] boardGenerate(){
        ArrayList<Integer> array = new ArrayList<Integer>();
        for(int i=1;i<n*n;i++){
            array.add(i);
        }
        Collections.shuffle(array);
        array.add(0);
        
        int iter=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j] = array.get(iter++);
            }
        }
        return board;
    }
    
    public static void printBoard(int board[][]){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]==0)
                    System.out.print("   |");
                else
                    System.out.print(" "+board[i][j]+" |");
            }System.out.println("");
        }
    }
}
