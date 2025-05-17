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
   // ball movement variables
   int ballX = 255;
   int ballY = 560;
   int ballX_velocity = 4;
   int ballY_velocity = 4;
   
   // paddle movement variables
   int paddleX = 190;
   int paddleY = 600;
   int paddleX_velocity = 10; 
   boolean leftPress, rightPress;
   Paddle paddle;
   // 2d array
   final int rows = 7;
   final int columns = 6;
   FishBrick[][] bricks = new FishBrick[rows][columns]; // 42 bricks in 7 rows and 6 columns
   
   public GamePanel()
   {
      setLayout(null);
      setBounds(0, 0, 524, 650);
      int brickNum = 0;   
       
      for (int r = 0 ; r < bricks.length ; r++)
      {
         for (int c = 0 ; c < bricks[r].length ; c++)
         {
            // create brick (randomize color)
            bricks[r][c] = new FishBrick(RandomFish(), r, c);
            brickNum++;
            // testing : System.out.println(r +" " + c);

         }
      }      
      // swingTimer
      int delay = 10; // updates every 10 milliseconds
      Timer timer = new Timer(delay, new TimerListener());
      timer.start();           
      
      paddle = new Paddle(paddleX , paddleY , paddleX_velocity);
      // detect keyboard press
      setFocusable(true); 
      addKeyListener(new ArrowListener());       
   }
   
   // game animation
   public void paintComponent(Graphics g)
   {
      super.paintComponent(g);
      setBackground(new Color(179, 206, 225)); // background of panel
      
      // draw paddle
      if (leftPress)
      {
         paddle.moveLeft();
      }
      if (rightPress)
      {
         paddle.moveRight();
      }
      paddle.draw(g);
      // draw ball
      g.setColor(Color.white);
      ballX += ballX_velocity;
      ballY += ballY_velocity;
      g.fillOval(ballX, ballY, 25, 25);
      // draw bricks
      int brickNum = 0;

      for (int r = 0 ; r < bricks.length ; r++)
      {
         for (int c = 0 ; c < bricks[r].length ; c++)
         {
            // draw
            g.drawImage(bricks[r][c].getImage().getImage(), bricks[r][c].getX(), bricks[r][c].getY(),null);
            brickNum++;
         }
      }
   }

   // detects left/right keys pressed to move iceberg paddle   
   private class ArrowListener implements KeyListener
   {
      public void keyTyped(KeyEvent e) { } // nothing done here
      public void keyReleased(KeyEvent e) 
      { 
         if (e.getKeyCode() == KeyEvent.VK_RIGHT )
         { // right arrow released
            rightPress = false;
         } 
         if (e.getKeyCode() == KeyEvent.VK_LEFT ) 
         { // left arrow pressed
            leftPress = false;
         }

      }

      public void keyPressed(KeyEvent e)
      {
         if (e.getKeyCode() == KeyEvent.VK_RIGHT )
         { // right arrow pressed
            rightPress = true; 
            System.out.println("right");
         } 
         if (e.getKeyCode() == KeyEvent.VK_LEFT ) 
         { // left arrow pressed
            leftPress = true;
            //System.out.println("left");
         }
         repaint();
      }
   }
   
   // timer ActionListener: ball movement
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
         /* testing 
         System.out.println("x: " + ballX_velocity);
         System.out.println("y: " + ballY_velocity);
         */
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