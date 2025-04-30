//*******************************************************
//  Lesson32Panel.java        Author: Fiona Fung
//
//    panel for Lesson32
//*******************************************************

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class Lesson32Panel extends JPanel
{
    // create labels and textfield
     private JLabel topLabel, nameLabel;
     private JTextField field;
     // panel (to go inside frame in Lesson32)
       public Lesson32Panel()
    {
        // panel info
        Color lightPink = new Color(255, 240, 245);
        Color darkPink = new Color(69, 7, 30);
        setBackground(lightPink);
        setPreferredSize(new Dimension(200,100));
        // label info
        topLabel = new JLabel("hey there what's your name");
        topLabel.setForeground(darkPink);
        nameLabel = new JLabel("who are you?");
        nameLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        nameLabel.setVerticalTextPosition(SwingConstants.BOTTOM);
        // field info
        field = new JTextField(7);
        field.addActionListener(new ButtonListener());

        // add labels and field to panel
        add(topLabel);
        add(field);
        add(nameLabel);
    }

   // when a button is clicked, nameLabel is changed 
    private class ButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {   
            nameLabel.setText("oh hello " + field.getText());
            nameLabel.setForeground(pickColor());;
            field.setText(""); // empty text field after input
        }
    }
    private Color pickColor()
    {
        Random generator = new Random();
        // generate a dark color 
        int r = generator.nextInt(41); // (0-40)
        int g = generator.nextInt(127); // (0-126)
        int b = generator.nextInt(256);
        Color result = new Color(r,g,b);
        return result;
    }
}
