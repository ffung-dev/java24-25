//*******************************************

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.sound.sampled.*;

public class Radio 
{
    public static void main(String[] args) 
    {
        JFrame radio = new JFrame(" radio ");
        JLabel test = new JLabel(" < click me :) ");
        JPanel panel = new JPanel();
        /* ImageIcon NAME = new ImageIcon(png?);
         then put inside the button
         */
        JButton play = new JButton(" play music ");
        // radio.add(test);
        radio.add(panel);
        radio.setSize(400,400);
        radio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // end run when X is clicked

        play.setBackground(Color.white);
        play.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                System.out.println("play button clicked");
            }
        });    
        panel.setBackground(Color.pink);
        panel.add(play);
        panel.add(test);

        radio.setVisible(true);
    }
}
