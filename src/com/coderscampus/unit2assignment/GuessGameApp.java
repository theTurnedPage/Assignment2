package com.coderscampus.unit2assignment;

import java.util.Random;

public class GuessGameApp {

	public static int makeNumber() {
		//create new Random object
		Random randomMaker = new Random();
		//assign value to variable, then return it to the game menu
		int randomNumber = randomMaker.nextInt(101);		
		return randomNumber; 	
	}
}
