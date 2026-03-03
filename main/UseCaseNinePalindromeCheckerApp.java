package com.seveneleven.palindromecheckerapp.main;

import java.util.Scanner;

/**
 * =================================================================
 * MAIN CLASS - UseCaseNinePalindromeCheckerApp
 * =================================================================
 * 
 * Use Case 9: Recursive Palindrome Checker
 * 
 * Description:
 * This class validated a palindrome using recursion
 * 
 * Characters are compared from the outer positions
 * moving inward using recursive calls.
 * 
 * The recursion stops when:
 * - All characters are matched, or
 * - A mismatch is found
 * 
 * This use case demonstrates divide-and-conquer
 * logic using method recursion.
 * 
 * @author Developer
 * @version 9.0
 */
public class UseCaseNinePalindromeCheckerApp {

	/**
	 * Application entry point for UC9
	 * 
	 * @param args Command-line arguments
	 */
	public static void main(String[]args) {
		// Scanner class for user input
		Scanner scanner = new Scanner(System.in);

		// Take original string as input
		System.out.print("Enter input string: ");
		String input = scanner.nextLine();

		// Print the results
		System.out.println("Input : " + input);
		System.out.println("Is Palindrome? : " + check(input, 0, input.length() - 1));
		
		// Close the scanner
		scanner.close();
	}

	/**
	 * Recursively checks weather a string is a palindrome
	 * 
	 * @param s		Input string
	 * @param start	Starting index
	 * @param end	Ending index
	 * @return true if palindrome, otherwise false
	 */
	private static boolean check(String s, int start, int end) {
		
		// All characters matched
		if(end <= start) return true;
		
		// Mismatch found
		if(s.charAt(start) != s.charAt(end)) return false;
		
		// Else recurse further
		return check(s, start + 1, end - 1);
	}
}
