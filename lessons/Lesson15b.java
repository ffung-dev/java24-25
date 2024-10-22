//**************************************************************
// Lesson15b.java          Author: Fiona Fung
//
// creating and using methods: sumOfValues & isPrime
//**************************************************************

import java.util.*;

public class Lesson15b
{
   public static void main (String[] args) 
   {
        // main method
      Scanner input = new Scanner (System.in);
      int tryAgain = 0; // 0 = try again; 1 = exit
      int option; // which method to use
      String divider = "- - - - - - - - - - - - - - - - - - - ";
      

      while (tryAgain == 0) // as long as the user inputs 0 to try again
      {
        System.out.println("1. sum of values between two numbers (inclusive)\n2. check if an integer is a prime number\n3. check if an integer is a semiprime number");
        System.out.println(divider);
        System.out.print("Pick an option:  ");
        option = input.nextInt(); // takes the number that the user inputs > code to run

        if (option == 1) // sumOfValues
        {
            int sumNum1, sumNum2; // need to make new variables since the variables from the method will NOT carry over
            System.out.println(divider);
            System.out.println("1. sum of values between two numbers (inclusive)");              
      
            do // will ask for number first
            {
                System.out.print("Input first number:  ");
                sumNum1 = input.nextInt();                
                System.out.print("Input second number (must be greater than the first number):  ");
                sumNum2 = input.nextInt();

                if (sumNum1 >= sumNum2) // if numbers do not meet requirements
                {
                    System.out.println("Error: second number must be greater than the first number.\n");
                } else { // if numbers meet requirements
                    System.out.println("First number: " + sumNum1);
                    System.out.println("Second number: " + sumNum2);
                }
            } while (sumNum1 >= sumNum2); // will repeat if numbers do not meet requirements
            System.out.println("The sum of values (inclusive) between " + sumNum1 + " and " + sumNum2 + " is " + sumOfValues(sumNum1,sumNum2)); // using first method!

        } else if (option == 2) { // isPrime
            int numberPrime;
            boolean isPrimeNum;
            System.out.println(divider);
            System.out.println("2. check if an integer is a prime number");
            System.out.print("Input a number: ");
            numberPrime = input.nextInt(); // takes user input

            isPrimeNum = isPrime(numberPrime); 
            if (isPrimeNum)
            {
                System.out.println(numberPrime + " is a prime number.");
            } else {
                System.out.println(numberPrime + " is not a prime number.");
            }
            System.out.println("isPrimeNum: " + isPrimeNum);

        } else if (option == 3) { // isSemiPrime
            int numberSemiPrime;
            boolean isSemiPrime;
            System.out.println(divider);
            System.out.println("3. check if an integer is a semiprime number");
            System.out.print("Input a number: ");
            numberSemiPrime = input.nextInt();

            isSemiPrime = isSemiPrime(numberSemiPrime);
            if (isSemiPrime)
            {
                System.out.println(numberSemiPrime + " is a semiprime number.");
            } else {
                System.out.println(numberSemiPrime + " is not a semiprime number.");
            }
        } else {
            System.out.println("Error: did not input a valid option");
        }
        System.out.println(divider);
        // asks if the user wants to run code again
        System.out.println("0. yes\n1. no"); 
        System.out.print("Try again?  ");
        tryAgain = input.nextInt();
        System.out.println(divider);
    }
       input.close();
   }


   public static int sumOfValues(int i, int j) 
   {
   // a method that returns sum of the values between i and j
      int sum = 0; // intialize by giving value
      for (int num = i ; num <= j; num++) // while first number is less than or equal to the second number
      {
         // DEBUG MESSAGE: //System.out.println("Debug:num = " + num);
         sum = sum + num; // takes value of sum and ADDS to it
      }
      return sum; 
      
   }


   public static boolean isPrime (int n) 
   {
      boolean isPrime = true;
      
      if (n <=1 ) //  special cases
      {
        isPrime = false; 
        return isPrime; 
      }

      for (int i = n - 1; i != 1 && isPrime == true ; i--) 
      {
         if (n % i == 0)
         {
            isPrime =  false;            
         } 
         //System.out.println("Debug:i = " + i); 
         //System.out.println("Debug:isPrime = " + isPrime);         
      }
     
      //System.out.println("Debug:num = " + num);
      //System.out.println("Debug:isPrime = " + isPrime);
      return isPrime;      
      
   }

   
   public static boolean isSemiPrime(int n) 
   {
      int i;
      
      // loop through all possible factors excluding 1 and itself ; 
      for (i = n - 1 ; i > 1 ; i--)
         // number of prime factors
      {

         int quotient = n / i ; // other factor 
         // DEBUG System.out.println(iPrime);
         if ((n % i == 0) && (isPrime(i)) && isPrime(quotient)) // i must be factor and prime, and checking that the corresponding factor is also prime
         {
            return true; // n is semiprime 
         }
         //DEBUG System.out.println(factor + " " + i );
      }
      return false ; // else
   }
}