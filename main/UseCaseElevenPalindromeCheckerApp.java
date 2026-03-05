package com.seveneleven.palindromecheckerapp.main;

import java.util.Scanner;

import com.seveneleven.palindromecheckerapp.services.PalindromeService;

/**
 * =================================================================
 * MAIN CLASS - UseCaseElevenPalindromeCheckerApp
 * =================================================================
 * 
 * Use Case 11: Object-Oriented Palindrome Service
 * 
 * Description:
 * This class demonstrates palindrome validation using
 * object-oriented design
 * 
 * The palindrome logic is encapsulated inside a
 * PalindromeService class.
 * 
 * This improves:
 * - Reusability
 * - Readability
 * - Seperation of concerns
 * 
 * @author Developer
 * @version 11.0
 */
public class UseCaseElevenPalindromeCheckerApp {
	
	/**
	 * Application entry point for UC11
	 * 
	 * @param args command-line arguments
	 */
	public static void main(String[]args) {
		// Scanner class for user input
		Scanner scanner = new Scanner(System.in);

		// Take original string as input
		System.out.print("Enter input string: ");
		String input = scanner.nextLine();
		
		// Create a service object
		PalindromeService checker = new PalindromeService();
		
		// Print the results
		System.out.println("Input : " + input);
		System.out.println("Is Palindrome? : " + checker.checkPalindrome(input.trim()));
		
		// Close the scanner
		scanner.close();
	}
}
