package com.calenaur.frame;

import javax.swing.*;

public class Frame extends JFrame {

    private JFrame frame;

    public Frame(Draw draw){
        frame = new JFrame();
        frame.setTitle("Chat");
        frame.setSize(1920, 1080);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        frame.setContentPane(draw);
        frame.setVisible(true);
    }

    public JFrame getFrame(){
        return frame;
    }

}
