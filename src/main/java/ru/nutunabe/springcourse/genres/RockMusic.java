package ru.nutunabe.springcourse.genres;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import ru.nutunabe.springcourse.Music;

public class RockMusic implements Music {
    private List<String> songs = new ArrayList<>();
    
    {    
    	songs.add("Wind cries Mary");
    	songs.add("Paint it black");
    	songs.add("Can't seem to make you mine");
    }
	
	public List<String> getSongs() {
		return songs;
	}
}
