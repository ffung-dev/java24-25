//************************************************
// Lesson7.java         Author: Fiona Fung
//
// Using & printing variables, using style of a reciept :)
//************************************************

public class Lesson7
{
   public static void main (String[] args)
   {
      // order one!
      System.out.println ("---------------------------------"); 
      System.out.println ("Order 1. 09.12.2024, 11:58 am."); //print message
      
      char order = 'C'; // can only contain one letter
      System.out.println ("Package order: " + order);
      
      double total = 98.76, change; // can contain decimals + created two variables (total & change)
      System.out.println ("Total: " + total);  
      
      int paid = 99; // integers only
      System.out.println ("Paid: " + paid);
      
      boolean needChange = true; // true/false only
      System.out.println ("Needs change: " + needChange);
      
      change = 0.24; // assign value
      System.out.println ("Change: " + change);
      
      System.out.println ("---------------------------------"); // separation
      // order 2 - reassign values
      order = 'E';
      total = 19.00;
      paid = 19; // int
      needChange = false;
      
      System.out.println ("Order 2. 09.12.2024, 12:15 pm.");
      // printing new variable values
      System.out.println ("Package order: " + order);
      System.out.println ("Total: " + total);
      System.out.println ("Paid: " + paid);
      System.out.println ("Needs change: " + needChange);
      
      System.out.println ("---------------------------------"); // separation
      
   }
}