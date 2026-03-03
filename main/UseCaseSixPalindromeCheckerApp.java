package com.seveneleven.palindromecheckerapp.main;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/**
 * =================================================================
 * MAIN CLASS - UseCaseSixPalindromeCheckerApp
 * =================================================================
 * 
 * Use Case 6: Queue + Stack Based Palindrome Checker
 * 
 * Description:
 * This class demonstrates palindrome validation using
 * two different data structures:
 * 
 * - Queue (FIFO - First In First Out)
 * - Stack (LIFO - Last In First Out)
 * 
 * Chracters are inserted into both structures and then
 * compared by removing from the front of the queue and
 * the top of the stack.
 * 
 * If all characters match, the input string is confirmed
 * as a palindrome.
 * 
 * This use case helps understand how FIFO and LIFO
 * behaviours can be combined for symmetric comparision
 * 
 * @author Developer
 * @version 6.0
 */
public class UseCaseSixPalindromeCheckerApp {
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
		
		// Create a queue to store characters in FIFO order
		Queue<Character> queue = new LinkedList<>();
		
		// Create a stack to store characters in LIFO order
		Stack<Character> stack = new Stack<>();
		
		// Insert each character into both queue and stack
		for(char c : input.toCharArray()) {
			stack.push(c);
			queue.offer(c);
		}
		
		// Flag to trach palindrome status
		boolean isPalindrome = true;
		
		// Compare characters until the queue becomes empty
		while(!queue.isEmpty()) {
			if(queue.poll() != stack.pop()) {
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
