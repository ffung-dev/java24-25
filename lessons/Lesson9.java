//****************************************************
// Lesson9.java      Author: Fiona Fung
// 
// Using printf and formatting with \
//****************************************************

public class Lesson9 
{
   public static void main (String[] args)
   {
     // find the area of a circle with radius "r"
     int r = 12; // the radius of the circle; CHANGE
     System.out.println ("Task : Find the area (pi * r^2) of a circle with a radius of " + r);
     System.out.println ("Radius = " + r);
     double pi = 3.1415965359;
     System.out.println ("Pi = " + pi);
     
     double area = pi * r * r; 
     System.out.println ("Area = " + area);
    
     System.out.printf ("Area (10 characters) = %f", area); 
     System.out.printf ("\nArea rounded to the nearest tenth = %.1f", area); // precision specifier [.precision] - numbers are rounded to the specified precision (1=tenth)
     System.out.println ("\n----------------------------"); // no space between \n and text or it will be an extra space
     
     System.out.println ("Task : What's the difference between print and println?");
     
     System.out.println ("This is a println statement.");
     System.out.print ("This is a print statement. ");
     System.out.print ("Print statements don't form a new line after the printed message."); 
     System.out.println ("\n(This is a println statement using the backslash \\n)");
     System.out.println ("But println statements do!");
   
   
   }
}