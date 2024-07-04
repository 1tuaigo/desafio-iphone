package musicplayer;

public class BasicMusicPlayer implements MusicPlayer {
    private String currentTrack;

    @Override
    public void play(){
        System.out.println("Playing" + currentTrack);
    }

    @Override
    public void pause(){
        System.out.println("Paused" + currentTrack);
    }

    @Override
    public void stop(){
        System.out.println("Stopped" + currentTrack);
    }

    public void setTrack(String track){
        this.currentTrack = track;
    }
}