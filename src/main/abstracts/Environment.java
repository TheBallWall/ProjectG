package main.abstracts;

import main.BasicTile;
import main.interfaces.EnvironmentInterface;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public abstract class Environment extends Canvas implements EnvironmentInterface {
    protected int width = 7;
    protected int widthPx = width * 100;
    protected int height = 7;
    protected int heightPx = height * 100;
    protected Color envColor = Color.BLACK;
    protected int nTiles = width * height;

    JFrame frame = new JFrame("ProjectG");

    public void initEnvironment(Canvas env) {
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        env.setSize(widthPx, heightPx);
        env.setBackground(envColor);
        frame.add(env);
    }

    public void render() {
        frame.pack();
        frame.setVisible(true);
        //gr.drawRect(0,0,width,height);
        System.out.println("tiles: " + nTiles);
    }

    int ii = 0;

    public void paint(Graphics gr) {
        ii++;
        System.out.println("I was called!!! " + ii);

        int marginWidth = widthPx / 10;
        int marginHeight = heightPx / 10;
        int offset = 60;
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                new BasicTile(marginWidth + (width - i) * offset, marginHeight + (height - j) * offset).paintTile(gr);
            }
        }

//        //vertical lines
//        for(int i = 1; i < width; i++) {
//            int linePx = i*100;
//            gr.drawLine(linePx,0,linePx,heightPx);
//            gr.drawLine(0,linePx,widthPx,linePx);
//        }
////        enable when other ratios developed
////        //horizontal lines
////        for(int i = 1; i < height; i++) {
////            gr.drawLine(i*100,0,i*100,heightPx);
////        }
    }

}
