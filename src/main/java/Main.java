import org.sergei.spring.lesson_04.ClassicalMusic;
import org.sergei.spring.lesson_04.Computer;
import org.sergei.spring.lesson_04.Music;
import org.sergei.spring.lesson_04.MusicPlayer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        // получение контейнера(контекста) Спринга, в котором он хранит все объекты-бины

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationcontext.xml");

//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//
//        musicPlayer.playMusic();

        Computer computer = context.getBean("computer",Computer.class);

        System.out.println(computer);

        context.close();
    }
}
