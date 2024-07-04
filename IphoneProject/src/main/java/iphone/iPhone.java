package iphone;

import musicplayer.BasicMusicPlayer;
import musicplayer.MusicPlayer;
import phone.BasicPhone;
import phone.Phone;
import webbrowser.BasicWebBrowser;
import webbrowser.WebBrowser;

public class iPhone implements MusicPlayer, Phone, WebBrowser {
    private BasicMusicPlayer musicPlayer = new BasicMusicPlayer();
    private BasicPhone phone = new BasicPhone();
    private WebBrowser browser = new BasicWebBrowser();

    @Override
    public void play(){
        musicPlayer.play();
    }
    @Override
    public void pause(){
        musicPlayer.pause();
    }
    @Override
    public void stop(){
        musicPlayer.stop();
    }
    @Override
    public void call(String number) {
        phone.call(number);
    }

    @Override
    public void hangUp() {
        phone.hangUp();
    }

    @Override
    public void browse(String url) {
        browser.browse(url);
    }

    public void setTrack(String track) {
        musicPlayer.setTrack(track);
    }
}

