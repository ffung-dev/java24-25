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
      
      JPanel layoutPanel = new JPanel(new CardLayout());
      
      // create instance of panels (AboutMeFavPanel, AboutMeHiPanel
      AboutMeFavPanel favPanel = new AboutMeFavPanel();
      AboutMeHiPanel hiPanel = new AboutMeHiPanel();
      
      layoutPanel.add(hiPanel, "hi there");
      layoutPanel.add(favPanel, "my favorite things");
      // add into frame + show 
      frame.getContentPane().add(panel);
      frame.pack();
      frame.setVisible(true);
   
   }
}