//*******************************************************************************************
// VigenereCipher.java            Author: Fiona Fung
//
// encode / decode messages through the vigenere cipher using a key
// vigenere cipher: encrypting text where each letter is encoded with a different caesar cipher based on a key
//*******************************************************************************************

import java.util.Scanner;
public class VigenereCipher
{
   public static void main(String[] args)
   {
      Scanner numInput = new Scanner(System.in);
      Scanner strInput = new Scanner(System.in);
      int useAgain = 1;   
      String divider = "----------------------------";
      String strE, strD, key;
      int option;
      
      while (useAgain == 1)
      {
         // menu
         System.out.println(divider);
         System.out.println("\t\tVigenere Cipher");
         System.out.println("\t\t 1 = encode\n\t\t 2 = decode");
         System.out.print("\t Pick an option:  ");
         option = numInput.nextInt();
         System.out.println(divider);
         
         
         // encode/decode user input!
         switch(option)
         {
            // encode
            case 1: 
               System.out.print("Input the text to encode: ");
               strE = strInput.nextLine();
               System.out.print("Input a key: ");
               key = strInput.nextLine();
               System.out.println(encode(strE, key));
            
            
            
            // decode
            case 2: 
               System.out.print("Input the text to decode: ");
               strD = strInput.nextLine();
               System.out.print("Input a key: ");
               key = strInput.nextLine();
               System.out.println(encode(strD, key));
            
            
            // if no input
            default: 
               System.out.println("ERROR: Invalid option");
         
         } 
         
         // option to use cipher again
         System.out.println(divider);
         System.out.println("\t\t 1 = yes\n\t\t 0 = no");
         System.out.print("\t Use again?  ");
         useAgain = numInput.nextInt();
      }

      // close scanners
      numInput.close();
      strInput.close();
   }
   
   public static String encode(String str, String key)
   {
     String resultE = "";
     char letter;
     final int lengthE = str.length();
     int shift;
      
      for (int i = 0 ; i < lengthE ; i++)
      {
         shift = (int)(key.charAt(i)); // shift depends on the corresponding key letter
         if ((str.charAt(i) > 31 && str.charAt(i) < 65) || (str.charAt(i) > 90 && str.charAt(i) < 97) || (str.charAt(i) > 122 && str.charAt(i) < 127) ) // check if it is a space or punctuation (!, ., #, ", etc)
         {
            letter = str.charAt(i); // [symbol] stays the same
             
         } else if (str.charAt(i) > 64 && str.charAt(i) < 91) { // capital letter
           
            
                        
         } else if (str.charAt(i) > 96 && str.charAt(i) < 123) { // lowercase letter
         
           
           
         } else {
            System.out.println("ERROR: " + str.charAt(i));
         }

      }
      
      
      return resultE;
   }
   
   public static String decode(String str, String key)
   {
      String resultD = "";
      
      
      return resultD;
   }


}