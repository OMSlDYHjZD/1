package com.calenaur.base;

import com.calenaur.frame.Draw;
import com.calenaur.frame.Frame;
import com.calenaur.panel.Example;
import com.calenaur.panel.Panel;

public class Engine implements Runnable{

    private Draw draw;
    private Frame frame;
    private Panel panel;
    private Thread thread;
    private boolean running;

    public Engine(){
        draw = new Draw();
        frame = new Frame(draw);
        running = true;
        thread = new Thread(this);


        /*      MAAK JOUW PANEL HIER      */
        createPanel(new Example());
        /*--------------------------------*/
    }

    private void createPanel(Panel panel){
        this.panel = panel;
        draw.addPanel(panel);
    }

    @Override
    public void run() {
        try {
            while(running){
                if(panel != null){
                    panel.update();
                }
                draw.repaint();
                draw.revalidate();
                thread.sleep(1);
            }
        }catch(Exception e){
            running = false;
            e.printStackTrace();
        }
    }
}
