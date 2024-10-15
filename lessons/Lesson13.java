//****************************************************
// Lesson13.java             Author: Fiona Fung
//
// calculates grade based on a numerical input :)
//****************************************************

import java.util.*;

public class Lesson13 
{
   public static void main (String[] args)
   {
            /*  A if (grade >= 94 and <= 100)
            B if (grade >= 85 and < 94)
            C if (grade >= 75 and < 85)
            D if (grade >= 60 and < 75)
            F if (grade < 60) */
            
   Scanner input = new Scanner(System.in); // will take input from user
   double numGrade;
   String grade = "";
   int again = 0;

   while (again == 0) {  
      System.out.println("- - - - - - - - - - - - ");
      System.out.println("Calculate your grade!");
      System.out.print("Enter numerical grade: ");
      numGrade = input.nextDouble();
      
      
      if ((numGrade > 100) || (numGrade < 0)) { // makes sure that the grade input is between 0 - 100
         System.out.println("Error: Grade must be between 0 - 100");
      } else { // calculates letter grade
         System.out.println("- - - - - - - - - - - - ");
         again = 1;

         System.out.println ("Your numerical grade: " + numGrade);
   
         if ((numGrade >= 94) && (numGrade <= 100)) {
         grade = "A";
         } else if ((numGrade >= 85) && (numGrade < 94)) {
         grade = "B";
         } else if ((numGrade >=75) && (numGrade < 85)) {
         grade = "C";
         } else if ((numGrade >= 60) && (numGrade < 75)) {
         grade = "D";
         } else if (numGrade < 60) {
         grade = "F";
         }
         System.out.println("Your letter grade: " + grade);
      }     

      System.out.print("\t0 = yes\n\t1 = no\nCalculate again? ");
      again = input.nextInt();
      if (again < 0 || again > 1) {
        System.out.println ("Error: did not choose an option (0/1) = automatic close");
      }
      

   }      
   input.close();
   
  }
}