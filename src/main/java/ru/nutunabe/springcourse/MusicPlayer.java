package ru.nutunabe.springcourse;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class MusicPlayer {
	@Value("${musicPlayer.name}")
	private String name;
	@Value("${musicPlayer.volume}")
	private int volume;
	
	private List<Music> musicList = new ArrayList<>();

    public MusicPlayer(List<Music> musicList) {
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
		
    public String playMusic() {
        Random random = new Random();
        int randomNumber = random.nextInt(3);

        return "Playing: " + musicList.get(random.nextInt(musicList.size())).getSongs().get(randomNumber)
                + " with volume " + this.volume;
    }
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public void setVolume(int volume) {
//		this.volume = volume;
//	}
//
//	public void setMusicList(List<Music> musicList) {
//        this.musicList = musicList;
//    }
//
//    public void playMusicList() {
//        for(Music music : musicList) {
//            System.out.println("Playing: " + music.getSong());
//        }
//    }
}
