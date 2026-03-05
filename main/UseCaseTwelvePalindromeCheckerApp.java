package com.seveneleven.palindromecheckerapp.main;

import java.util.Scanner;

import com.seveneleven.palindromecheckerapp.strategies.DequeStrategy;
import com.seveneleven.palindromecheckerapp.strategies.PalindromeStrategy;
import com.seveneleven.palindromecheckerapp.strategies.StackStrategy;

/**
 * =================================================================
 * MAIN CLASS - UseCaseTwelvePalindromeCheckerApp
 * =================================================================
 * 
 * Use Case 12: Strategy Pattern for Palindrome Algorithms
 * 
 * Description:
 * This class demonstrates how different palindrome
 * validation algorithms can be selected dynamicallly
 * at runtimee using the Strategy Design pattern
 * 
 * At this stage, the application:
 * - Defines a common PalindromeStrategy interface
 * - Implements a concrete stack based strategy
 * - Injects the strategy at runtime
 * - Executes the selected algorithm
 * 
 * No performance comparision is done in this use case.
 * The focus is purely on algorithm interchangeability
 * 
 * The goal is to teach extensible algorithm design
 * 
 * @author Developer
 * @version 12.0
 */
public class UseCaseTwelvePalindromeCheckerApp {
	/**
	 * Application entry point for UC7
	 * 
	 * @param args Command-line arguments
	 */
	public static void main(String[]args) {
		// Scanner class for user input
		Scanner scanner = new Scanner(System.in);
		
		boolean inMenu = true;
		boolean isPalindrome;
		
		PalindromeStrategy strategy;
		
		while(inMenu) {
			System.out.println("====PalindromeChecker====");
			System.out.println("1. Stack Strategy");
			System.out.println("2. Deque Strategy");
			System.out.println("0. Exit");
			
			System.out.print("Enter Choice: ");
			String choice = scanner.nextLine();
			
			inMenu = switch(choice) {
				case "1" -> {
					// Take original string as input
					System.out.print("Enter input string: ");
					String input = scanner.nextLine();
					
					strategy = new StackStrategy();
					isPalindrome = strategy.check(input);
					
					System.out.println("Input : " + input);
					System.out.println("Is Palindrome? : " + isPalindrome);
					yield true;
				}
				case "2" -> {
					// Take original string as input
					System.out.print("Enter input string: ");
					String input = scanner.nextLine();
					
					strategy = new DequeStrategy();
					isPalindrome = strategy.check(input);
					
					System.out.println("Input : " + input);
					System.out.println("Is Palindrome? : " + isPalindrome);
					yield true;
				}
				case "0" -> {
					System.out.println("Thank You!");
					yield false;
				}
				default -> {
					System.out.println("Invalid Choice!!");
					yield true;
				}
			};
			
		}

		// Close the scanner
		scanner.close();
	}
}
