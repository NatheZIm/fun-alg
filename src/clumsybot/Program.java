package clumsybot;

import tkbases.GameWindow;

/**
 * Created by huynq on 1/28/18.
 */
public class Program {
    public static void main(String[] args) {
        BotCanvas botCanvas = new BotCanvas();
        GameWindow window = new GameWindow(botCanvas);
        window.gameLoop();
    }
}
