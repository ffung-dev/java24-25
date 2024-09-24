//**********************************************************
// Lesson11.java              Author: Fiona Fung
//
// Using Scanner, Random, and Math classes
//**********************************************************

import java.util.*;

public class Lesson11
{
   public static void main (String[] args)
   {
   int num; // declare variables
   String phrase;
   
   Scanner intScan = new Scanner (System.in); // creates scanner
   System.out.println ("Enter an integer: ");
   num = intScan.nextInt(); // takes integer from keyboard!
   double numSqrt = Math.sqrt(num); // math class method: takes square root of num
   double numAdv = Math.abs(num); // math class method: takes absolute value of num
   
   System.out.println ("Your integer: " + num);
   System.out.println ("Square root of " + num + " = " + numSqrt);
   System.out.println ("Absolute value of " + num + " = " + numAdv);
   
   Scanner strScan = new Scanner (System.in); // creates scanner for string
   System.out.println ("\nEnter a word or phrase with 6+ characters: ");
   phrase = strScan.nextLine();
   int phraseLength = phrase.length();
  
   if (phraseLength < 6) {
      System.out.println("Error! Your phrase is less than 6 characters.");
   } else {
      String last6 = phrase.substring((phraseLength - 6), phraseLength); // substring takes the last SIX characters
      System.out.println ("Your phrase: " + phrase);
      System.out.println ("Length: " + phraseLength);
      System.out.println ("Last six characters: " + last6);

    intScan.close();
    strScan.close();
   }
   
   }
}