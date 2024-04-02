package com.coderscampus.unit2assignment;

import java.util.Scanner;

public class GuessGameMenu {
//================================================
	public static void mainMenu() {
			//display main menu
			System.out.println("===================\n"
					+ "Guessing Game\n"
					+ "===================\n"
					+ "(1) Start\n"
					+ "(2) Exit\n");			
	}			
//=================================================	
	public static void mainInput() {
		
		Scanner scanInput = new Scanner(System.in);
		String userInput = "";
		
		while (userInput.equals("2") == false) {
			
			//display the game menu prompt
			mainMenu();			
			//get user's input
			userInput = scanInput.nextLine();
			if (userInput.equals("1")) {
				gameInput(GuessGameApp.makeNumber());
			}
			else if (userInput.equals("2")) {
				System.out.println("Goodbye!"); //farewell
			} 
			else if (userInput.equals("1") == false && userInput.equals("2") == false) {
				System.out.println("Invald input, please try again");				
				mainInput();
			}
		}
		//close scanner
		scanInput.close();		
	}
	public static void gameMenu() {
		//display actual game menu
		System.out.println("-------------------\n"
				+ "Guess the correct number!\n"
				+ "------------------\n"
				+ "Enter a number between 1 and 100.\n");									
	}
	
	public static void gameInput(int randomNumber) {
		//initialize variables, create objects
		int convertedInput = 0;
		int correctNumber = GuessGameApp.makeNumber(); //assign correct answer from method
		int attemptsLeft = 5;
		Scanner inputScanner = new Scanner(System.in);
		
		
		//loop for the 5 maximum attempts
		for (int attemptNumber = 1; attemptNumber < 6 && convertedInput != correctNumber; attemptNumber++) {
			
			gameMenu();
			//get user input
			String userInput = inputScanner.nextLine();		
			convertedInput = Integer.parseInt(userInput); 
			
			if (convertedInput <  1 || convertedInput > 100) {		
				System.out.println("Invalid input, please try again!");
				attemptNumber--; //return an attempt to the player
			}						
			else if (convertedInput > correctNumber && convertedInput > 0 && convertedInput < 100) {
				attemptsLeft--;
				System.out.println("Please pick a lower number.\nYou have " + attemptsLeft + " guesses remaining.");
			}			
			else if (convertedInput < correctNumber && convertedInput > 0 && convertedInput < 100) {
				attemptsLeft--;
				System.out.println("Please pick a higher number.\nYou have " + attemptsLeft + " guesses remaining.");
			}
		}
		
		if (convertedInput == correctNumber) {
			System.out.println("You win! Correct answer is: " + correctNumber);
		}
		else {		
			System.out.println("You lose! The correct answer is: " + correctNumber);
		}
				

	}
	
//note, maybe make 1 method to take input instead of 2 and return its value and assign it to the variables in the other
//methods
}
//=====================END==========================