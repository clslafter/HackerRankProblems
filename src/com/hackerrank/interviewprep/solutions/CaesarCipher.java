package com.hackerrank.interviewprep.solutions;

/*
 * Julius Caesar protected his confidential information by encrypting it using a cipher. 
 * Caesar's cipher shifts each letter by a number of letters. 
 * If the shift takes you past the end of the alphabet, 
 * just rotate back to the front of the alphabet. 
 * In the case of a rotation by 3, w, x, y and z would map to z, a, b and c.
 */

public class CaesarCipher {
	/*
	 * Complete the 'caesarCipher' function below.
	 *
	 * The function is expected to return a STRING. The function accepts following
	 * parameters: 1. STRING s 2. INTEGER k
	 */

	public static String caesarCipher(String s, int k) {
		// For each character, if the ASCII value is within either the capital or
		// lowercase
		// ASCII values, add k.
		// A = 65, Z = 90, a = 97, z = 122.
		// % 26 allows the value to start again at the beginning of the alphabet

		// Start an empty string
		String result = "";

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			if (c >= 'A' && c <= 'Z') {
				c = (char) ('A' + ((c - 'A' + k) % 26));
			}
			if (c >= 'a' && c <= 'z') {
				c = (char) ('a' + ((c - 'a' + k) % 26));
			}
			result += c;
		}

		return result;
	}


	

	public static void main(String[] args) {

		String testS = "There's-a-starman-waiting-in-the-sky";
		int testK = 3;

		System.out.println("Testing solution. Should be Wkhuh'v-d-vwdupdq-zdlwlqj-lq-wkh-vnb");

		System.out.println(caesarCipher(testS, testK));

	}

}
