//******************************************************************
// ArrayMethods.java             Author: Fiona Fung
//
// array methods (based on user input)
//******************************************************************

import java.util.Scanner;

public class ArrayMethods
{
   public static void main(String[] args)
   {

      // create variables, scanner     
      int limit; // number of values in array
      int choice; // (1-3) 
      boolean tryAgain = true; // to use methods again
      Scanner input = new Scanner(System.in);
      String menu = "1. reversed array\n2. smallest value in array\n3. largest value in array";
      String divider = "--------------------------";
      do
      {
         // menu
         System.out.println(menu);
         System.out.print("take your pick: ");
         choice = input.nextInt();
         
         
         // create array
         System.out.print("\nenter number of elements: ");
         limit = input.nextInt(); // # of elements in array = limit (0 to limit-1)
         int[] userArray = new int[limit];
         
         for (int i = 0 ; i < limit ; i++)
         {
            System.out.print("enter element " + i + ": ");
            userArray[i] = input.nextInt();
         }
         System.out.println("\nyour array: " + toString(userArray)); // print user array
         
         // returns choice method
         if (choice == 1) // reverseArray
         {
            System.out.println("reversed array: " + toString(reverseArray(userArray)));
         } else if (choice == 2) { // smallestValue 
            System.out.println("smallest value in array: " + smallestValue(userArray));
         } else if (choice == 3) { // largestValue
            System.out.println("largest value in array: " + largestValue(userArray));
         }
         
         // asks user if they want to do it again
         boolean choseOpt = false; 
         int againOpt;
         while (!choseOpt)
         {
            System.out.print ("\n  1 = yes\n  0 = no\nuse again? ");
            againOpt = input.nextInt();
            if (againOpt == 1)
            {
               // use again
               tryAgain = true;
               choseOpt = true;
            } else if (againOpt == 0) {
               // do not use again / quit
               tryAgain = false; 
               choseOpt = true;
            } else {
               System.out.println("user did not input an option, try again.");
               choseOpt = false; // did not choose an option, enter again
            }
         }
         System.out.println(divider);

      } while (tryAgain);
      
      input.close();
   }
   
   // takes an array and returns it as a string
   public static String toString(int[] array)
   {
      String result = "";
      for(int i = 0 ; i < array.length ; i++)
      {
         result += array[i] + " ";
      }
      return result;
   }
   
   // takes an array and returns a new array in reverse order
   public static int[] reverseArray(int[] arr)
   {
      int[] result = new int[arr.length];
      for (int i = 0 ; i < arr.length ; i++)
      {
         result[i] = arr[arr.length -1 - i];
      }
      return result; 
   }
   
   // takes an array and returns the smallest value of the array
   public static int smallestValue(int[] arr)
   {
      int smallestValue = 0;
      int smallLoop = arr[0];
      for (int i = 0 ; i < arr.length ; i++) // i = element number
      {
         if (arr[i] < smallLoop)
         {
            smallLoop = arr[i];
         }
      }
      smallestValue = smallLoop;
      return smallestValue;
   }
   
   
   // takes an array and returns the largest value of the array
   public static int largestValue(int[] arr)
   {
      int largestValue = 0;
      int largeLoop = arr[0];
      for (int i = 0 ; i < arr.length ; i++) // i = element number
      {
         if (arr[i] > largeLoop)
         {
            largeLoop = arr[i];
         }
      }
      largestValue = largeLoop;
      return largestValue;
   }  
}