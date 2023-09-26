package Hangman;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HangmanGUI {
    private JPanel Mainpanel;
    private JLabel Label;
    private JTextField Erraten;
    private JTextField Raten;
    private JButton B;
    private JButton Button;


    public HangmanGUI() {
        Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String wort = "Orangutan";
                int a = wort.length();
                for(int i = 0; i<a;i++){
                    Erraten.setText(Erraten.getText()+"- ");
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("HangmanGUI");
        frame.setContentPane(new HangmanGUI().Mainpanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }


}
