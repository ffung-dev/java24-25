//*********************************************
// Methods.java       Author: Fiona Fung
//
// mini-project: using and creating methods (5)
//*********************************************

import java.util.*;

public class Methods
{
   public static void main (String[] args)
   // displays menu & asks user for inputs
   {
      String divider = "---------------------";
      System.out.println(divider);
      // menu display
      System.out.println("1. factorial of a number (n!)");
      
      
      // takes user input for option
      Scanner input = new Scanner (System.in);
      System.out.print("Enter an option: ");
      int option = input.nextInt();
      
      if (option == 1) // factorial(n)
      // factorial of a number
      {
         int factorialNum = 0; // initialize
         System.out.println(divider);
         System.out.println("1. factorial of a number (n!)");

         boolean factorialNumNegative = true; 
         // check that input (factorialNum) >= 0
         while (factorialNumNegative)
         {
            System.out.print("Input a nonnegative integer: ");
            factorialNum = input.nextInt();
            
            if (factorialNum < 0) 
            {
               factorialNumNegative = true;
               System.out.println("Error: integer must be nonnegative (> 0)");
            } else if (factorialNum >= 0) { // factorialNum is a nonnegative number!
               factorialNumNegative = false;
            }
         }
         // returns factorialNum!
         System.out.println(factorial(factorialNum));
         
      } else if (option == 2) { // sumOfDigits 
         int sumDigitNum = 0; // initialize
         System.out.println(divider);
         System.out.println("2. sum of digits in an integer");
         
         boolean sumDigitNumNegative = true; 
         // check that input (sumDigitNum) >= 0
         while (sumDigitNumNegative)
         {
            System.out.print("Input a nonnegative integer: ");
            sumDigitNum = input.nextInt();
            
            if (sumDigitNum < 0) 
            {
               sumDigitNumNegative = true;
               System.out.println("Error: integer must be nonnegative (> 0)");
            } else if (sumDigitNum >= 0) { // factorialNum is a nonnegative number!
               sumDigitNumNegative = false;
            }
         }
         System.out.println(sumOfDigits(sumDigitNum));

      } else if (option == 3) {
      
      }
   }
   
   public static int factorial(int n)
   // option 1: factorial (returns the product n * (n – 1) * … * 2 * 1)
   {
      int product = n; // product of n!, starts with n
      for (int i = n-1 ; i > 0 ; i--) // repeat
      {
         product = (product * i);
         // System.out.println("DEBUG: " + i + " " + n + " " + product);
         // won't work if the integer is too big
      }
      
      return product;
   }
   
   public static int sumOfDigits(int n)
   // option 2: takes a nonnegative integer as a parameter and returns the sum of its digits
   {
      int sum = n;
      return sum;
   }
   
   
}