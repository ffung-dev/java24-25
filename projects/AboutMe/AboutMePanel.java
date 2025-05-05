//*************************************************************
//    AboutMePanel.java       Author: Fiona Fung
//
//    stores panel information for AboutMe.java
//*************************************************************

// import packages for panels, colors, events
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AboutMePanel extends JPanel
{
   // create buttons and label
   private JButton nameButton, colorButton, animalButton, foodButton, hobbyButton, bdayButton;
   private JLabel answerLabel;
   final JButton[] button;
         
   public AboutMePanel()
   {
      setLayout(new BorderLayout());
      // custom colors
      Color lightPink = new Color(250, 225, 232);
      Color darkPink = new Color(79, 47, 57);
      Color lightYellow = new Color(252, 248, 237);
      Color brown = new Color(128, 88, 78);
      
      // fonts
      Font fontB = new Font("Bookman Old Style", Font.PLAIN , 17);
      Font fontS = new Font("Bookman Old Style", Font.PLAIN, 12);

      // create buttons
      String[] buttonNames = {"my name is . . ." , "my favorite color is . . ." , "my favorite animal is . . ." , "my favorite food is . . ." ,"my hobbies are . . ." , "my birthday is . . ."};
      button = new JButton[6];
      // assign button text to buttons in array
      for (int i = 0 ; i < button.length ; i++)
      {
         button[i] = new JButton(buttonNames[i]);
         button[i].addActionListener(new ButtonListener());
         button[i].setHorizontalTextPosition(SwingConstants.LEFT);
         button[i].setBackground(Color.white);
         button[i].setForeground(darkPink);
         button[i].setFont(fontS);
         // button[i].setBorder(BorderFactory.createLineBorder(darkPink));
      } 
      
      // create topPanel
      JPanel topPanel = new JPanel();
      JLabel topText = new JLabel("about me");
      topText.setHorizontalTextPosition(SwingConstants.CENTER);
      topText.setForeground(Color.white);
      topPanel.setBackground(brown);
      topPanel.add(topText);
      
      // create buttonPanel
      JPanel buttonPanel = new JPanel();
      buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.Y_AXIS));
      buttonPanel.setPreferredSize(new Dimension(200,300));
      buttonPanel.setBackground(lightPink);
      
      for (int i = 0 ; i < button.length ; i++)
      {
         buttonPanel.add(Box.createRigidArea(new Dimension(15, 10))); // have some space between the buttons
         buttonPanel.add(button[i]);
      }
      
      // create answerPanel
      JPanel answerPanel = new JPanel();
      answerPanel.setPreferredSize(new Dimension(200,300));
      answerPanel.setBackground(lightYellow);
      answerLabel = new JLabel("- - -");
      answerLabel.setFont(fontB);
      answerLabel.setForeground(brown);
      answerPanel.add(answerLabel);
      
      // AboutMePanel
      setPreferredSize(new Dimension(400,300));
      setBackground(Color.red);
      add(topPanel, BorderLayout.PAGE_START); // on the top
      add(buttonPanel, BorderLayout.LINE_START) ; // on the left
      add(answerPanel, BorderLayout.LINE_END); // on the right
      
   
   }
   
   // listener for button push
   private class ButtonListener implements ActionListener
   {
      // answers to the button prompts
      ImageIcon fries = new ImageIcon("fries.jpg");
      String[] answers = {"fiona" , "#ede9f7 or periwinkle", "giraffes" + fries, "any form of potatoes", "<html>baking, <br>crocheting, <br>reading</html>" , "october 17"};
      public void actionPerformed(ActionEvent event)
      {
         String labelText = answerLabel.getText();
         // set labelText based on the button pressed
         if (event.getSource() == button[0] )
         {
            labelText = answers[0];
         } else if (event.getSource() == button[1] ) {
            labelText = answers[1];
         } else if (event.getSource() == button[2] ) {
            labelText = answers[2];
         } else if (event.getSource() == button[3] ) {
            labelText = answers[3];
         } else if (event.getSource() == button[4] ) {
            labelText = answers[4];
         } else if (event.getSource() == button[5] ) {
            labelText = answers[5];
         }
         // update answer in panel
         answerLabel.setText(labelText);
      }
   }
}