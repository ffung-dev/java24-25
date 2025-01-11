//***********************************************************
//       Lesson20.java        Author: Fiona Fung         
//
//    overloaded method: sumRange
//***********************************************************

import java.util.Scanner;

public class Lesson20
{
   public static int sumRange(int a, int b)
   {
      int sum = 0;
      if (b < a) // error message, return 0
      {
         System.out.println("error: second number is less than the first");
         return 0;
      } else {
         for (int i = a; i <= b; i++)
         {
            sum += i;
         }
      }
      return sum;
   }
   
   public static int sumRange(double a, double b) // overloaded method that accepts floating point #s
   {
      int sum = 0; 
      if (b < a) // error message, return 0
      {
         System.out.println("error: second number is less than the first");
         return 0;
      } else {
         for (int i = (int)(a); i < b ; i++)
         {
            sum += i;
         }
      }
      return sum;
   }
   
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      System.out.println("do you want to input integers or floating-point numbers?\n1 = integers\n0 = floating-point numbers");
      int choice = input.nextInt();
      if (choice == 1)
      {
      }
      System.out.println("enter first range number: ");
      double a = input.nextDouble();
      System.out.println("enter second range number (must be greater than the first): ");
      double b = input.nextDouble();
      System.out.println("sumRange: " + sumRange(a, b));
   }
}
