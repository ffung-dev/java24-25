//****************************************************
// Lesson15a.java       Author: Fiona Fung
//
// using for, while, and do-while loops to print numbers
//****************************************************

public class Lesson15a 
{
   public static void main (String[] args) 
   {
   
   // 1. using a for loop
   System.out.println("Loop 1: for");
   for (int num1 = 45; num1 >= -45; num1 -= 9)
   {
      System.out.print(num1 + "  ");
   }
   
   System.out.println("\n - - - - - - - - - - - - - - - - - - -");
   
   // 2. using a while loop
   System.out.println("Loop 2: while");
   int num2 = 45;
   while (num2 >= -45)
   {
      System.out.print(num2 + "  ");
      num2 -= 9;
   }
   
   System.out.println("\n - - - - - - - - - - - - - - - - - - -");
   
   // 3. using a do-while loop
   System.out.println("Loop 3: do-while");
   int num3 = 45;
   do {
      System.out.print(num3 + "  ");
      num3 -= 9;
   } while (num3 >= -45);

   }
}