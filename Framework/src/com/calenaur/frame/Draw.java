package com.calenaur.frame;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Draw extends JPanel {

    private ArrayList<com.calenaur.panel.Panel> panelList = new ArrayList<>();

    public void addPanel(com.calenaur.panel.Panel panel){
        panelList.add(panel);
    }

    public void removePanel(com.calenaur.panel.Panel panel){
        panelList.remove(panel);
    }

    public void removePanel(int i){
        panelList.remove(i);
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        for(com.calenaur.panel.Panel p : panelList){
            if(p != null){
                p.draw(g, getWidth(), getHeight());
            }
        }
    }
}
