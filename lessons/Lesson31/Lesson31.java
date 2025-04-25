//******************************************************
//  Lesson31.java        Author: Fiona Fung 
// 
//  creating a gui
//******************************************************

/* 
   answers to questions on google classroom
   1. there are two panels (green and red) on top of a blue panel. each smaller panel has text (label) inside
   2. the green and red panels are smaller than the blue panel
   3. this gui has two panels within another larger panel. they are created separately and primary.add is used to add them onto the blue panel 
*/
// import
 packages
import java.awt.*;
import javax.swing.*;

public class Lesson31
{
   public static void main(String[] args)
   {
      // create frame   
      JFrame frame = new JFrame("Lesson 31");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      // create icons & labels
      ImageIcon pIcon = new ImageIcon("pancham.gif");
      ImageIcon aIcon = new ImageIcon("alcremie.jpeg");
      JLabel pLabel = new JLabel("pancham", pIcon, SwingConstants.CENTER);
      JLabel aLabel = new JLabel("alcremie", aIcon, SwingConstants.CENTER);
      
      // create panels and assign labels
      JPanel outside = new JPanel(); // holds pancham and alcremie panels
      JPanel pancham = new JPanel();
      JPanel alcremie = new JPanel();
      
      
      frame.pack();
      frame.setVisible(true);
      
   }
}