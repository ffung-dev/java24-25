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
        System.out.println("1. sum of values between two numbers (inclusive)3. check if an integer is a semiprime number");
        System.out.println("2. check if an integer is a prime number");
        System.out.println("3. check if an integer is a semiprime number");
        System.out.println("4. check if an integer is a twin prime number");
        System.out.println("5. check if an integer is a Chen prime number");
        System.out.println("6. check if an integer is a cousin prime number");
        
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
            
        } else if (option == 4) { // isTwinPrime
          // 0 = n is not prime
          // 1 = n is a prime number but is not a twin prime
          // 2 = n is a twin prime number
            int isTwinPrime;
            int numberTwinPrime;
            System.out.println(divider);
            System.out.println("4. check if an integer is a twin prime number");
            System.out.print("Input a number: ");
            numberTwinPrime = input.nextInt();
            
            isTwinPrime = isTwinPrime(numberTwinPrime);
            
            if (isTwinPrime == 0) { // n is not prime
               System.out.println(numberTwinPrime + " is not a prime number, so it is not a twin prime number.");
            } else if (isTwinPrime == 1) { // n is prime but not a twin prime
               System.out.println(numberTwinPrime + " is a prime number, but is not a twin prime number.");
            } else if (isTwinPrime == 2) { // n is a twin prime
               System.out.println(numberTwinPrime + " is a twin prime number.");
            } else { // error
               System.out.println("ERROR");
            }
            
         } else if (option == 5) { // isChenPrime
         // 0 = p is not prime
         // 1 = p is prime but not a chen prime
         // 2 = p is a chen prime
             int isChenPrime;
             int numberChenPrime;
             System.out.println(divider);
             System.out.println("5. check if an integer is a Chen prime number");
             System.out.print("Input a number: ");
             numberChenPrime = input.nextInt();
             
             isChenPrime = isChenPrime(numberChenPrime);
             
             if (isChenPrime == 0) 
             { // n is not prime
                System.out.println(numberChenPrime + " is not a prime number, so it is not a Chen prime number.");
             } else if (isChenPrime == 1) { // n is prime but not a chen prime
                System.out.println(numberChenPrime + " is a prime number, but is not a Chen prime number.");
             } else if (isChenPrime == 2) { // n is a chen prime
                System.out.println(numberChenPrime + " is a Chen prime number.");
             } else { // error
                System.out.println("ERROR");
             }

         } else if (option == 6) {// isCousinPrime
             // 0 = p is not prime
             // 1 = p is prime but not a cousin prime
             // 2 = p is a cousin prime
            int isCousinPrime;
            int numberCousinPrime;
            System.out.println(divider);
             System.out.println("6. check if an integer is a cousin prime number");
             System.out.print("Input a number: ");
             numberCousinPrime = input.nextInt();
             
             isCousinPrime = isCousinPrime(numberCousinPrime);
             
             if (isCousinPrime == 0) 
             { // n is not prime
                System.out.println(numberCousinPrime + " is not a prime number, so it is not a cousin prime number.");
             } else if (isCousinPrime == 1) { // n is prime but not a cousin prime
                System.out.println(numberCousinPrime + " is a prime number, but is not a cousin prime number.");
             } else if (isCousinPrime == 2) { // n is a cousin prime
                System.out.println(numberCousinPrime + " is a cousin prime number.");
             } else { // error
                System.out.println("ERROR");
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
   
   public static int isTwinPrime (int n)
      // twin prime: a prime number that is 2 more or 2 less than another prime number
      // 0 = n is not prime
      // 1 = n is a prime number but is not a twin prime
      // 2 = n is a twin prime number
   {
      int isTwinPrime; 
      
      if (isPrime(n)) // n IS PRIME
      {
         if ((isPrime((n - 2))) || (isPrime((n + 2))))
         {
            isTwinPrime = 2; // twin prime
         } else {
            isTwinPrime = 1; // not twin prime
         }
      } else {
         isTwinPrime = 0; // not a prime number or a twin prime number
      }
      
      return isTwinPrime;
   }
   
   public static int isChenPrime (int p)
    // chen prime: a prime number p that p + 2 is a prime number OR a semiprime number
    // 0 = p is not prime
    // 1 = p is prime but not a chen prime
    // 2 = p is a chen prime
   {
      int isChenPrime;
      
      if (isPrime(p)) 
      {
         int p2 = (p + 2);
         
         if ((isPrime(p2)) || (isSemiPrime(p2)))
         {
            isChenPrime = 2; // p is a chen prime
         } else {
            isChenPrime = 1; // prime number but not a chen prime
         }
      
      } else {
         isChenPrime = 0; // not a prime number, so not a chen prime
      }
      
      return isChenPrime;
   }
   
   public static int isCousinPrime (int p)
    // cousin prime: a prime number p that p + 4 is a prime number (prime numbers that differ by 4)
    // 0 = p is not prime
    // 1 = p is prime but not a cousin prime
    // 2 = p is a cousin prime
   {
      int p2 = (p + 4);
      int isCousinPrime;
      
      if (isPrime(p)) 
      {
         if (isPrime(p2))
         {
            isCousinPrime = 2; // p is prime and cousin prime
         } else {
            isCousinPrime = 1; // p is prime but not a cousin prime
         }
      } else {
         isCousinPrime = 0; // p is not prime so it cannot be a cousin prime
      }
      
      return isCousinPrime;
   }
}