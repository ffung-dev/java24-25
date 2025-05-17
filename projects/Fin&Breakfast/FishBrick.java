//*********************************************************************
//    FishBrick.java             Author: Fiona Fung
//
//    holds info for each fish-brick in Fin And Breakfast
//*********************************************************************

import javax.swing.*;
public class FishBrick
{
   int fishX;
   int fishY;
   String fishImage;
   
   public FishBrick(String image, int row, int col)
   {
      // fishBrick dimensions: 13x83
      // starting (first brick) at (13, 13)
      fishX = (col * 83) + 13;
      fishY = (row * 35) + 13;   
      fishImage = image;
   }
   
   // get methods to get x and y values of top-left corner of the FishBrick
   public int getX() { return fishX; }
   public int getY() { return fishY; }
   // getImage returns the png name
   public ImageIcon getImage() { return new ImageIcon(fishImage) ; }
   
   // set methods 
   public void setX(int x) { fishX = x; }
   public void setY(int y) { fishY = y; }
   
}