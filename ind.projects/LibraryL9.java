//*****************************************************
// LibraryL9.java       Author: Fiona Fung
//
// Using stuff I've learned so far :)
//*****************************************************

public class LibraryL9
{
   // making a library display of some favorite books :)
   public static void main (String[] args)
   {
   String libraryName = "fiona's library"; // name/title
   int bookCount = 41;
   String currentRead = "love & other words", crAuthor = "christina lauren"; // current read (input/change)
   String recentRead = "today, tonight, tomorrow", rrAuthor = "rachel lynn solomon";
  
   String fb1 = "the spanish love deception", fb2 = "red, white, & royal blue", fb3 = "today, tonight, tomorrow", fb4 = "i hope this doesn't find you"; // favorite book TITLES
   double fb1s = 5.0, fb2s = 4.95, fb3s = 5.0,fb4s = 4.50; // favorite book RANKINGS (corresponding to title variables)
   
   String s1 = "this time it's real", s2 = "you've reached sam", s3 = "today, tonight, tomorrow"; // shopping cart TITLES
   double s1$ = 12.99, s2$ = 11.24, s3$ = 8.49; // shopping cart PRICES
   
   System.out.println ("\tLibrary: " + libraryName);
   System.out.println ("\tBook Count: " + bookCount);
   System.out.println ("----------------------------------");
   System.out.println ("Current read: " + currentRead + " by " + crAuthor);
   System.out.println ("Last read: " + recentRead + " by " + rrAuthor);
   
   System.out.println ("\n\t--- Favorite books --- \n\t(in no particular order)");
   System.out.println ( fb1 + " - " + fb1s + " stars");
   System.out.println ( fb2 + " - " + fb2s + " stars");
   System.out.println ( fb3 + " - " + fb3s + " stars");
   System.out.println ( fb4 + " - " + fb4s + " stars");
   
   double averageFB = ((fb1s + fb2s + fb3s + fb4s)/4); // can i figure out a way to make the /4 dependent on # of fb?
   
   System.out.println ("\tAverage rating: " + averageFB);
   System.out.println ("----------------------------------");
   
   System.out.println ("\t --- Shopping cart ---");
   
 
   }
}
