//***************************************************************
//    FinAndBreakfast.java          Author: Fiona Fung 
//
//    a brick-breaker game but with penguins and fish
//    used with FishBrick, FinAndBreakfastPanel
//***************************************************************

import javax.swing.*;
public class FinAndBreakfast
{
   public static void main (String[] args)
   {
      // override system settings
      try {
         UIManager.setLookAndFeel( UIManager.getCrossPlatformLookAndFeelClassName() );
      } catch (Exception e) {
         e.printStackTrace();
      }

      JFrame frame = new JFrame();
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      FinAndBreakfastPanel game = new FinAndBreakfastPanel();
      
      frame.setResizable(false);
      frame.getContentPane().add(game);
      frame.pack();
      frame.setVisible(true);
   
   }
}