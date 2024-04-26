//package lab12;

/* 
* Name : Phillip Mejia, Alejandro Giron
* File: Lab12Prob02.java
* Course : CSCI 1302
* Description : Recursive Function to reverse a string
* Last Modified : April 26, 2024
*/
public class Lab12Prob02 {

	public static String reverseString(String word) {
		if (word.length() == 1) { // Base Case
			return word;
		} else {
			// Recursive call to the funciton
			return word.substring(word.length() - 1) + reverseString(word.substring(0, word.length() - 1));
		}
	}
}
