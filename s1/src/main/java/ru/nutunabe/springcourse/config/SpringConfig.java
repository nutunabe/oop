package ru.nutunabe.springcourse.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import ru.nutunabe.springcourse.Computer;
import ru.nutunabe.springcourse.Music;
import ru.nutunabe.springcourse.MusicPlayer;
import ru.nutunabe.springcourse.genres.ClassicalMusic;
import ru.nutunabe.springcourse.genres.PhonkMusic;
import ru.nutunabe.springcourse.genres.RockMusic;

import java.util.Arrays;
import java.util.List;

@Configuration
//@ComponentScan("ru.nutunabe.springcourse")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    @Bean
    @Scope("prototype")
    public ClassicalMusic classicalMusic() {
        return new ClassicalMusic();
    }

    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }

    @Bean
    public PhonkMusic jazzMusic() {
        return new PhonkMusic();
    }

    @Bean
    public List<Music> musicList() {
        // Этот лист неизменяемый (immutable)
        return Arrays.asList(classicalMusic(), rockMusic(), jazzMusic());
    }

    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(musicList());
    }

    @Bean
    public Computer computer() {
        return new Computer(musicPlayer());
    }
}
