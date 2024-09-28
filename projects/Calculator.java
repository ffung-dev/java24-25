//*******************************************************
// Calculator.java            Author: Fiona Fung
//
// mini-project: calculator with basic functions
//*******************************************************

import java.util.*; // imports utility classes (Math, Scanner)

public class Calculator // creates class
{
   // this calculator takes user inputs and calculates math functions
   
   public static void main (String[] args)
   {
   // this section creates variables (but not necessarily assigns values)
      int option; // which operation?
      double choice1, choice2; // numbers to compute
      double ans; // answer of calculation
      
   // this section introduces the calculator and commands to the user 
      System.out.println ("- - -  Calculator  - - -\n Commands:");
      System.out.println (" 1. Addition\n 2. Subtraction\n 3. Multiplication\n 4. Divison\n 5. Exponent power\n 6. Remainder of division");
      System.out.println ("- - - - - - - - - - - - -");
      
   // creates scanner for user input
      Scanner input = new Scanner (System.in); // takes keyboard input
          
   // asks for user inputs and calculates answer 
      double useAgain = 0; // option to try again
      while (useAgain == 0) { // will loop calculator unless useAgain = 1 (or not 0)
      // asks for inputs
         System.out.print ("Enter operation #: ");
         option = input.nextInt(); 
         System.out.print ("Enter first value: ");
         choice1 = input.nextDouble(); // can be a decimal
         System.out.print ("Enter second value: ");
         choice2 = input.nextDouble();

      // calculates answer depending on scanner inputs
         if (option == 1) {
            ans = choice1 + choice2;
            System.out.println(choice1 + " + " + choice2 + " = " + ans);
         
         } else if (option == 2) {
            ans = choice1 - choice2;
            System.out.println (choice1 + " - " + choice2 + " = " + ans);
         
         } else if (option == 3) {
            ans = (choice1 * choice2);
            System.out.println (choice1 + " * " + choice2 + " = " + ans);
         
         } else if (option == 4) {
            ans = (choice1 / choice2);
            System.out.println (choice1 + " / " + choice2 + " = " + ans);
         
         } else if (option == 5) {
            ans = Math.pow(choice1, choice2); // = choice1 raised to the power of choice2
            System.out.println (choice1 + " ^ " + choice2 + " = " + ans);
         
         } else if (option == 6) {
            ans = (choice1 % choice2);
            System.out.println ("The remainder when " + choice1 + " / " + choice2 + " = " + ans);
         } else {
            System.out.println ("Error: option does not exist (must be between 1-6)."); // if user inputs a value not 1-6 
         }
         
      // asks if user wants to use calculator again
         System.out.println ("\n  0 = yes\n  1 = no\nUse calculator again?");
         useAgain = input.nextDouble();
         
         if (useAgain < 0 || useAgain > 1) {
            System.out.println ("Error: did not choose an option (0/1) = automatic close");
         }
         System.out.println ("- - - - - - - - - - - - -");
         
      } // closing bracket for while statement
      
     }
}