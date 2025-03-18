//*****************************************************
//    Lesson27.java        Author: Fiona Fung
//
//    Stores student grades in an array and prints info
//*****************************************************

import java.util.Scanner;

public class Lesson27
{
   public static void main (String[] args)
   {
      // create variables, scanner, array
      Scanner input = new Scanner(System.in); // takes user inputs
      int limit;
      double sum = 0;
      double average;
      String name;
      
      System.out.print("hi! what's your name?  ");
      name = input.nextLine();
      
      System.out.print("\nnumber of grades to input: ");
      limit = input.nextInt();
      double[] grades = new double[limit];
      
      // input grades
      for (int i = 0; i < limit; i++)
      {
         System.out.print("\ninput grade " + (i + 1) + ": ");
         grades[i] = input.nextDouble();
      }
      
      // print out grades
      System.out.println("\n" + name + "'s grades :)");
      for (int j = 0; j < limit; j++)
      {
         if (j == limit - 1)
         {
            System.out.print(grades[j] + "   ");
         } else {
            System.out.print(grades[j] + ",  ");
         }
      }
      
      // print out average
      for (int k = 0; k < limit; k++)
      {
         sum += grades[k];
      }
      average = sum/limit;
      System.out.println("\naverage = " + average);
      
      input.close();
   }

}