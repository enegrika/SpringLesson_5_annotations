import org.sergei.spring.lesson_04.ClassicalMusic;
import org.sergei.spring.lesson_04.Music;
import org.sergei.spring.lesson_04.MusicPlayer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");

        MusicPlayer musicPlayer = context.getBean("musicPlayer",MusicPlayer.class);

        musicPlayer.playMusic();

        context.close();
    }
}
