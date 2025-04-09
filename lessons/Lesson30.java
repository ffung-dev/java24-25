//**************************************************************************
//    Lesson30.java              Author: Fiona Fung
// 
//    using 2D arrays to make a multiplication table
//**************************************************************************

public class Lesson30
{
   public static void main (String[] args)
   {
      // table[array arr in table][object in arr]
      // creates array table
      int[][] table = new int[9][9];
      
      // input values in table
      for (int row = 0 ; row < table.length ; row++) // rows
      {
         for(int col = 0 ; col < table[row].length ; col++) // columns
         {
            table[row][col] = (row + 1) * (col + 1);
         }
      }
      
      // print out table
      System.out.println("the multiplication table");
      for (int row = 0 ; row < table.length ; row++)
      {
         for(int col = 0 ; col < table[row].length ; col++)
         {
            System.out.print(table[row][col] + "\t");
         }
         System.out.println();
      }
      
      // jagged array (bottom)
      int[][] second = new int[9][];
      for (int row = 0 ; row < second.length ; row++)
      {
         second[row] = new int[1 + row];
         for (int col = 0 ; col < second[row].length ; col++)
         {
            second[row][col] = (row + 1) * (col + 1);
         }
      }
      // print out mult.table
      System.out.println("\n\njagged multiplication table (bottom)");
      for (int row = 0 ; row < second.length ; row++)
      {
         for (int col = 0 ; col < second[row].length ; col++)
         {
            System.out.print(second[row][col] + "\t");
         }
         System.out.println();
      }
      
      // jagged array (top)
      int[][] third = new int[9][9];
      for (int row = 0 ; row < third.length ; row++)
      {
         // third[row] = new int[9];
         // problem found: changing both the number of elements per array in each row and also having the if statement in the print loop does not work
         for (int col = 0 ; col < third[row].length ; col++)
         {
            third[row][col] = (row + 1) * (col + 1);
            // debug : System.out.println(row + " " + col + " " + third[row][col]);
         }
      }
      
      // print out mult. table
      System.out.println("\n\njagged multiplication table (top)");
      for (int row = 0 ; row < third.length ; row++)
      {
         for (int count = 0 ; count < row ; count++)
         {
            System.out.print("\t");
         }
        
         for (int col = 0 ; col < third[row].length ; col++)
         {
            if ( col < row )
            {
                System.out.print("");
            } else {
                System.out.print(third[row][col] + "\t");
            }
         }
         System.out.println();
      }

      
   }
}