package clumsybot;

import javafx.scene.media.MediaPlayer;
import tkbases.GameWindow;
import tkbases.utils.AudioUtils;

public class BotWindow extends GameWindow {
    MediaPlayer mediaPlayer;
    public BotWindow() {
        super(new BotCanvas());
        AudioUtils.initialize();
        this.mediaPlayer = AudioUtils.playMedia("music/sample.mp3");
        ((BotCanvas)gameCanvas).setupEnvironment();
    }

    @Override
    protected void closing() {
        super.closing();
        this.mediaPlayer.stop();
        this.mediaPlayer.dispose();
    }

    public void mainLoop() {
        try {
            ((BotCanvas)gameCanvas).setupBot();
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        this.gameLoop();
    }
}
