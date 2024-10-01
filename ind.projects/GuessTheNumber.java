//***************************************************
// GuessTheNumber.java        Author: Fiona Fung
//
// a game where the player tries to guess a number
//***************************************************

import java.util.*; // scanner, random

public class GuessTheNumber
{
   public static void main (String[] args)
   {
    // CREATING VARIABLES, USING UTILITIES 
   Random generator = new Random(); // creates random generator
   Scanner input = new Scanner(System.in); // scanner for user input
   
   int range1 = 0, range2 = 100, answer; // default range: 0-100
   int again = 0; // for repeating the game
   int guess; // the user's input guess
   
   System.out.println("Let's play a number guessing game!");
   
   // USER INPUTS RANGE, COMPUTER PICKS A RANDOM NUMBER, USER GUESSES
   while (again == 0) {  // while playing again is true

    // user enters the range
      System.out.print ("Enter the first range number: ");
      range1 = input.nextInt();
      System.out.print ("Enter the second range number: ");
      range2 = input.nextInt();
    
    // range2 must be greater than range1
      if (range1 < range2) {  // if range1 is < range 2 (correct)
        System.out.println ("- - - - - - - - - - - - - - -");
        System.out.println ("I'm thinking of a number between " + range1 + " and " + range2 + " . . .");
        answer = generator.nextInt(range2 - range1) + range1; // FROM range1 TO the difference of range1 and range2 (range1 + difference = range2)
        
        // check if the user's input is outside the range, then reveal answer
        guess = input.nextInt();
        if (range1 <= guess && guess <= range2) { // compound inequality
            if (guess == answer) {
                System.out.println("That's correct!\nMy number was " + answer + ".");
           } else {
                System.out.println("Nope, my number was " + answer + ".");
            }
        } else {
            System.out.println("Error: your guess wasn't in the range!");
            System.out.println("My number was " + answer + ".");
        }

        // option to try again/stop
        System.out.print ("\t0 = yes\n\t1 = no\nTry again? "); 
        again = input.nextInt(); // if 0 = repeat, else stop
        if (again != 0 && again != 1) {
            System.out.println("Error: you did not enter one of the options; automatic close");      
        } 
    // if range1 IS NOT < range2    
    } else {
        System.out.println("Error: the first range must be less than the second range.");
        System.out.println ("- - - - - - - - - - - - - - -");
        System.out.print ("\t0 = yes\n\t1 = no\nTry again? "); 
        again = input.nextInt(); // if 0 = repeat, else stop
        if (again != 0 && again != 1) {
            System.out.println("Error: you did not enter one of the options; automatic close");      
        }
    }
   }
   input.close();
   
   }
}