//*********************************************************************
//    FishBrick.java             Author: Fiona Fung
//
//    holds info for each fish-brick in Fin And Breakfast
//*********************************************************************

import javax.swing.*;

public class FishBrick
{
   private int fishX;
   private int fishY;
   private String fishImage;
   private int hit;
   
   public FishBrick(String image, int row, int col, int hit) // 1 : not hit ; 0 : hit
   {
      // fishBrick dimensions: 13x83
      // starting (first brick) at (13, 13)
      fishX = (col * 83) + 13;
      fishY = (row * 35) + 13;   
      fishImage = image;
      this.hit = hit;
   }
   
   // get methods to get x and y values of top-left corner of the FishBrick
   public int getX() { return fishX; }
   public int getY() { return fishY; }
   public ImageIcon getImage() { return new ImageIcon(fishImage) ; }
   public int getHit() { return hit; }
   
   // set methods 
   public void setImage(String img) { fishImage = img; }
   public void setHit(int hit) { this.hit = hit; }
   
}