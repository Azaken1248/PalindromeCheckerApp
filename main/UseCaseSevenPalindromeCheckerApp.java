package com.seveneleven.palindromecheckerapp.main;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * =================================================================
 * MAIN CLASS - UseCaseSevenPalindromeCheckerApp
 * =================================================================
 * 
 * Use Case 7: Deque Based Optimized Palindrome Checker
 * 
 * Description:
 * This class validated a palindrome by using a deque
 * (Double Ended Queue)
 * 
 * Characters are inserted into the deque and then
 * compared by removing elements from both ends:
 * 
 * - removeFirst()
 * - removeLast()
 * 
 * This avoids reversing the string and provides an
 * efficient front-to-back camparision approach.
 * 
 * This use case demonstrates optimal biderectional
 * traversal using Deque.
 * 
 * @author Developer
 * @version 7.0
 */
public class UseCaseSevenPalindromeCheckerApp {

	/**
	 * Application entry point for UC6
	 * 
	 * @param args Command-line arguments
	 */
	public static void main(String[]args) {
		// Scanner class for user input
		Scanner scanner = new Scanner(System.in);

		// Take original string as input
		System.out.print("Enter input string: ");
		String input = scanner.nextLine();

		// Create a Deque to store characters
		Deque<Character> deque = new ArrayDeque<>();

		// Add each character to the deque
		deque.addAll(input.chars()
				.mapToObj(c -> (char) c)
				.collect(Collectors.toList()));

		// Flag to track palindrome result
		boolean isPalindrome = true;

		// Continue comparision while ore than one element exists
		while(deque.size() > 1) {
			if(deque.removeFirst() != deque.removeLast()) {
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
