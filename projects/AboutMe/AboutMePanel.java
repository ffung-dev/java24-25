//*************************************************************
//    AboutMePanel.java       Author: Fiona Fung
//
//    stores panel information for AboutMe.java
//*************************************************************

// import packages for panels, colors, events
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

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
         button[i].setBackground(pickLightColor(i));
         button[i].setForeground(pickDarkColor(i));
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
      answerLabel.setHorizontalTextPosition(SwingConstants.CENTER);
      answerLabel.setVerticalTextPosition(JLabel.TOP);

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
      ImageIcon giraffeIcon = new ImageIcon("giraffeIcon.png");
      String[] answers = {"fiona" , "<html>periwinkle<br>(or #ede9f7)</html>", "giraffes", "any form of potatoes", "<html>baking, <br>crocheting, <br>reading</html>" , "october 17"};
      public void actionPerformed(ActionEvent event)
      {
         String labelText = answerLabel.getText();
         // set labelText based on the button pressed
         if (event.getSource() == button[0] )
         {
            labelText = answers[0];
            answerLabel.setIcon(null);
         } else if (event.getSource() == button[1] ) {
            labelText = answers[1];
            answerLabel.setIcon(null);
         } else if (event.getSource() == button[2] ) {
            labelText = answers[2];
            answerLabel.setIcon(giraffeIcon);
         } else if (event.getSource() == button[3] ) {
            labelText = answers[3];
            answerLabel.setIcon(null);
         } else if (event.getSource() == button[4] ) {
            labelText = answers[4];
            answerLabel.setIcon(null);
         } else if (event.getSource() == button[5] ) {
            labelText = answers[5];
            answerLabel.setIcon(null);
         }
         // update answer in panel
         answerLabel.setText(labelText);
      }
   }
   
   // methods to pick color of text/background (i depends on the button)
    private Color pickDarkColor(int i)
    {
      Color result = new Color(0, 0, 0);
      if (i == 5)
      {
         result = new Color(38, 29, 18 );
      } else if (i == 4) {
         result = new Color(38, 28, 51 );
      } else if (i == 0) {
         result = new Color(38, 18, 30 );
      } else if (i == 1) {
         result = new Color(43, 38, 26 );
      } else if (i == 2) {
         result = new Color(25, 33, 22 );
      } else if (i == 3) {
         result = new Color(22, 30, 36 );
      } 
      return result;
    }
    private Color pickLightColor(int i)
    {
      Color result = new Color(0, 0, 0);
      if (i == 5)
      {
         result = new Color(247, 241, 233);
      } else if (i == 4) {
         result = new Color(240, 233, 247 );
      } else if (i == 0) {
         result = new Color(247, 234, 233);
      } else if (i == 1) {
         result = new Color(247, 247, 223 );
      } else if (i == 2) {
         result = new Color(229, 245, 228 );
      } else if (i == 3) {
         result = new Color(235, 236, 245 );
      } 
      return result;
    
    } 


}