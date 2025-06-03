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
   JPanel container = new JPanel();
   JPanel howToPanel = new JPanel(); 
   GamePanel gameplayPanel = new GamePanel();

   // the panel itself
   public FinAndBreakfastPanel()
   {
      setBackground(new Color(127, 159, 180));
      setLayout(null);
      setPreferredSize(new Dimension(1000, 650));
      
      // container panel for gameplay, start/end screens
      container.setLayout(null);
      container.setBounds(238, 0, 524, 650);
      container.setBackground(Color.white);
      
      // howTo panel
      howToPanel.setBounds(0, 0, 474, 230);
      howToPanel.setBackground(Color.red);
      howToPanel.setVisible(true);
      howToPanel.setLayout(null);
      JButton xButton = new JButton("x");
      howToPanel.add(xButton);
      
      // gameplay panel
      container.add(gameplayPanel);
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