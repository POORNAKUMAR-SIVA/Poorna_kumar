/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tic_tac_toe;

/**
 *
 * @author spoor
 */
public class Board {
    public static int n=3;
    public static char[][] board = new char[n][n];
    
    public static char[][] boardGenerate(){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j] = ' ';
            }
        }
        return board;
    }
    
    public static void printBoard(){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(" "+board[i][j]+"  |");
            }System.out.println("\n -- | -- | -- ");
        }
    }
  
    
}
