package puzzle_15;
import java.util.*;

public class StartGame extends Game{
public static void start(){
        
        boardGenerate();
        //System.out.flush();
        printBoard(board);
        
        boolean isTrue=true;
        
        Scanner sc = new Scanner(System.in);
        
        while(isTrue){
            System.out.println("Enter your choice:\n 1.Move Up \n 2.Move Down \n 3.Move Left \n 4.Move Right \n 5.Exit \n");
            int choice = sc.nextInt();
            
            switch(choice){
                case 1 -> board=move(choice,board);
                case 2 -> board=move(choice,board);
                case 3 -> board=move(choice,board);
                case 4 -> board=move(choice,board);
                case 5 -> isTrue = false;
                default -> System.out.println("Enter Valid Option");
            }
            //System.out.flush();
            printBoard(board);
            if(Game.isWin(board)){
                isTrue=false;
                System.out.println("You Won the Game...... !!");
            }
        }
    }
}
