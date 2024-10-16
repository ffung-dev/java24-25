//********************************************
// Lesson15b.java       Author: Fiona Fung
//
// printing a star
//********************************************


public class Lesson15b {
    public static void main (String[] args) 
    {
         int topPos=0;
         int bottomPos=8;
         int row = 0;
         int col = 0;

        for (col = 0; col < 9; col++)
        {
            for (row = 0; row < 9; row++) 
            {
                if (row == topPos || row == bottomPos || row == 4 || col == 4)
                {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }                
            }
            System.out.println("");
            topPos++;
            bottomPos--;
        }
    
        
    }
}
