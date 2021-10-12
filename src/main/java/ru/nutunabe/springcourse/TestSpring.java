package ru.nutunabe.springcourse;

import java.util.ArrayList;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ru.nutunabe.springcourse.config.SpringConfig;

public class TestSpring {
	public static void main(String[] args) {
//		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
//				"applicationContext.xml");
		AnnotationConfigApplicationContext 	context = new AnnotationConfigApplicationContext(
				SpringConfig.class
		);
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(musicPlayer.playMusic());
		
//		Computer computer = context.getBean("computer", Computer.class);
//		System.out.println(computer);
		
//		MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//		musicPlayer.playMusic();
		
//		ArrayList<Music> musicList = new ArrayList<Music>();
//		Music rock = context.getBean("rockMusic", Music.class);
//		Music phonk = context.getBean("phonkMusic", Music.class);
//		Music classical = context.getBean("classicalMusic", Music.class);
//		musicList.add(rock);
//		musicList.add(phonk);
//		musicList.add(classical);
//		
//		MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//		musicPlayer.setName("my music player");
//		musicPlayer.setVolume(80);
//		musicPlayer.setMusicList(musicList);
//		musicPlayer.playMusicList();
//				
		context.close();
	}
}
