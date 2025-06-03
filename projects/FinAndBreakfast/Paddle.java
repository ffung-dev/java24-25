//*************************************************************************
//    Paddle.java                Author: Fiona Fung
//
//    holds information for the iceberg paddle
//*************************************************************************

import javax.swing.*;
import java.awt.Graphics;

public class Paddle
{
   int x, y, xVelocity;
   ImageIcon paddleImg = new ImageIcon("paddle.png");
   // create paddle
   public Paddle(int x, int y, int xVelocity)
   {
      this.x = x;
      this.y = y;
      this.xVelocity = xVelocity;
   }
   
   public void draw(Graphics g)
   {
      g.drawImage(paddleImg.getImage(), x, y, null);
   } 
   
   // move paddle (called in KeyListener in GamePanel)
   public void moveLeft()
   {
      if ( x < 1 )
      {
         // no change
      } else {
         x -= xVelocity;
      }
   }
   
   public void moveRight()
   {
      if ( x > 370)
      {
         // no change
      } else {
         x += xVelocity;
      }
   }
   // get methods
   public int getX() { return x; }
   public int getY() { return y; }
   public int getXVelocity() { return xVelocity; }
  


}