import org.sergei.spring.lesson_04.ClassicalMusic;
import org.sergei.spring.lesson_04.MusicPlayer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");

        MusicPlayer mp = context.getBean("musicPlayerBean", MusicPlayer.class);

        mp.playMusicList();

        ClassicalMusic classicalMusic = context.getBean("classicalBean", ClassicalMusic.class);


        context.close();
    }
}
