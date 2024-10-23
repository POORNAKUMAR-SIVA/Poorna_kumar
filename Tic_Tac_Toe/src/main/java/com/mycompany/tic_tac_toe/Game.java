/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tic_tac_toe;
import java.util.*;
/**
 *
 * @author spoor
 */
public class Game extends Board{
    
        
    public static boolean checkValid(int x,int y){
        if((x>=0 && x<n) && (y>=0 && y<n) && board[x][y]==' ')
            return true;
        return false;
    }
    
    public static boolean checkWin(char a){
        for(int i=0;i<n;i++){
            if(board[i][0] == a && board[i][1] == a && board[i][2] == a ){
                return true;
            }
            if(board[0][i] == a && board[1][i] == a && board[2][i] == a ){
                return true;
            }
        }
        if(board[0][0] == a && board[1][1] == a && board[2][2] == a ){
                return true;
        }
        if(board[0][2] == a && board[1][1] == a && board[2][0] == a ){
                return true;
        }
        return false;
    }
    
    public static void startGame(){
        
        Board.boardGenerate();
        Board.printBoard();
        
        boolean isTrue = true,isX = true,isO = true;
        int x=0,y=0,iter=0;
        
        Scanner sc = new Scanner (System.in);
        
        while(isTrue){
            isX = true;
            isO = true;
            while(isX){
                System.out.println("Enter the Position of X player1: ");

                x=sc.nextInt();
                y=sc.nextInt();

                if(checkValid(x,y)){
                    board[x][y] = 'X';
                    isX = false;
                    iter++;
                }else
                    System.out.println("Enter Valid position: \n\n");
            }
            
            printBoard();
            
            if(iter == 9){
                System.out.println("Game Drawed..!!");
                isTrue=false;
            }
            if(checkWin('X')){
                System.out.println("Player1 Won the Game..!!");
                isTrue=false;
            }
            while(isO && isTrue){
                System.out.println("Enter the Position of Y player2: ");

                x=sc.nextInt();
                y=sc.nextInt();

                if(checkValid(x,y)){
                    board[x][y] = 'O';
                    isO = false;
                    iter++;
                }else
                    System.out.println("Enter Valid position: ");
            }
            
            printBoard();
            
            if(checkWin('O')){
                System.out.println("Player2 Won the Game..!!");
                isTrue=false;
            }
        }
    }
}
