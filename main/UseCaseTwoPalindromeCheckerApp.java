package com.seveneleven.palindromecheckerapp.main;

/**
 * =================================================================
 * MAIN CLASS - UseCaseTwoPalindromCheckerApp
 * =================================================================
 * 
 * Use Case 2: Hardcoded Palindrome Validation
 * 
 * Description:
 * This class demonstrates basic palindrome validation
 * using a hardcoded string value
 * 
 * At this stage, the application:
 * - Stores a predefined string
 * - Compares  characters from both ends
 * - Determined weather the string is a palindrome
 * - Displays the result on console
 * 
 * This use case introduces fundamental comparision logic
 * before using advanced data structures.
 * 
 * @author Developer
 * @version 2.0
 */
public class UseCaseTwoPalindromeCheckerApp {
	
	/**
	 * Application entry point for UC2
	 * 
	 * @param args Command-line arguments
	 */
	public static void main(String[]args) {
		String input = "madam"; // String to be checked
		
		// Check if the input is a palindrome
		boolean isPalindrome = true;
		for(int i = 0; i < input.length() / 2 ; i++) {
			if(input.charAt(i) != input.charAt(input.length() - i - 1)) {
				isPalindrome = false;
				break;
			}
		}
		
		// Print the result
		System.out.println("Input text: " + input);
		System.out.println("Is it a palindrome? : " + isPalindrome);
	}
}
