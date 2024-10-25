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
      System.out.println("2. sum of the digits of an integer");
      System.out.println("3. check if a nonnegative integer is a perfect number");
      System.out.println("4. average of the digits of an integer");
      System.out.println("5. check if there is a midpoint from three numbers");

      
      // takes user input for option
      Scanner input = new Scanner (System.in);
      System.out.print("Enter an option: ");
      int option = input.nextInt();
      
      if (option == 1) // factorial(n)
      // factorial of a number
      {
         int factorialNum = 0; // initialize variable for nput
         System.out.println(divider);
         System.out.println("1. factorial of a number (n!)");
         
         // check that input is nonnegative
         boolean factorialNumNegative = true; 
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
         System.out.println(factorialNum + "! = " + factorial(factorialNum));
         
      } else if (option == 2) { // sumOfDigits 
         int sumDigitNum = 0; // initialize variable for input
         System.out.println(divider);
         System.out.println("2. sum of the digits of an integer");
         
         // check that input is nonnegative
         boolean sumDigitNumNegative = true; 
         while (sumDigitNumNegative)
         {
            System.out.print("Input a nonnegative integer: ");
            sumDigitNum = input.nextInt();
            
            // check that sumDigitNum is a nonnegative number
            if (sumDigitNum < 0) 
            {
               sumDigitNumNegative = true;
               System.out.println("Error: integer must be nonnegative (> 0)");
            } else if (sumDigitNum >= 0) { // sumDigitNum is a nonnegative number
               sumDigitNumNegative = false;
            }
         }
         System.out.println("The sum of the digits of " + sumDigitNum + " = " + sumOfDigits(sumDigitNum));

      } else if (option == 3) { // isPerfect
         int isPerfectNum = 0; // initialize 
         System.out.println(divider);
         System.out.println("3. check if a nonnegative integer is a perfect number");
         
         // check that input is nonnegative
         boolean isPerfectNegative = true;
         while (isPerfectNegative)
         {
            System.out.print("Input a nonnegative integer: ");
            isPerfectNum = input.nextInt();
            
            // check that isPerfectNum is a nonnegative number
            if (isPerfectNum < 0) 
            {
               isPerfectNegative = true;
               System.out.println("Error: integer must be nonnegative (> 0)");
            } else if (isPerfectNum >= 0) { // isPerfectNum is a nonnegative number
               isPerfectNegative = false;
            }
         }
         // use method and display answer
         boolean isPerfect = isPerfect(isPerfectNum);
         if (isPerfect) // isPerfectNum = perfect number
         {
            System.out.println(isPerfectNum + " is a perfect number.");
         } else { // isPerfect = false
            System.out.println(isPerfectNum + " is not a perfect number.");
         
         }
      } else if (option == 4) { // averageDigit 
         int aDigitNum = 0; // initialize variable for input
         System.out.println(divider);
         System.out.println("4. average of the digits of an integer");
         
         // check that input is nonnegative
         boolean aDigitNumNegative = true; 
         while (aDigitNumNegative)
         {
            System.out.print("Input a nonnegative integer: ");
            aDigitNum = input.nextInt();
            
            // check that aDigitNum is a nonnegative number
            if (aDigitNum < 0) 
            {
               aDigitNumNegative = true;
               System.out.println("Error: integer must be nonnegative (> 0)");
            } else if (aDigitNum >= 0) { // sumDigitNum is a nonnegative number
               aDigitNumNegative = false;
            }
         }
         System.out.println("The average of the digits of " + aDigitNum + " = " + averageDigit(aDigitNum));
      } else if (option == 5) { // hasMidpoint
         boolean hasMidpoint; // method output
         int midpointNum1, midpointNum2, midpointNum3; // variables for user input and used in the method

         System.out.println(divider);
         System.out.println("5. check if there is a midpoint from three numbers");

         // takes user input
         System.out.print("Input first integer: ");
         midpointNum1 = input.nextInt();
         System.out.print("Input second integer: ");
         midpointNum2 = input.nextInt();
         System.out.print("Input third integer: ");
         midpointNum3 = input.nextInt();

         // use method 
         hasMidpoint = hasMidpoint(midpointNum1, midpointNum2, midpointNum3);
         if (hasMidpoint) {
            System.out.println("The integers " + midpointNum1 + ", " + midpointNum2 + ", and " + midpointNum3 + " have a shared midpoint.");
         } else { // hasMidpoint = false
            System.out.println("The integers " + midpointNum1 + ", " + midpointNum2 + ", and " + midpointNum3 + " do not have a shared midpoint.");
         }
         System.out.println(hasMidpoint(midpointNum1, midpointNum2, midpointNum3));

      } else {
         System.out.println("ERROR: did not input a valid option");
      }
   }
   
   public static int factorial (int n)
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
    
   public static int sumOfDigits (int n)
   // option 2: takes a nonnegative integer as a parameter and returns the sum of its digits
   {
      int sum = 0;
      while (n > 0)
      {
         sum = sum + n % 10; // remainder of num/10 = digit!
         n = n / 10; // dividing by 10 = next digit (unless it becomes a decimal > then exit)
      }
      
      return sum; // returns sum of digits
   }
   
   public static boolean isPerfect (int n)
   // option 3: takes a nonnegative integer and returns true if the number is a perfect number; false otherwise
   {
      boolean isPerfect = false; 
      int sum = 0;
      for (int i = n-1 ; i > 0 ; i--) // i = possible factors
      {
         if (n % i == 0)
         // if i is a factor of n, add i to the sum
         {
            sum = sum + i;
         }
      }
      // is the sum of n's factors = to n?
      if (sum == n)
      {
         isPerfect = true; // n is a perfect number
      } else {
         isPerfect = false;
      }
      return isPerfect;
   }
   
   public static double averageDigit(int n)
   // option 4: takes a nonnegative integer and returns the average of the digits in the number
   {
      // initialize variables
      int sum = 0;
      int digits = 0; 
      double average; 
      
      while (n > 0)
      {
         sum = sum + n % 10; // remainder of num/10 = digit!
         n = n / 10; // dividing by 10 = next digit (unless it becomes a decimal > then exit)
         digits++; // # of digits increases by 1
      }
      
      average = (sum/digits);
      return average;
   }
   public static boolean hasMidpoint(int a, int b, int c)
   // takes three integers as parameters and returns true if the average of any two of them is the third
   {
      boolean hasMidpoint;
      
      // check for all instances (3)
      if (((a+b)/2) == c) // if average of 2 nums = third num
      {
         hasMidpoint = true;
         // DEBUG: System.out.println("DEBUG: a+b/2 = c");
      } else if (((b+c)/2) == a) {
         hasMidpoint = true; 
         // DEBUG: System.out.println("DEBUG: b+c/2 = a");
      } else if (((a+c)/2) == b) {
         hasMidpoint = true; 
         // DEBUG: System.out.println("DEBUG: a+c/2 = b");
      } else {
         hasMidpoint = false;
      }
      
      return hasMidpoint;
   }
}