package org.sergei.spring.lesson_03;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {

    private Music music;

    private List<Music> musicList = new ArrayList<>();

    private String name;
    private int volume;

    public Music getMusic() {
        return music;
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public List<Music> getMusicList() {
        return musicList;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public MusicPlayer() {
    }

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void playMusicList() {

        for (Music music : musicList) {
            System.out.println(this.name + " playing " + music.getSong() + " at volume " + this.getVolume());
        }
    }

    private void doInit() {
        System.out.println("Initialized Music player bean-object " + this);
    }

    private void doDestroy() {
        System.out.println("Destroyed Music player bean-object " + this);
    }

}
