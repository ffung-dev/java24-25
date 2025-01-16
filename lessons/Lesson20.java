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
         for (int i = (int)(Math.ceil(a)); i <= b; i++)
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
         for (int i = (int)(Math.ceil(a)); i <= b ; i++)
         {
            sum += i;
         }
      }
      return sum;
   }
   
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      boolean valid = true;
      
      do
      {
         System.out.println("do you want to input integers or floating-point numbers?\n1 = integers\n0 = floating-point numbers");
         int choice = input.nextInt();
         if (choice == 1)
         // integers
         {
            System.out.println("enter first range number: ");
            int a = input.nextInt();
            System.out.println("enter second range number (must be greater than the first): ");
            int b = input.nextInt();
            System.out.println("sumRange: " + sumRange(a, b));
            valid = true;
         } else if (choice == 0) {
         // doubles
            System.out.println("enter first range number: ");
            double a = input.nextDouble();
            System.out.println("enter second range number (must be greater than the first): ");
            double b = input.nextDouble();
            System.out.println("sumRange: " + sumRange(a, b));
            valid = true;
         } else {
            valid = false;
            System.out.println("error: did not input valid option (1/0)");      
         }
      } while (!valid);
   }
   
}

