package main.abstracts;

import main.TileType;
import java.awt.Graphics;

public abstract class Tile {
    public int id;
    protected int[] coordinates;
    protected TileType tileType;

    public Tile(int x, int y) {
        coordinates = new int[]{x, y};
    }

    public void paintTile(Graphics gr) {
        gr.setColor(tileType.getTileColor());
        gr.fillRect(coordinates[0],coordinates[1],50,50);
    }
}
