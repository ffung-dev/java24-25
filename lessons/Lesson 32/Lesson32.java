//*******************************************************
//  Lesson32.java          Author: Fiona Fung
//
//  using textfields and buttons (with Lesson32Panel)
//*******************************************************

import javax.swing.JFrame;

public class Lesson32
{
   public static void main (String[] args)
   {
      JFrame frame = new JFrame();
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      Lesson32Panel panel = new Lesson32Panel();
      
      frame.getContentPane().add(panel);
      frame.pack();
      frame.setVisible(true);
   }
}