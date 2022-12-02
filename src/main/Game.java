package main;

import main.abstracts.Environment;

public class Game {

    public static void main(String[] args) {
        //Loader.loadAll();
        Environment env = new BasicEnvironment();
        env.render();
    }
}
