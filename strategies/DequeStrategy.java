package com.seveneleven.palindromecheckerapp.strategies;

import java.util.Deque;
import java.util.stream.Collectors;
import java.util.ArrayDeque;

/**
 * =================================================================
 * CLASS - DequeStrategy
 * =================================================================
 * 
 * This class provides a Deque based implementation
 * of the PalindromeStrategy interface.
 * 
 * It uses double ended behaviour to compare characters
 */
public class DequeStrategy implements PalindromeStrategy {
	
	/**
	 * Implements palindrome validation using Deque.
	 * 
	 * @param input	String to validate
	 * @return true if palindrome, false otherwise
	 */
	public boolean check(String input) {
		// Create a deque to store characters
		Deque<Character> deque = new ArrayDeque<>();
		
		// Push each character of the string into the deque
		deque.addAll(input.chars()
						  .mapToObj(c -> (char) c)
						  .collect(Collectors.toList()));
		
		// Iterate again through deque
		while(deque.size() > 1) {
			if(deque.removeFirst() != deque.removeLast()) return false;
		}
		
		return true;
	}
}
