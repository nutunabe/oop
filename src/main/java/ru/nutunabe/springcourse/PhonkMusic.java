package ru.nutunabe.springcourse;

import org.springframework.stereotype.Component;

@Component
public class PhonkMusic implements Music {
	public String getSong() {
		return "MC ORSEN - INCOMING";
	}
}
