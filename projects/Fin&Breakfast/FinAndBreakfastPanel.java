//***************************************************************
//    FinAndBreakfastPanel.java          Author: Fiona Fung
//
//    holds game, start/end screens, etc.
//***************************************************************

// import packages
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FinAndBreakfastPanel extends JPanel
{
   // the panel itself
   public FinAndBreakfastPanel()
   {
      setBackground(new Color(127, 159, 180));
      setLayout(null);
      setPreferredSize(new Dimension(1000, 650));
      
      // container panel for gameplay, start/end screens
      JPanel container = new JPanel();
      container.setLayout(null);
      container.setBounds(238, 0, 524, 650);
      container.setBackground(Color.white);
      
      // gameplay panel
      GamePanel gameplayPanel = new GamePanel();
      container.add(gameplayPanel);
      //test gameplayPanel.setVisible(false);
      add(container);

   
   }
   
   // draw side backgrounds
   public void paintComponent(Graphics g)
   {
      ImageIcon sideBG = new ImageIcon("sidebg.png");
      super.paintComponent(g);
      g.drawImage(sideBG.getImage(), 0 , 0 , null);
      g.drawImage(sideBG.getImage(), 762 , 0, null);
      
   }

}