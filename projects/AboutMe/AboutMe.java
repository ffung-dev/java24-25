//**************************************************************
//    AboutMe.java         Author: Fiona Fung
//
// implementing java gui to make an about me program
//**************************************************************

import javax.swing.JFrame;
import javax.swing.*;

public class AboutMe
{
   public static void main (String[] args)
   {
      // override system settings
      try {
         UIManager.setLookAndFeel( UIManager.getCrossPlatformLookAndFeelClassName() );
      } catch (Exception e) {
         e.printStackTrace();
      }
      
      // create frame
      JFrame frame = new JFrame("who am i ?");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      // create instance of panel
      AboutMePanel panel = new AboutMePanel();
           
      // add into frame + show 
      frame.setResizable(false);
      frame.getContentPane().add(panel);
      frame.pack();
      frame.setVisible(true);
   
   }
   
}