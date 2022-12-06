package main;

import java.awt.Color;

public enum TileType {
    BASIC(Color.white),OTHER(Color.red);
    Color tileColor;
    TileType(Color color){
        this.tileColor = color;
    }
    public Color getTileColor(){
        return this.tileColor;
    }
}
