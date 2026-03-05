package com.seveneleven.palindromecheckerapp.services;

/**
 * Service class containing palindrome logic.
 */
public class PalindromeService {
	
	/**
	 * Checks weather the input string is a palindrome.
	 * 
	 * @param input	Input String
	 * @return true if palindrome, false otherwise
	 */
	public boolean checkPalindrome(String input) {
		
		//Initialize pointers
		int start = 0;
		int end = input.length() - 1;
		
		char chars[] = input.toCharArray();
		
		// Compare characters moving inward
		while(start < end) {
			if(chars[start] != chars[end]) return false;
			start++;
			end--;
		}
		
		return true;
	}
}
