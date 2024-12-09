//*******************************************************
// GuessingGame.java          Author: Fiona Fung
//
// a guessing game using JOptionPane windows
//*******************************************************

import javax.swing.JOptionPane;
import java.util.Random;

public class GuessingGame
{
   public static void main (String[] args)
   {
      String strRange, pickNum, guessRight; // strings for messages
      int range, guess, hiRange;
      int loRange = 0;
      int again = 0; // prompts user to use again
      int count = 0; //how many guesses until correct
      int found = 0; // ends when number is guessed
      Random myGuess = new Random(); // random number generator
      
      
      String[] options = {"higher", "lower", "found it!"};
      do // entire game
      {
         System.out.println("\n\n--- let's keep track of the guesses ---");
         // set range & user picks a number
         strRange = JOptionPane.showInputDialog(null, "enter the maximum number:  ", "what's the highest number i can guess?", JOptionPane.PLAIN_MESSAGE); // maximum guess number
         range = Integer.parseInt(strRange);
         hiRange = range;
         pickNum = ("pick an integer between 0 and " + range);
         JOptionPane.showMessageDialog(null, pickNum, "start~", JOptionPane.INFORMATION_MESSAGE);
         
         guess = myGuess.nextInt(range + 1); // first guess (according to given range)
         do 
         {
         // computer guesses according to range, user says if the guess is too low/high or correct
            guessRight = ("is your number " + guess + "?");
            found = JOptionPane.showOptionDialog(null, guessRight, "my guess~", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
            // YES_OPTION = higher (guess is too low)
            // NO_OPTION = lower (guess is too high)
            // CANCEL_OPTION = found the number
                        
         // change range based on guess data
            if (found == JOptionPane.NO_OPTION) // number is too high
            {
               hiRange = guess;
               System.out.println("hiRange = " + hiRange + " loRange = " + loRange);
               guess = myGuess.nextInt(hiRange - loRange + 1) + loRange;
               System.out.println("number is too high, lower guess : "+ guess);

            } else if (found == JOptionPane.YES_OPTION) { // number is too low
               loRange = guess;
               System.out.println("hiRange = " + hiRange + " loRange = " + loRange);
               guess = myGuess.nextInt(hiRange - loRange + 1) + loRange;
               System.out.println("number is too low, higher guess : "+ guess);
            } 
            // increase tries by 1 (counted at the end)
            count++;
         } while (found == JOptionPane.YES_OPTION || found == JOptionPane.NO_OPTION);
         
         // asks user if they want to try again
         again = JOptionPane.showConfirmDialog(null, "i guessed your answer in " + count + " guesses.\ntry again?", "nice!", JOptionPane.YES_NO_OPTION);
         
         // reset for game replay
         loRange = 0; 
         count = 0; 
      } while (again == JOptionPane.YES_OPTION);
   }
   
}