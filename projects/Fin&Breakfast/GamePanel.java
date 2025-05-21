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
import java.awt.Font;

public class GamePanel extends JPanel
{ 
   // panel stats
   final int g_panelW = 524;
   final int g_panelH = 650;
 
   // ball movement variables
   int ballX = 256;
   int ballY = 570;
   int ballX_velocity = 4;
   int ballY_velocity = 4;
   final int g_ballDiameter = 25;
   
   // paddle movement variables
   private int paddleX = 190;
   private int paddleY = 600;
   private int paddleX_velocity = 10; 
   private boolean leftPress, rightPress;
   private Paddle paddle;
   private final int g_paddleW = 150;
   private final int g_paddleH = 30;
   
   // 2d array
   private final int rows = 6;
   private final int columns = 6;
   private final int g_brickWidth = 83;
   private final int g_brickHeight = 35;
   private FishBrick[][] bricks = new FishBrick[rows][columns]; // 42 bricks in 7 rows and 6 columns
  
   // timer to begin
   private int delay = 10; // updates every 10 milliseconds
   private Timer timer = new Timer(delay, new TimerListener());
   // game on / off / win / lose
   private boolean playing, win;
   // score
   private int score = 0 ;
   Font pixelFont = new Font("Monospaced", Font.BOLD, 16);   

   public GamePanel()
   {
      setLayout(null);
      setBounds(0, 0, g_panelW, g_panelH);   
      playing = false;
      
      paddle = new Paddle(paddleX , paddleY , paddleX_velocity);
      // detect keyboard press
      setFocusable(true); 
      addKeyListener(new ArrowListener());
      
      for (int r = 0 ; r < bricks.length ; r++)
      {
         for (int c = 0 ; c < bricks[r].length ; c++)
         {
            // create brick (randomize color)
            bricks[r][c] = new FishBrick(RandomFish(), r, c, 1); // all bricks are not hit at first
            // testing : System.out.println(r +" " + c);
         }
      }             
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
      
      // draw bricks      
      for (int r = 0 ; r < bricks.length ; r++)
      {
         for (int c = 0 ; c < bricks[r].length ; c++)
         {
            if (bricks[r][c].getHit() == 1)
            {
               // draw if not hit
               g.drawImage(bricks[r][c].getImage().getImage(), bricks[r][c].getX(), bricks[r][c].getY(),null);
            } else { } // do not draw
         }
      }
      
      // draw ball
      g.setColor(Color.white);
      ballX -= ballX_velocity;
      ballY -= ballY_velocity;
      g.fillOval(ballX, ballY, 25, 25);

      // draw score
      g.setFont(pixelFont);
      g.drawString("score: " + score, 25, 640);
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
         if ((e.getKeyCode() == KeyEvent.VK_UP) && !playing ) 
         {  // begin game & launch ball
            playing = true;
            timer.start();
         }

         if ((e.getKeyCode() == KeyEvent.VK_RIGHT) && playing )
         { // right arrow pressed
            rightPress = true; 
         } 
         if ((e.getKeyCode() == KeyEvent.VK_LEFT) && playing) 
         { // left arrow pressed
            leftPress = true;
         }
         if (playing) { repaint(); }
      }
   }
   
   // timer ActionListener: ball movement
   private class TimerListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         // X VALUE bounce
         if (ballX <= 0 || ballX >= g_panelW - g_ballDiameter )
         {
            ballX_velocity = -ballX_velocity;
         }
         
         // Y VALUES
         if( ballY >= paddleY ) {
            // passed paddle = lose
            System.out.println("game over!") ; 
            win = false;
            playing = false;
         } else if (ballY+g_ballDiameter > paddleY && paddleCollision(ballX)) {
            // detect ball-paddle collision 
            System.out.println("y collision");
            ballY_velocity = -ballY_velocity;
         } else if (fishCollision(ballX, ballY) ) {
            // true: increase score // in function: brick removed, bounced off
           score += 5;
         } else if (ballY <= 0 ) {
            // bounce of top wall
            ballY_velocity = -ballY_velocity;
         } 
         repaint();
      }
   }
   
   // determine if the ball hits a fish-brick
   public boolean fishCollision(int bX, int bY) 
   {
      boolean result = false;
      // loop through all fish bricks
      outer: 
      for (int r = 0 ; r < bricks.length ; r++)
      {
         for (int c = 0 ; c < bricks[r].length ; c++)
         {
            // if brick is available
            if (bricks[r][c].getHit() == 1)
            {
               // detect intersection
               Rectangle ballRect = new Rectangle(bX, bY, g_ballDiameter, g_ballDiameter);
               Rectangle brickRect = new Rectangle(bricks[r][c].getX(), bricks[r][c].getY(), g_brickWidth, g_brickHeight);
               if (ballRect.intersects(brickRect)) // ball hits brick!
               { 
                  result = true;
                  bricks[r][c].setHit(0);
                  // bounced off side or top or bottom of brick?
                  if (ballX + g_ballDiameter == bricks[r][c].getX() || ballX == bricks[r][c].getX())
                  {     // ball hits the side
                     ballX_velocity = -ballX_velocity;
                  } else {
                        // ball hits top or bottom
                     ballY_velocity = -ballY_velocity;
                     
                  }
                  break outer;
               }
            // brick already hit
            } else {
               result = false;
            }
         }
      }
      return result;
   }
   
   public boolean paddleCollision(int ballX) //, int objectX, int objectY)
   {
      /* if (ballX > paddle.getX() && ballX < (paddle.getX() + g_paddleW))
      {   
         return true ; 
      } else { 
         return false;
      } */
      return (new Rectangle(ballX, ballY, g_ballDiameter, g_ballDiameter).intersects(new Rectangle(paddle.getX(), paddle.getY(), g_paddleW, g_paddleH)));
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