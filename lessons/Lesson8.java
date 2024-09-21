//************************************************
// Lesson8.java         Author: Fiona Fung
//
// L8: using doubles and ints in calculations
//************************************************

public class Lesson8 //class definition
{ 
   // variable calculations using doubles & ints
   
   public static void main (String[] args)
   {
   // doubles
   double x = 5.70;
   double y = 3.20;
   double z = x - y; // the value z will be experimental and values will change
   System.out.println ("x = " + x + " , y = " + y + " , z = " + z);
   
   System.out.println ("--------------------------------");
   
   // ints
   int a = 10;
   int b = 2;
   int c = a * b; // the variable c will be experimental and values will change
   System.out.println ("a = " + a + " , b = " + b + " , c = " + c);
   
   System.out.println ("--------------------------------");
   c = a / b;
   System.out.println ("c = a / b = " + c); // c is the quotient of a and b
   c = a % b;
   System.out.println ("c = the remainder of a / b = " + c); // c is the remainder
   
   System.out.println ("--------------------------------"); 
   // calculations between doubles and ints
   System.out.println ("y / a = " + y / a); // arithmetic promotion; converts a to a double temporarily
   y = a; // assignment conversion; a = 10, so y will = 10.0 (value in a > double) 
   System.out.println ("the value in a as a double: " + y); 
   y = 3.20; // reassigning back to a double   
   z = a * x; // a is an int and x is a double > z = a as a double
   System.out.println ("z = a * x = " + z);
   z = 1.0 / 2.0;
   System.out.println ("1/2 a = " + z*a); // will be a double
   
   System.out.println ("--------------------------------"); 
   // casting - forceful conversion of a value's data type
   c = a * b;
   double cast1;
   cast1 = (double) c / a; // c & a are both ints but will temporarily be treated as doubles
   System.out.println ("casting! c / a = " + cast1);
   
   }
}
