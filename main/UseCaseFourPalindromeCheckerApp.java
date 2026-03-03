package com.seveneleven.palindromecheckerapp.main;

import java.util.Scanner;

/**
 * =================================================================
 * MAIN CLASS - UseCaseFourPalindromeCheckerApp
 * =================================================================
 * 
 * Use Case 4: Character Array Based Validation
 * 
 * Description:
 * THis class validated a palindrome bu converting
 * the string into a character array and comparing
 * characters using the two-pointer technique
 * 
 * At this stage, the application:
 * - Converts string to a char array
 * - Uses start and end pointers
 * - Compares characters efficiently
 * - Displays the result
 * 
 * This reduces extra memory usage.
 * 
 * @author Developer
 * @version 4.0
 */
public class UseCaseFourPalindromeCheckerApp {
	/**
	 * Application entry point for UC4
	 * 
	 * @param args Command line-arguments
	 */
	public static void main(String[]args) {
		// Scanner class for user input
		Scanner scanner = new Scanner(System.in);

		// Take original string as input
		System.out.print("Enter input string: ");
		String input = scanner.nextLine();
		
		
		// Convert the string to a character array.
		char[] chars = input.toCharArray();
		
		// Initialize pointer at the beginning.
		int start = 0;
		
		// Initialize the pointer at the end.
		int end = chars.length - 1;
		
		// Check if the string is a palindrome
		boolean isPalindrome = true;
		while(start < end) {
			if(chars[start] != chars[end]) {
				isPalindrome = false;
				break;
			}
			start++;
			end--;
		}
		
		// Print the results
		System.out.println("Input : " + input);
		System.out.println("Is Palindrome? : " + isPalindrome);
		
		
		// Close the scanner
		scanner.close();
	}
}
