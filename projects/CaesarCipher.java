//**********************************************
// CaesarCipher.java      Author: Fiona Fung
//
// encode / decode a phrase through a caesar cipher
//**********************************************

// copy & paste for test: ABCDEFG HIJK LMNOP QRS TUV WXYZ / abcdefg hijk lmnop qrs tuv wxyz

import java.util.Scanner;

public class CaesarCipher
{
   public static void main (String[] args)
   {
      Scanner numInput = new Scanner(System.in); // for number inputs
      Scanner stringInput = new Scanner(System.in); // for string inputs
      // variables that hold user input
      String strE, strD;
      int shiftE, shiftD;
      int useAgain = 1; // asks the user to try again (1 = yes, = no)
      
      while (useAgain == 1)
      {
         // menu
         String divider = "-----------------------------------";
         System.out.println(divider);
         System.out.println("\t    Caesar Cipher");
         System.out.println("1. encode\n2. decode");
         System.out.print("Pick an option: ");
         int option = numInput.nextInt();
         
         if (option == 1) {
         // encode
            System.out.print("Input the word/phrase to encode: ");
            strE = stringInput.nextLine();
            System.out.print("Input the shift number: ");
            shiftE = numInput.nextInt();
            
            System.out.println(strE + " encoded through a Caesar Cipher with a shift of " + shiftE + " : " + encode(strE, shiftE)); 
             
         } else if (option == 2) {
         // decode
            System.out.print("Input the word/phrase to decode: ");
            strD = stringInput.nextLine();
            System.out.print("Input the shift number: ");
            shiftD = numInput.nextInt();
 
            System.out.println(strD + " decoded through a Caesar Cipher with a shift of " + shiftD + " : " + decode(strD, shiftD)); 

         } else {
         // user did not input a valid option
            System.out.println("Error: User did not input a valid option.");
         }
         
         System.out.println(divider);
         System.out.println("\t 1 = yes\n\t 0 = no");
         System.out.print("Use again? "); 
         useAgain = numInput.nextInt();
      }
      // close scanners
      numInput.close();
      stringInput.close();
   }
   
   public static String encode(String str, int shift)
   // returns a string in which each character has been shifted down the alphabet a number (shift) of characters
   {
      String resultE = "";
      final int lengthE = str.length(); // keeps length of string (constant)
      char letter = str.charAt(0);
      
     while (shift > 25) // 26 resets to 1 , etc
     {
        shift = shift - 26;
     }
      // i = identifies letter in specific position
      for (int i = 0 ; i < lengthE ; i++) // starts with the first letter and goes down the string until end reached
      {
         // changes character based on: is it a space? is it a capital letter? is it a lowercase letter?
         if ((str.charAt(i) > 31 && str.charAt(i) < 65) || (str.charAt(i) > 90 && str.charAt(i) < 97) || (str.charAt(i) > 122 && str.charAt(i) < 127) ) // check if it is a space or punctuation (!, ., #, ", etc)
         {
            letter = str.charAt(i) ; // stays the same!  
         } else if (str.charAt(i) > 64 && str.charAt(i) < 91) { // capital letter
         
            if (str.charAt(i) + shift > 90) { // goes past 'Z'? 
               letter = (char)((str.charAt(i) + shift) - 26);
            } else { // does not go past 'Z'
               letter = (char)(str.charAt(i) + shift) ;
            }
            
         } else if (str.charAt(i) > 96 && str.charAt(i) < 123) { // lowercase letter
         
            if (str.charAt(i) + shift > 122) // goes past 'z' ?
            {
               letter = (char)((str.charAt(i) + shift) - 26);
            } else { // does not go past 'z'
               letter = (char)(str.charAt(i) + shift) ; 
            }
         } else {
            System.out.println("ERROR: " + str.charAt(i));
         }
         // debug: System.out.println("character at" + i + " and shift is " + shift); 
         resultE = resultE + letter;
         // debug: System.out.println("done " + resultE);
      }    
      
      return resultE;
   }
   
   public static String decode (String str, int shift)
   // returns a string in which each character has been shifted up the alphabet a number (-shift) of characters
   {
      String resultD = "";
      final int lengthD = str.length(); // keeps length of string (constant)
      char letter = str.charAt(0); 
      
      while (shift > 25) // 26 resets to 1 , etc
     {
        shift = shift - 26;
     }
      for (int i = 0 ; i < lengthD ; i++) // goes down the string
      {
         if ((str.charAt(i) > 31 && str.charAt(i) < 65) || (str.charAt(i) > 90 && str.charAt(i) < 97) || (str.charAt(i) > 122 && str.charAt(i) < 127) ) // check if it is a space or punctuation (!, ., #, ", etc)
         {
            letter = str.charAt(i) ; // stays the same!
         } else if (str.charAt(i) > 64 && str.charAt(i) < 91) { // capital letter
            
            if ((str.charAt(i) + (-shift)) < 65)  { // check if it goes before 'A'
               letter = (char)(str.charAt(i) + (26 - shift));  
            } else { // doesn't go before 'A'
               letter = (char)(str.charAt(i) - shift);
            }
            
         } else if (str.charAt(i) > 96 && str.charAt(i) < 123) { // lowercase letter
            
            if ((str.charAt(i) - shift) < 97) { // goes before 'a' 
               letter = (char)(str.charAt(i) + (26 - shift)) ;
            } else { // doesn't go past 'z'
               letter = (char)(str.charAt(i) - shift) ;
            }
         } 
         resultD = resultD + letter; // adds the letter to the new string
      }
      
      return resultD;
   }
}