package org.sergei.spring.lesson_04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MusicPlayer {

//    @Autowired
    private Music music;

    @Autowired
    private ClassicalMusic classicalMusic;
    @Autowired
    private JazzMusic jazzMusic;

//    @Autowired
//    public MusicPlayer(ClassicalMusic classicalMusic, JazzMusic jazzMusic) {
//        this.classicalMusic = classicalMusic;
//        this.jazzMusic = jazzMusic;
//    }

    //    по умолчанию зависимость внедряется через конструктор, даже без аннотации

//    @Autowired
//    public MusicPlayer(Music music) {
//        this.music = music;
//    }


    //спрингу не важно наименование метода он все равно будет внедрять зависимость
    // исходя из передаваемого параметра

//    @Autowired
//    public void setMusicasfasfasf(Music music) {
//        this.music = music;
//    }

    public String playMusic() {
//        System.out.println("Playing : " + music.getSong());
//        System.out.println("Playing : " + classicalMusic.getSong());
//        System.out.println("Playing : " + jazzMusic.getSong());
        return "Playing : " + classicalMusic.getSong();

    }

}
