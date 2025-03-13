//*******************************************************
//    Lesson26.java        Author: Fiona Fung
//
//    Lesson 26: arrays
//*******************************************************

import java.util.Scanner;

public class Lesson26
{
   public static void main (String[] args)
   {
      /* part 1
      int a[] = new int[1000];
      a[1000] = 200;
      
      result: "Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 1000 out of bounds for length 1000" error
      because the length of the array is 1000, but the indices are from 0 to 999 
      */
      
      /* part 2
      when i tried to compile the file HugeArray.java, the program ran an error because N*N*N*N is too great of a number (for integer types)
      */
      // part 3
      // create scanner for user input
      Scanner input = new Scanner(System.in);
      
      System.out.print("input the length of the arrays: ");
      int n = input.nextInt();
      System.out.println("length of each array: " + n);
      
      // arrays (vectors of length N)
      int vector1[] = new int[n];
      int vector2[] = new int[n];
      
      System.out.print("\ninput values of vector1");
      for (int i = 0; i < n; i++)
      {
         System.out.print("\nvalue " + i + ": ");
         vector1[i] = input.nextInt();
      }
      
      System.out.print("\ninput values of vector2");
      for (int i = 0; i < n; i++)
      {
         System.out.print("\nvalue " + i + ": ");
         vector2[i] = input.nextInt();
      }
      
      // calculate euclidean distance
      double distance; 
      double sum = 0;
      for (int i = 0; i < n; i++)
      {
         sum += Math.pow((vector2[i] - vector1[i]), 2);
      }
      distance = (double)Math.sqrt(sum);
      System.out.println("Euclidean distance of vectors 1 and 2: " + distance);
   }
}