//***********************************************
// Lesson12a.java          Author: Fiona Fung
//
// Determines if user inputted number is / by 3
//***********************************************
import java.util.*;

public class Lesson12a
{
   public static void main (String[] args)
   {
   Scanner input = new Scanner (System.in);
   System.out.println ("Enter an integer that is divisible by 3: ");
   int num = input.nextInt();
   
   if (num % 3 == 0) // checks if there is a remainder when num/3, remember to use ==!!!
      System.out.println("Thank you! " + num + " / 3 = " + num/3);
   else 
   {
      System.out.println(num + " is not divisible by 3.");
   }
   input.close();
   
   }
}