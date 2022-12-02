package main.abstracts;

import main.interfaces.EnvironmentInterface;

import java.awt.Canvas;
import java.awt.Color;
import javax.swing.JFrame;

public abstract class Environment extends Canvas implements EnvironmentInterface{
    protected int width = 5;
    protected int height = 5;
    protected Color backgroundColor = Color.BLACK;
    protected int nTiles = width*height;

    JFrame frame = new JFrame("ProjectG");

    public void initEnvironment(Canvas env){
        env.setSize(width*100, height*100);
        env.setBackground(backgroundColor);
        frame.add(env);
    }

    public void render(){
        frame.pack();
        frame.setVisible(true);
        //gr.drawRect(0,0,width,height);
    }
    //public
}
