package com.hubgitalvin.wk3exer2;

import java.util.Scanner;

public class UseWhile {

/*
 * Student:  Alvin H. Revilas
 * Week 3, second assignment
 * 
 * Assignment requirements (as written):
 *  
 * Your job is to modify the previous exercise such that you continue to 
 * loop until valid input is received.
 * 
 * So instead of just returning the number or null when valid or invalid 
 * input is received, your job will be to continuously loop inside of your 
 * method until valid input is collected.
 * 
 * This means that your method should no longer return null, it should 
 * always return a valid number.
 * 
 * Note: again, let's not worry about the case when a user enters 
 * non-numeric input (i.e. a String).
 * 
 */	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int lowerLimit = 50, upperLimit = 300;
		String responseString = "Yes"; 
		Integer theResult; 
		
		theResult = processInput(lowerLimit, upperLimit); 
		
		System.out.println( "The number you typed in was: " + theResult.intValue() ); 
		
	}
	
	public static Integer processInput(int lowLim, int upLim) {
		
		Scanner firstInput = new Scanner(System.in); 
		System.out.println("Type a number between " + lowLim + " and " + upLim + ": ");

		String userInput = firstInput.nextLine(); 
		
		Integer myResult = Integer.parseInt(userInput); 
		int processedInt = myResult.intValue(); 
		
		while ((processedInt <= lowLim) || (processedInt >= upLim)) { 
		
		// only enter the while loop when the input is NOT between lowLim and upLim 
		// if the first try actually is valid then we just use that
		
			System.out.println("Oops, that number wasn't between " + lowLim + " and " + upLim + ", try again: "); 
			userInput    = firstInput.nextLine(); 
			myResult     = Integer.parseInt(userInput); 
			processedInt = myResult.intValue(); 
		} 
		
		firstInput.close();
		
		return myResult; 
	}

}
