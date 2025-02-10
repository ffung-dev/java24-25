//*******************************************

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Radio 
{
    public static void main(String[] args) 
    {
        JFrame radio = new JFrame(" radio ");
        JLabel test = new JLabel(" < click me :) ");
        JPanel panel = new JPanel();
        JButton button = new JButton(" play music ");
        // radio.add(test);
        radio.add(panel);
        radio.setSize(400,400);
        radio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // end run when X is clicked

        button.setBackground(Color.white);
        button.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                System.out.println("button clicked");
            }
        });    
        panel.setBackground(Color.pink);
        panel.add(button);
        panel.add(test);

        radio.setVisible(true);
    }
}
