//***************************************************************
//    GamePanel.java             Author: Fiona Fung 
// 
//    holds the gameplay of FinAndBreakfast 
//***************************************************************

// import packages
import javax.swing.*;
import java.awt.*;
import java.awt.Graphics;
import java.awt.event.*;
import java.util.Random;

public class GamePanel extends JPanel
{ 
   //ball movement variables
   int ballX = 255;
   int ballY = 560;
   int ballX_velocity = 5;
   int ballY_velocity = 5;
   FishBrick[] bricks = new FishBrick[42]; // 42 bricks
   int rows = 7;
   int columns = 6;
   
   public GamePanel()
   {
      setLayout(null);
      setBounds(0, 0, 524, 650);
      int brickNum = 0;   
       
      for (int r = 0 ; r < rows ; r++)
      {
         for (int c = 0 ; c < columns ; c++)
         {
            // create brick
            bricks[brickNum] = new FishBrick(RandomFish(), r, c);
            brickNum++;
         }
      }
            
            
      // swingTimer
      int delay = 10; // updates every 10 milliseconds
      Timer timer = new Timer(delay, new TimerListener());
      timer.start();           
               
   }
   
   // game animation
   public void paintComponent(Graphics g)
   {
      super.paintComponent(g);
      setBackground(new Color(179, 206, 225)); // background of panel
      
      // draw ball
      g.setColor(Color.white);
      ballX += ballX_velocity;
      ballY += ballY_velocity;
      g.fillOval(ballX, ballY, 25, 25);
            
      // draw bricks
      int brickNum = 0;

      for (int r = 0 ; r < rows ; r++)
      {
         for (int c = 0 ; c < columns ; c++)
         {
            // draw
            g.drawImage(bricks[brickNum].getImage().getImage(), bricks[brickNum].getX(), bricks[brickNum].getY(),null);
            brickNum++;
         }
      }
   }

   // detects left/right keys pressed to move iceberg paddle   
   private class ArrowListener implements KeyListener
   {
      public void keyTyped(KeyEvent e) { } // nothing done here
      
      public void keyPressed(KeyEvent e)
      {
      
      }
      
      public void keyReleased(KeyEvent e)
      {
      
      }
   }
   
   // timer ActionListener
   private class TimerListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         // bounce off left/right walls
         if (ballX < 1)
         {
            ballX_velocity = -ballX_velocity;
         }
         if (ballX > 500)
         {
            ballX_velocity = -ballX_velocity;
         }
         // bounce off bottom/top walls
         if (ballY < 1)
         {
            ballY_velocity = -ballY_velocity;
         }
         if (ballY > 630)
         {
            ballY_velocity = -ballY_velocity;
         }
         
         System.out.println("x: " + ballX_velocity);
         System.out.println("y: " + ballY_velocity);
         repaint();
      }
   }
      
   // pick the fish to draw in a brick
   public String RandomFish()
   {
      String[] fishPNG = {"1bluefish.png" , "2grayfish.png" , "3greenfish.png" , "4redfish.png" , "5yellowfish.png"};
      int fishChoice = 0;
      Random generate = new Random();
      fishChoice = generate.nextInt(5); // generates between 0-4
      return fishPNG[fishChoice];
   }
   
}