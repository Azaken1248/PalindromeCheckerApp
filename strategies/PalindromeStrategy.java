package com.seveneleven.palindromecheckerapp.strategies;

/**
 * =================================================================
 * INTERFACE - PalindromeStrategy
 * =================================================================
 * 
 * This interface defines a contract for all
 * palindrome checking algorithms.
 * 
 * Any new algorithm must implement this interface
 * and provide its own validation logic.
 */
public interface PalindromeStrategy {
	
	/**
	 * Check if a string is a palindrom
	 * 
	 * @param input	The input to be checked
	 * @return	True if palindrome, false otherwise
	 */
	public boolean check(String input);
}

