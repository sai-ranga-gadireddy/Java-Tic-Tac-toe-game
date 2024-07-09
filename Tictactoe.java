import java.util.io.*;
import java.util.*;

class TicTacToe {
  public static void main(String[] args) 
  {
    char[][] g_board = {                   // creating gameboard
      {'','|',''.'|',''},
      {'-','-','-','-','-','-'},
      {'','|','','|',''},
      {'-','-','-','-','-','-'}
      {'','|','','|',''}
  };
print_board(g_board);

static void print_board(char [][]g_board)
  {
    for(int i=0;i<g_board;i++)              //initialize&looping gameboard
      {
      for(int j=0;j<g_board[0].length;j++)
        {
          System.out.print(g_board[i][j]);
        }
        System.out.println();
      }
  }
}
