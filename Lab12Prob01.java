//package lab12;

/* 
 * Name : Phillip Mejia, Alejandro Giron
 * File: Lab12Prob01.java
 * Course : CSCI 1302
 * Description : Recursive Function
 * Last Modified : April 26, 2024
 */

public class Lab12Prob01 {

	public static int recursiveAbstract(int num) {
		// Base Cases
		if (num == 0) {
			return 1;
		} else if (num == 1) {
			return 3;
		} else if (num == 2) {
			return 4;
		} else {
			// Call on recursive function again
			return recursiveAbstract(num - 3) * (recursiveAbstract(num - 2) - recursiveAbstract(num - 1));
		}
	}
}
