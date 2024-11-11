//**********************************************
// CaesarCipher.java      Author: Fiona Fung
//
//
//**********************************************

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
         
         }
         
         System.out.println(divider);
         System.out.println("\t 1 = yes\n\t 0 = no");
         System.out.print("Use again? "); 
         useAgain = numInput.nextInt();
      }
   }
   
   public static String encode(String str, int shift)
   // returns a string in which each character has been shifted down the alphabet a number (shift) of characters
   {
      String resultE = "";
      final int lengthE = str.length(); // keeps length of string (constant)
      char letter = str.charAt(0);
      final int givenShift = shift;
      
      if (shift > 25) // 26 resets to 1 
      {
         shift = shift - 25;
      }
      // i = identifies letter in specific place
      for (int i = 0 ; i < lengthE ; i++) // starts with the first letter and goes down the string until end reached
      {
         if ((str.charAt(i) + shift) > 90) // goes past Z (ASCII)
         {
            shift = -(26 - shift);
            
         } else if ((str.charAt(i) + shift) < 65) { // goes before A 
            shift = givenShift;
         }
      
         letter = (char)(str.charAt(i) + shift) ;
            
         resultE = resultE + letter;
      }    
      
      return resultE;
   }
   
   public static String decode (String str, int shift)
   // returns a string in which each character has been shifted up the alphabet a number (-shift) of characters
   {
      String resultD = "";
      final int lengthD = str.length(); // keeps length of string (constant)
      final int givenShift = shift;
      char letter = str.charAt(0); 
      
      for (int i = 0 ; i < lengthD ; i++)
      {
         if ((str.charAt(i) + (-shift)) < 65) // goes before A
         {
            shift = (26 - shift);
         } else if ((str.charAt(i) + (-shift)) > 90) {
            shift = -(26 - shift);
         }
         letter = (char)(str.charAt(i) + (shift));
         resultD = resultD + letter;
      }
      
      return resultD;
   }
   
}