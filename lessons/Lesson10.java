//*********************************************
// Lesson10.java        Author: Fiona Fung
//
// Using String classes + methods
// learning notes: case sensitive, use of ' '
//**********************************************

public class Lesson10 
{
   public static void main (String[] args)
   {
   System.out.println ("\t--- Dictionary: C ---");
   String og = "crispr";
   int ogLength = og.length(); // # of characters in original
   String ogUpper = og.toUpperCase(); // = CRISPR
   String ogSub = og.substring(0, 3); // first three characters (start from 0)
   String ogAka = og.concat (", aka clustered regularly interspaced short palindromic repeats"); // adds string
   String ogX = og.replace ('r', 'X'); // case sensitive
   int ogHash = og.hashCode();
   
   System.out.println ("Term: " + og + " / " + ogUpper);
   System.out.println ("Characters: " + ogLength);
   
   System.out.println ("\nRandom Stats");
   System.out.println ("First three characters: " + ogSub);
   System.out.println (". . . " + ogAka);
   System.out.println ("Replace 'r' with 'X': " + ogX);
   System.out.println ("Hashcode: " + ogHash);
   
   }
}