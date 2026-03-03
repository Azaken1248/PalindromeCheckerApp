package com.seveneleven.palindromecheckerapp.main;

import java.util.Scanner;

/**
 * =================================================================
 * MAIN CLASS - UseCaseTenPalindromeCheckerApp
 * =================================================================
 * 
 * Use Case 10: Normalized Palindrome Checker
 * 
 * Description:
 * This class validates a palindrome after preprocessing
 * the input string.
 * 
 * Normalizarion includes:
 * - Removing spaces and symbols
 * - Converting to lowercase
 * 
 * This ensures the palindrome check is logical rather
 * than character-format dependent.
 * 
 * @author Developer
 * @version 10.0
 */
public class UseCaseTenPalindromeCheckerApp {
	
	/**
	 * Application entry point for UC10
	 * 
	 * @param args Command-line arguments
	 */
	public static void main(String[]args) {
		// Scanner class for user input
		Scanner scanner = new Scanner(System.in);

		// Take original string as input
		System.out.print("Enter input string: ");
		String input = scanner.nextLine();
		
		// Normalize the input
		String normalized = input.replace(" ", "").replace("[^a-zA-Z0-9]", "").trim().toLowerCase();
		
		// Flag to check palindrome
		boolean isPalindrome = true;
		
		// Compare characters from both ends
		for(int i = 0; i < normalized.length() / 2; i++) {
			if(normalized.charAt(i) != normalized.charAt(normalized.length() - i - 1)) {
				isPalindrome = false;
				break;
			}
		}
		
		// Print the results
		System.out.println("Input : " + input);
		System.out.println("Is Palindrome? : " + isPalindrome);
		
		// Close the scanner
		scanner.close();
	}
}
