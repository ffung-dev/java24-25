//****************************************************
// Lesson12b.java       Author: Fiona Fung
//
// Determines if a user-inputted number is even/odd
//****************************************************

import java.util.*;

public class Lesson12b
{
   public static void main (String[] args)
   {
   System.out.println ("(> . <)");
   System.out.print ("Enter an integer: ");
   Scanner input = new Scanner (System.in);
   int num = input.nextInt();
   
   System.out.println ("Your integer: " + num);
   if (num % 2 == 0) {
      System.out.println (num + " is an even number.");
   } else {
      System.out.println (num + " is an odd number.");
   }
   input.close();
   }
}