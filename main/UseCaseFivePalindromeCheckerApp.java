package com.seveneleven.palindromecheckerapp.main;

import java.util.Scanner;
import java.util.Stack;

/**
 * =================================================================
 * MAIN CLASS - UseCaseFivePalindromeCheckerApp
 * =================================================================
 * 
 * Use Case 5: Stack Based Palindrome Checker
 * 
 * Description:
 * This class validated a palindrome by using a stack
 * data structure which follows the LIFO Principle
 * 
 * At this stage, the application:
 * - Pushes characters into a stack
 * - Pops them in reverse order
 * - Compares with the original sequence
 * - Displays the result
 * 
 * This maps stack behaviour to reversal logic/
 * 
 * @author Developer
 * @version 5.0
 */
public class UseCaseFivePalindromeCheckerApp {
	/**
	 * Application entry point for UC5
	 * 
	 * @param args Command-line arguments
	 */
	public static void main(String[]args) {
		// Scanner class for user input
		Scanner scanner = new Scanner(System.in);

		// Take original string as input
		System.out.print("Enter input string: ");
		String input = scanner.nextLine();
		
		// Create a stack to store characters
		Stack<Character> stack = new Stack<>();
		
		// Push each character of the string into the stack
		for(char c : input.toCharArray()) {
			stack.push(c);
		}
		
		// Assume plindrome intially.
		boolean isPalindrome = true;
		
		// Iterate again through original string
		for(char c : input.toCharArray()) {
			if(c != stack.pop()) {
				isPalindrome = false;
				break;
			}
		}
		
		// Print the results
		System.out.println("Input : " + input);
		System.out.println("Is Palindrome? : " + isPalindrome);
	}
}
