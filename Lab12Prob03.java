//package lab12;

/* 
* Name : Phillip Mejia, Alejandro Giron
* File: Lab12Prob03.java
* Course : CSCI 1302
* Description : Recursive Pointer function
* Last Modified : April 26, 2024
*/

public class Lab12Prob03 {
	public static String reverseString(String word) {
		if (word.length() == 1) { // Base Case
			return word;
		} else {
			// Recursive call to the helper function
			return reverseStringHelper(word, word.length() - 1);
		}
	}
	
	public static String reverseStringHelper(String word, int num) {
		if (num == 0) { // Base Case
			return String.valueOf(word.charAt(0));
		} else {
			// Recursive call to the function
			return word.charAt(num) + reverseStringHelper(word, num - 1);
		}
	}
}
