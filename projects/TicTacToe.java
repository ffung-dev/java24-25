//*************************************************************
//    TicTacToe.java                 Author: Fiona Fung
//
//    a two-player game of tic-tac-toe 
//*************************************************************

import java.util.Scanner;

public class TicTacToe
{
   public static void main (String[] args)
   {
      // in-game variables
      String[] boardPlace = {"   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   "}; // entire board (0-2: top; 3-5: middle; 6-8: bottom)
      String div = " | ";
      String boardGuide = " 1 " + div + " 2 " + div + " 3 "  + "\n" + " 4 " + div + " 5 " + div + " 6 " + "\n" + " 7 " + div + " 8 " + div + " 9 "; // shown every time a move is made
      String board = boardPlace[0] + div + boardPlace[1] + div + boardPlace[2] + "\n" + boardPlace[3] + div + boardPlace[4] + div + boardPlace[5] + "\n" + boardPlace[6] + div + boardPlace[7] + div + boardPlace[8];
      String optMenu = "    1 = yes\n    0 = no \n";
      // 1 = yes
      // 0 = no
      Scanner input = new Scanner(System.in);
      int playAgain = 0;
      boolean validAgain = true;
      int keepWins = 0;
      boolean validKeep = true;

      // player variables
      // X = player 1
      // O = player 2
      int winner = -1;
         // 0 = no winner
         // 1 = player 1 wins
         // 2 = player 2 wins
         // 3 = tie~
      int player = 1; // player 1 goes first
      int choice = 0; // choose spot on board
      String symbol = "   ";
      boolean valid = false; // check if spot is taken or not
      String turn = "player " + player + " : enter your move (1-9)";
      int[] winCount = { 0 , 0 , 0 , 0 };
      // winCount[0] = uncounted ; [1] = player 1 ; [2] = player 2 ; [3] = ties
         
      do 
      {
         System.out.print(optMenu);
         System.out.print("Would you like to keep track of player wins?  ");
         keepWins = input.nextInt();
         if (keepWins != 1 && keepWins != 0)
            {
               System.out.println("Error: enter a valid option (1/0)");
               validKeep = false;
            } else {
               validKeep = true;
            }
       } while (!validKeep);
      System.out.println("----------------\n");
      
      do
      {
         // gameplay :)
         System.out.println(" tic - tac - toe ");
         do 
         {
            System.out.println("----------------\n" + boardGuide);
            turn = "player " + player + " : enter your move (1-9)";
            while (!valid)
            {
               System.out.println(turn);
               choice = input.nextInt();
               valid = (boardPlace[choice - 1] == "   "); // true if there is a space, false if there is already an X / O there
               
               if (!valid) 
               {
                  System.out.println("invalid move!");
               }
            }    
           
            symbol = playSymbol(player); // determine which symbol will be placed
            // DEBUG : System.out.println("valid " + boardPlace[choice - 1] + symbol);
            boardPlace[choice - 1] = symbol;
            // update board
            board = boardPlace[0] + div + boardPlace[1] + div + boardPlace[2] + "\n" + boardPlace[3] + div + boardPlace[4] + div + boardPlace[5] + "\n" + boardPlace[6] + div + boardPlace[7] + div + boardPlace[8];
            System.out.println(board);
            
            // reset / next turn
            player = nextTurn(player);
            valid = false; 
            
            // 1  |  2  |  3 
            // 4  |  5  |  6 
            // 7  |  8  |  9 
            
            // is there a winner yet??
            winner = checkWin(boardPlace);
            // 0 = no winner
            // 1 = player 1 wins
            // 2 = player 2 wins
            // 3 = tie~
            switch (winner) {
               case 0:
               winner = 0;
               break;
               
               case 1:
               System.out.println("game over ~ player 1 wins!");
               break;
               
               case 2:
               System.out.println("game over ~ player 2 wins!");
               break;
               
               case 3:
               System.out.println("game over ~ tie!");
               break;
               
               default: 
               System.out.println("ERROR IN WINNER SWITCH");
               break;
               
            }
         } while (winner == 0); // game continues when there is no winner  
         // score count if keepWins = 1
         if (keepWins == 1)
         {
            System.out.println(" score count ~ ");
            switch (winner)
            {
               case 1 :
                  winCount[1]++;
                  break;
               case 2 : 
                  winCount[2]++;
                  break;
               case 3 :
                  winCount[3]++;
                  break;
            }  
            System.out.println(" player 1 : " + winCount[1] + "\n player 2 : " + winCount[2] + "\n ties : " + winCount[3]);
         }
         
         // asks if user wants to play again
         do
         {
            System.out.println("----------------");
            System.out.print(optMenu + "  Play again?  ");
            playAgain = input.nextInt();
            if (playAgain != 1 && playAgain != 0)
            {
               System.out.println("Error: enter a valid option (1/0)");
               validAgain = false;
            } else {
               validAgain = true;
            }
         } while (!validAgain);
         System.out.println("----------------");
         String[] newBoardPlace = {"   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   "}; // resets board after a game
         boardPlace = newBoardPlace;
         
      } while (playAgain == 1);

      input.close();
   }
      
   
   public static String playSymbol(int player)
   // determines which symbol is used depending on the player
   {
      String symbol = "   ";
      if (player == 1)
      {
         symbol = " X ";
      } else if (player == 2) {
         symbol = " O ";
      } else {
         symbol = "error: invalid player";
      }
      
      return symbol;
   }
   
   public static int nextTurn(int player)
   // changes player to next turn
   {
      int turn = 0;
      if (player == 1) {
         turn = 2; // player 2's turn
      } else if (player == 2) {
         turn = 1; // player 1's turn
      } else {
         System.out.println("error: nextTurn error"); 
      }
      
      return turn;
   }
   
   public static int checkWin(String[] board)
   {
   // checks for winner, no winner, or tie
      // 0  |  1  |  2 
      // 3  |  4  |  5 
      // 6  |  7  |  8 
      int winner = 0;
         // 0 = no winner
         // 1 = player 1 wins
         // 2 = player 2 wins
         // 3 = tie~
      int checkWin = -1;
         // 0 = 0-1-2
         // 1 = 3-4-5
         // 2 = 6-7-8
         // 3 = 0-3-6
         // 4 = 1-4-7
         // 5 = 2-5-8
         // 6 = 0-4-8
         // 7 = 2-4-6
      boolean filled = false;
      
      // check if the entire board is filled or not
      for (int i = 0; i < 9 ; i++)
      {
         if (board[i] != "   ")
         {
            filled = true;
            
         } else {
            filled = false;
            break;
         }  
         // DEBUG: System.out.println(board[i] + filled);  
      }
      
      // check if there is a win instance
      if (board[0] == board[1] && board[1] == board[2] && board[0] != "   ")
      {
         checkWin = 0;
      } else if (board[3] == board[4] && board[4] == board[5] && board[3] != "   ") {
         checkWin = 1;
      } else if (board[6] == board[7] && board[7] == board[8] && board[6] != "   ") {
         checkWin = 2; 
      } else if (board[0] == board[3] && board[3] == board[6] && board[0] != "   ") {
         checkWin = 3;
      } else if (board[1] == board[4] && board[4] == board[7] && board[1] != "   ") {
         checkWin = 4;
      } else if (board[2] == board[5] && board[5] == board[8] && board[2] != "   ") {
         checkWin = 5;
      } else if (board[0] == board[4] && board[4] == board[8] && board[0] != "   ") {
         checkWin = 6;
      } else if (board[2] == board[4] && board[4] == board[6] && board[2] != "   ") {
         checkWin = 7;
      } else {
      // no win 
         checkWin = -1;
      }
      
     
      
      if (checkWin != -1)
      // there is a winner
      {
         // DEBUG: System.out.println("in checkWin " + checkWin);
         switch (checkWin)
         {
            case 0:
               if (board[0].equals(" X "))
               {
                  winner = 1;
               } else if (board[0].equals(" O ")) {
                  winner = 2;
               }
               break;
            case 1:
               if (board[3].equals(" X "))
               {
                  winner = 1;
               } else if (board[3].equals(" O ")) {
                  winner = 2;
               }
               break;
            case 2:
               if (board[6].equals(" X "))
               {
                  winner = 1;
               } else if (board[6].equals(" O ")) {
                  winner = 2;
                  
               }
               break;

            case 3:
               if (board[0].equals(" X "))
               {
                  winner = 1;
               } else if (board[0].equals(" O ")) {
                  winner = 2;
               }
               break;

            case 4:
               if (board[1].equals(" X "))
               {
                  winner = 1;
               } else if (board[1].equals(" O ")) {
                  winner = 2;
               }
               break;

            case 5:
               if (board[2].equals(" X "))
               {
                  winner = 1;
               } else if (board[2].equals(" O ")) {
                  winner = 2;
               }
               break;

            case 6:
               if (board[0].equals(" X "))
               {
                  winner = 1;
               } else if (board[0].equals(" O ")) {
                  winner = 2;
               }
               break;
            case 7:
               // DEBUG: System.out.println("in case 7");
               if (board[2].equals(" X "))
               {
                  winner = 1;
               } else if (board[2].equals(" O ")) {
                  winner = 2;
               }
               break;
            
            default:
               System.out.println("ERROR IN CHECKWIN SWITCH");
               break;
         }

      } else if (filled) {
      // tie
         // DEBUG: System.out.println("filled board");
         winner = 3;      
      } else if (checkWin == -1) {
      // no winner
         // DEBUG: System.out.println("no winner");
         winner = 0;
      }
      // DEBUG: System.out.println("winner = " + winner);
      return winner;   
   }
}