package ru.nutunabe.springcourse;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music {
	public String getSong() {
		return "AC/DC - Back in Black";
	}
}
