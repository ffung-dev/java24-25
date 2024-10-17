//**************************************************************
// Lesson15b.java          Author: Fiona Fung
//
// creating and using methods
//**************************************************************

import java.util.*;

public class Lesson15b 
{
   public static void main (String[] args)
   {
      Scanner input = new Scanner (System.in);
      System.out.println("1.  sum of values between two numbers (inclusive)");
      System.out.println(sumOfValues(1,3));
   }
   
   public static int sumOfValues(int i, int j)
   {
   // a method that returns sum of the values between i and j
      int sum = 0; // intialize by giving value
      for (int num = i ; num <= j; num++) 
      {
         // DEBUG MESSAGE: System.out.println("Debug:num = " + num);
         sum = sum + num; // takes value of sum and ADDS to it
      }
      return sum;
      
   }
   
}