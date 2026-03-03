package com.seveneleven.palindromecheckerapp.main;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * =================================================================
 * MAIN CLASS - UseCaseEightPalindromeCheckerApp
 * =================================================================
 * 
 * Use Case 8: Linked List Based Palindrome Checker
 * 
 * Description:
 * This class checks weather the string is a palindrome
 * using a LinkedList
 * 
 * 
 * Characters are added to the list and then compared 
 * by removing elements from both ends:
 * 
 * - removeFirst()
 * - removeLast()
 * 
 * This demonstrates how LinkedList supports
 * double-ended operations for symmetric validation
 * 
 * 
 * @author Developer
 * @version 8.0
 */
public class UseCaseEightPalindromeCheckerApp {
	/**
	 * Application entry point for UC8
	 * 
	 * @param args Command-line arguments
	 */
	public static void main(String[]args) {
		// Scanner class for user input
		Scanner scanner = new Scanner(System.in);

		// Take original string as input
		System.out.print("Enter input string: ");
		String input = scanner.nextLine();

		// Create a LinkedList to store characters
		LinkedList<Character> list = new LinkedList<>();
		
		// Compare until only one or zero elements remain
		list.addAll(0, input.chars()
				.mapToObj(c -> (char) c)
				.collect(Collectors.toList()));
		
		// Flag to track palindrome
		boolean isPalindrome = true;
		
		// Compare until onlu one or zero elements remain
		while(list.size() > 1) {
			if(list.removeFirst() != list.removeLast()) {
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
