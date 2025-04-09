//********************************************************
//    MatrixMethods.java      Author: Fiona Fung
//
//    2d array tasks with user input
//********************************************************

import java.util.Scanner; 

public class MatrixMethods
{
   // main method: all input/outputs here
   public static void main(String[] args)
   {
      // create variables, scanner
      String div = "--------------------------";
      String menu = "1. sum of row\n2. average of rows\n3. largest row";
      Scanner input = new Scanner(System.in); // takes user input
      boolean tryAgain = true; // determines whether to run program again
      int choice; // task choice (1-3)
      boolean validChoice = true; // makes sure that task choice is between 1-3
      int rows, cols; // for user input; amount of rows and columns in the matrix
      
      do
      {
         // user creates a two dimensional array
         System.out.println(div + "\n    create a matrix ! ");
         System.out.print("enter number of rows: " );
         rows = input.nextInt();
         System.out.print("enter number of columns: ");
         cols = input.nextInt();
         int[][] array = new int[rows][cols];
         // user inputs values into array
         for (int row = 0 ; row < array.length ; row++)
         {
            for (int col = 0 ; col < array[row].length ; col++)
            {
               System.out.print("enter element in row " + row + ", column " + col + " :  "); 
               array[row][col] = input.nextInt();
            }
         } 
         // print out user's array
         System.out.println("\nyou entered:");
         for (int row = 0 ; row < array.length ; row++) // prints out one row at a time
         {
            System.out.println(toString(array, row));
         }         
         // tasks (3)
         System.out.println(div + "\n" + menu);
         // loop to make sure user inputs a value = 1,2, or 3
         do
         {
            System.out.print("take your pick: ");
            choice = input.nextInt();
            if (choice == 1 || choice == 2 || choice == 3)
            {
               validChoice = true;
            } else {
               validChoice = false;
               System.out.println("user did not input a valid option, try again");
            }
         } while (!validChoice); // asks again if validChoice = false
         
         // runs task based on user choice
         if (choice == 1)
         {
            // sumOfRow
            int inputChoice1;
            System.out.print("enter row: ");
            inputChoice1 = input.nextInt();
            System.out.println("sum of values in row " + inputChoice1 + " : " + sumOfRow(array, inputChoice1));
         } else if (choice == 2) {
            // averageOfRows
            System.out.println("average of all rows : " + averageOfRows(array));
         }
         // asks user if they want to try again
         boolean choseOpt = false; 
         int againOpt;
         while (!choseOpt)
         {
            System.out.print ("\n  1 = yes\n  0 = no\nuse again? ");
            againOpt = input.nextInt();
            if (againOpt == 1)
            {
               // use again
               tryAgain = true;
               choseOpt = true;
            } else if (againOpt == 0) {
               // do not use again / quit
               tryAgain = false; 
               choseOpt = true;
            } else {
               System.out.println("user did not input an option, try again.");
               choseOpt = false; // did not choose an option, enter again
            }
         }
      } while (tryAgain); // repeats if user inputs 1 (yes)
   }
   
   // returns array as a string
   public static String toString(int[][] arr, int row)
   {
      String result = "";
      for (int col = 0 ; col < arr[row].length ; col++)
      {
         result += arr[row][col] + " ";
      }
      return result;
   }
   
   // takes both an integer matrix and an integer as parameters and returns the sum of the elements in that row
   public static int sumOfRow(int[][] arr, int row)
   {
      int sum = 0;
      for (int col = 0 ; col < arr[row].length ; col++)
      {
         sum += arr[row][col];
      }
      return sum;
   }
   
   // takes an integer matrix as a parameter and returns the average of all row sums in the matrix
   public static double averageOfRows(int[][] arr)
   {
      double average = 0;
      double totalSum = 0;
      for (int row = 0 ; row < arr.length ; row++)
      {
         totalSum += sumOfRow(arr, row);
      }
      average = totalSum / 2;
      return average;
   }
   
   //takes an integer matrix as a parameter and returns the row index with the largest sum
   public static int largestRow(int[][] arr)
   {
      int largestRow = 0;
      
      return largestRow;
   }
}