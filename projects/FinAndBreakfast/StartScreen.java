//********************************************************
//    StartScreen.java        Author: Fiona Fung
//
//    start screen for Fin & Breakfast
//********************************************************

import javax.swing.*;
import java.awt.*;
import java.awt.Graphics;
import java.awt.event.*;

public class StartScreen extends JPanel
{
   private final int g_panelW = 524;
   private final int g_panelH = 650;
   private ImageIcon bg = new ImageIcon("startbg.png");
   private Timer timer = new Timer(50, new TimerListener());
   private JButton playBtn = new JButton(new ImageIcon("playbtn.png"));

   public StartScreen()
   {  
   
      System.out.println("***** creating StartScreen ******") ; 
     
      //setLayout(null);
      setBounds(0,0,g_panelW, g_panelH);
      setBackground(Color.BLUE);
      
      playBtn.setBorder(BorderFactory.createEmptyBorder());
      playBtn.setContentAreaFilled(false);
      playBtn.addActionListener(new ButtonListener());
      //playBtn.setBounds(100,50,0,0);
      playBtn.setVisible(true);
      add(playBtn);
      timer.start();
     } 
   
   public void paintComponent(Graphics g)
   {
      super.paintComponent(g);
      g.drawImage(bg.getImage(), 0, 0, null);
   }
   public ImageIcon pickBird()
   {
      ImageIcon bird1 = new ImageIcon("bird1.png");
      ImageIcon bird2 = new ImageIcon("bird2.png");
      ImageIcon bird3 = new ImageIcon("bird3.png");
      ImageIcon result = bird1;
      return result;
   
   }
   // listens for play button push
   private class TimerListener implements ActionListener
   {
      public void actionPerformed(ActionEvent event)
      {
         repaint();      
      }
   }
   
   public class ButtonListener implements ActionListener
   {
      public void actionPerformed(ActionEvent event)
      {
         
      }
   }   
}