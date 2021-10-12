package ru.nutunabe.springcourse.genres;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import ru.nutunabe.springcourse.Music;

public class ClassicalMusic implements Music {
	private List<String> songs = new ArrayList<>();
	
    {
        songs.add("Moonlight Sonata");
        songs.add("Symphony no. 5 in C Minor, op. 67");
        songs.add("Night on Bald Mountain");
    }
    
//    @PostConstruct
//	public void doMyInit() {
//		System.out.println("Doing my initialization");
//	}
//	
//    @PreDestroy
//	public void doMyDestroy() {
//		System.out.println("Doing my destruction");
//	}
    	
	public List<String> getSongs() {
		return songs;
	}
}
