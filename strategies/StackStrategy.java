package com.seveneleven.palindromecheckerapp.strategies;

import java.util.Stack;

/**
 * =================================================================
 * CLASS - StackStrategy
 * =================================================================
 * 
 * This class provides a Stack based implementation
 * of the PalindromeStrategy interface.
 * 
 * It uses LIFO behaviour to reverse characters
 * and compare them with original sequence.
 */
public class StackStrategy implements PalindromeStrategy {
	
	/**
	 * Implements palindrome validation using Stack.
	 * 
	 * @param input	String to validate
	 * @return true if palindrome, false otherwise
	 */
	public boolean check(String input) {
		// Create a stack to store characters
		Stack<Character> stack = new Stack<>();
		
		// Push each character of the string into the stack
		for(char c : input.toCharArray()) {
			stack.push(c);
		}
		
		// Iterate again through original string
		for(char c : input.toCharArray()) {
			if(c != stack.pop()) return false;
		}
		
		return true;
	}
}
