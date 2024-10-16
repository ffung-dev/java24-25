//********************************************
// Lesson15c.java       Author: Fiona Fung
//
// printing a rectangle
//********************************************

public class Lesson15c {
    public static void main(String[] args) {
        int row = 0;
        int col = 0;
        int left = 0;
        int right = 9;
        final String paddingSpaces ="    " ; 
        final String displaySymbol ="*" ; 
        final String displayNonSymbol =" " ; 

       System.out.println();
       System.out.println();
        for (row = 0; row < 9; row++)
        {
            for (col = 0; col < 10; col++)
            {
                //put paddings 
                System.out.print(paddingSpaces);
                if (left == col || row == 0 || row == 8 || right == col) 
                {
                    System.out.print(displaySymbol);
                } else {
                    System.out.print(displayNonSymbol);
                }                
            }
            System.out.println();

        }
    }
}
