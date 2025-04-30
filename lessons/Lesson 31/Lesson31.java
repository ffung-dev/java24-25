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
// import packages
import java.awt.*;
import javax.swing.*;

public class Lesson31
{
   public static  void main(String[] args)
   {
      // create frame   
      JFrame frame = new JFrame("Lesson 31");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      // create icons & labels
      ImageIcon pIcon = new ImageIcon("pancham.jpg");
      ImageIcon aIcon = new ImageIcon("alcremie.png");
      JLabel pLabel = new JLabel("pancham", pIcon, SwingConstants.CENTER);
      JLabel aLabel = new JLabel("alcremie", aIcon, SwingConstants.CENTER);
      aLabel.setHorizontalTextPosition (SwingConstants.CENTER);
      aLabel.setVerticalTextPosition (SwingConstants.BOTTOM);
     
      // custom colors
      Color darkBlue = new Color(60, 90, 166);
      Color lightPink = new Color(247, 233, 238);
      Color lightGray = new Color(201, 199, 200);

      // create panels and assign labels
      JPanel outside = new JPanel(); // holds pancham and alcremie panels
      outside.setBackground(darkBlue);
      JPanel labelPancham = new JPanel();
      labelPancham.setBackground(lightGray);
      labelPancham.add(pLabel);
      labelPancham.setPreferredSize(new Dimension(250,250));

      JPanel labelAlcremie = new JPanel();
      labelAlcremie.setBackground(lightPink);
      labelAlcremie.setPreferredSize(new Dimension(250,250));
      labelAlcremie.add(aLabel);
      

      outside.add(labelPancham);
      outside.add(labelAlcremie);

      frame.getContentPane().add(outside);
      frame.pack();
      frame.setVisible(true);
      
   }
}