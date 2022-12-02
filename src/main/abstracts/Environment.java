package main.abstracts;

import main.interfaces.EnvironmentInterface;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public abstract class Environment extends Canvas implements EnvironmentInterface{
    protected int width = 5;
    protected int widthPx = width*100;
    protected int height = 5;
    protected int heightPx = height*100;
    protected Color backgroundColor = Color.BLACK;
    protected int nTiles = width*height;

    JFrame frame = new JFrame("ProjectG");

    public void initEnvironment(Canvas env){
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        env.setSize(widthPx, heightPx);
        env.setBackground(backgroundColor);
        frame.add(env);
    }

    public void render(){
        frame.pack();
        frame.setVisible(true);
        //gr.drawRect(0,0,width,height);
    }
int ii = 0;
    public void paint(Graphics gr) {
        ii++;
        System.out.println("I was called!!! "+ii);
        //vertical lines
        for(int i = 1; i < width; i++) {
            int linePx = i*100;
            gr.drawLine(linePx,0,linePx,heightPx);
            gr.drawLine(0,linePx,widthPx,linePx);
        }
//        enable when other ratios developed
//        //horizontal lines
//        for(int i = 1; i < height; i++) {
//            gr.drawLine(i*100,0,i*100,heightPx);
//        }
    }
    //public
}
