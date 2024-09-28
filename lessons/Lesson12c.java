//******************************************************
// Lesson12c.java             Author: Fiona Fung 
// 
// Enter a username~ does it meet network requirements?
//******************************************************

import java.util.*;

public class Lesson12c
{
   public static void main (String[] args)
   {
   System.out.println ("Welcome to N3tw0rk!");
   Scanner makeUser = new Scanner (System.in);

   System.out.println ("\t! Username requirements:");
   System.out.println ("\tUsername must start with \"U\"\n\tUsername must have more than 6 characters");
   
   System.out.print ("Enter a username: ");
   String userName = makeUser.nextLine();
   
   char startsU = userName.charAt(0);
   int length = userName.length();
   
   if (startsU == 'U') {
      if (length > 6) {
         System.out.println ("Thank you! (> . <)");
         System.out.println ("\nYour username: " + userName);
      } else {
         System.out.println ("Error: Username is not more than 6 characters");
      }
   } else { 
      System.out.println("Error: Username does not start with \'U\'");
      if (length < 6) {
         System.out.println ("Error: Username is not more than 6 characters");
      }
   }
   makeUser.close();

   }
}
