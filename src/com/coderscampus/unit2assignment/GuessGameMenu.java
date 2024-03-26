package com.coderscampus.unit2assignment;

import java.util.Scanner;

public class GuessGameMenu {
//================================================
	public static void gameMenu() {
							
			System.out.println("===================\n"
					+ "Guessing Game\n"
					+ "===================\n"
					+ "(1) Start\n"
					+ "(2) Exit\n");			
	}			
//=================================================	
	public static void getInput() {
		
		Scanner scanInput = new Scanner(System.in);
		String userInput = "1";
		
		while (userInput.equals("1")) {
			
			//display the game menu prompt
			gameMenu();
			//get user's input
			userInput = scanInput.nextLine();			
			if (userInput.equals("2")) {
				System.out.println("Goodbye!"); //farewell
			} 
			else if (userInput.equals("1") == false && userInput.equals("2") == false) {
				System.out.println("Invald input, please try again");				
				getInput();
			}
		}
		
		scanInput.close();
		
	}
	

}
//=====================END==========================