//**************************************************************
//    AboutMe.java         Author: Fiona Fung
//
//
//**************************************************************

import java.util.*;
import javax.swing.JFrame;

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
      JFrame frame = new JFrame();
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      // create instance of panel (see AboutMePanel.java)
      AboutMePanel panel = new AboutMePanel();
      
      // add into frame + show 
      frame.getContentPane().add(panel);
      frame.pack();
      frame.setVisible(true);
   
   }
}