package com.seveneleven.palindromecheckerapp.main;

import java.util.Scanner;

/**
 * =================================================================
 * MAIN CLASS - UseCaseThreePalindromeCheckerApp
 * =================================================================
 * 
 * Use Case 3: Reverse String Based Palindrome Check
 * 
 * Description:
 * This class checks weather a string is a palindrome
 * by reversing the string and comparing it with
 * the original value.
 * 
 * At this stage, the application:
 * - Iterates the string in reverse order
 * - Builds a reversed version
 * - Compared original and reversed strings
 * - Displays the validation result
 * 
 * This introduces transformation-based validation
 * 
 * @author Developer
 * @version 3.0
 */
public class UseCaseThreePalindromeCheckerApp {
	
	/**
	 * Application entry point for UC3.
	 * 
	 * @param args Command-line arguments
	 */
	public static void main(String[]args) {
		// Scanner class for user input
		Scanner scanner = new Scanner(System.in);
		
		// Take original string as input
		System.out.print("Enter input string: ");
		String input = scanner.nextLine();
		
		// Create a reversed version of the input
		String reversed = "";
		for(int i = input.length() - 1; i >= 0; i--) {
			reversed += input.charAt(i);
		}
		
		//Print the results
		System.out.println("Original: " + input);
		System.out.println("Reversed: " + reversed);
		System.out.println("Is Palindrome? : " + input.equals(reversed));
		
		// Close the scanner
		scanner.close();
	}
}
