package main;

import main.abstracts.Tile;

public class BasicTile extends Tile {
    public BasicTile(int x, int y) {
        super(x, y);
        this.tileType = TileType.BASIC;
    }
}
