//****************************************
// Lesson14.java     Author: Fiona Fung
//
// demostrating use of while loops
//****************************************

public class Lesson14 {
    public static void main (String[] args) 
    {
    int tens = 0;
    int ones = 0;

    do
    {
        tens++; // increases to 1 (10) 
        do // without conditions
        {
            System.out.println("" + tens + ones); // print number
            ones++; // increase ones 
        } while (ones < 10 && tens < 5); // checks condition; if true > repeat 
        ones = 0; // after ones = 0 
    } while (tens < 5); // checks if tens = 5 (50)
    
    }
 }