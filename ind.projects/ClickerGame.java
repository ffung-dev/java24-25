//*******************************************
//  ClickerGame.java        fiona fung
//
//  clicker game ;)
//*******************************************

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Scanner;

public class ClickerGame {

    // variables outside main method > access anywhere in class
    private static ClickerGame obj;
    private static int score = 0;
    private static JLabel scoreLabel = new JLabel(" clicks : " + score);


    public ClickerGame() { obj = this; }
    public static void main(String[] args) {
        new ClickerGame();
        // create variables & game things
        Scanner input = new Scanner(System.in);
        String name;

        // set jframe, jpanel, jbutton stuff
        JFrame frame = new JFrame(" clicker game ");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);

        JPanel panel = new JPanel();
        panel.setBackground(Color.pink);
        
        JButton button = new JButton(" click me ");
        button.setBackground(Color.white);
        button.addActionListener(obj.new MyListener());


        frame.add(panel);
        panel.add(button);
        panel.add(scoreLabel);

        frame.setVisible(true);
        input.close();
    }

    private class MyListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            score++;
            scoreLabel.setText(" clicks : " + score);
        }
    }
}
