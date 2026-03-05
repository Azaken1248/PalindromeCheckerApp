package com.seveneleven.palindromecheckerapp.main;

import java.util.Scanner;

import com.seveneleven.palindromecheckerapp.strategies.DequeStrategy;
import com.seveneleven.palindromecheckerapp.strategies.PalindromeStrategy;
import com.seveneleven.palindromecheckerapp.strategies.StackStrategy;

/**
 * =================================================================
 * MAIN CLASS - UseCaseThirteenPalindromeCheckerApp
 * =================================================================
 * 
 * Use Case 13: Performance Comparision
 * 
 * Description:
 * This class measures abd compares the execution
 * performance of palindrome validation algorithms.
 * 
 * At this stage, the application:
 * - Uses a palindrome strategy implementation
 * - Captures execution start and end time
 * - Calculates total execution duration
 * - Displays benchmarking results
 * 
 * This use case focuses purely on performance
 * measurement and algorithm comparision.
 * 
 * The goal is to introduce benchmarking concepts
 * 
 * @author Developer
 * @version 13.0
 */
public class UseCaseThirteenPalindromeCheckerApp {
	/**
	 * Application entry point for UC13
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
					
					long start = System.nanoTime();
					isPalindrome = strategy.check(input);
					long end = System.nanoTime();
					
					
					
					System.out.println("Input : " + input);
					System.out.println("Is Palindrome? : " + isPalindrome);
					System.out.println("Execution Time: " + (end - start) + "ns");
					yield true;
				}
				case "2" -> {
					// Take original string as input
					System.out.print("Enter input string: ");
					String input = scanner.nextLine();
					
					strategy = new DequeStrategy();
					
					long start = System.nanoTime();
					isPalindrome = strategy.check(input);
					long end = System.nanoTime();
					
					System.out.println("Input : " + input);
					System.out.println("Is Palindrome? : " + isPalindrome);
					System.out.println("Execution Time: " + (end - start) + "ns");
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
