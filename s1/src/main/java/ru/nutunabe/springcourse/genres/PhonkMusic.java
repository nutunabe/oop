package ru.nutunabe.springcourse.genres;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import ru.nutunabe.springcourse.Music;

public class PhonkMusic implements Music {
    private List<String> songs = new ArrayList<>();
    
    {
    	songs.add("Destination zero");
    	songs.add("INCOMING");
    	songs.add("massacre");
	}
    
	public List<String> getSongs() {
		return songs;
	}
}
