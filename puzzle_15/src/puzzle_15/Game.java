package puzzle_15;
import java.util.*;

public class Game extends Board{
	public static int[][] move(int move,int board[][]){
		
        switch(move){
            case 1 -> {
                if(row-1>=0){
                    board[row][col] = board[--row][col];
                    board[row][col] = 0;
                }else
                    System.out.println("Invalid Move ?");
            }
            case 2 -> {
                if(row+1<n){
                    board[row][col] = board[++row][col];
                    board[row][col] = 0;
                }else
                    System.out.println("Invalid Move ?");
            }
            case 3 -> {
                if(col-1>=0){
                    board[row][col] = board[row][--col];
                    board[row][col] = 0;
                }else
                    System.out.println("Invalid Move ?");
            }
            case 4 -> {
                if(col+1<n){
                    board[row][col] = board[row][++col];
                    board[row][col] = 0;
                }else
                    System.out.println("Invalid Move ?");
            }
            default -> System.out.println("Invalid Move :");
        }
        return board;
    }
    
    public static boolean isWin(int board[][]){
        int iter=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]!=iter++){
                    return false;
                }if(iter==15)return true;
            }
        }
        return true;
    }
}
