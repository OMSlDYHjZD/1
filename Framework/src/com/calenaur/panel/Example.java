package com.calenaur.panel;

import java.awt.*;

public class Example implements Panel {

	private double width;
	private double height;
    @Override
    public void update() {

    }
    private void rect(Graphics g, int x, int y, int w, int h){
    	double rectw = (double) w/1920 * width;
    	double recth = (double) h/1080 * height;
    	double rectx = (double) x/1920 * width;
    	double recty = (double) y/1080 * height;
    	g.drawRect((int)rectx, (int)recty, (int)rectw, (int)recth);
    	
    }
    @Override
    public void draw(Graphics g, int width, int height) {
        this.width = width;
        this.height = height;
        System.out.println(height);
    	double procentw = (double) 1310/1920 * width;
        double procenth = (double) height/1080 * height;
    	//g.drawRect( 600/1920 * width, 10, (int) procentw , (int) height);
        rect(g, 10, 10, 250, height);
        g.drawOval(200, 15, 50, 50);
        g.drawOval(130, 15, 50, 50);
        g.drawRect(25, 100, 210, 50);
        g.drawRect(25, 170, 210, 50);
        g.drawRect(25, 240, 210, 50);
        g.drawRect(25, 310, 210, 50);
        g.drawRect(25, 380, 210, 50);
        g.drawRect(25, 450, 210, 50);
        g.drawRect(25, 520, 210, 50);
        g.drawRect(25, 590, 210, 50);
        g.drawRect(25, 660, 210, 50);
        g.drawRect(25, 730, 210, 50);
        g.drawRect(25, 800, 210, 50);
        //g.drawOval(25, );
    }
}
