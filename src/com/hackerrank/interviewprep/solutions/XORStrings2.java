package com.hackerrank.interviewprep.solutions;


/*
 * In this challenge, the task is to debug the existing code 
 * to successfully execute all provided test files.
 * 
 * Given two strings consisting of digits 0 and 1 only, find the XOR of the two strings.
 * 
 * 
 * Debug the given function strings_xor to find the 
 * XOR of the two given strings appropriately.

Note: You can modify at most three lines in the given code 
and you cannot add or remove lines to the code.
 */

public class XORStrings2 {

	 public static String stringsXOR(String s, String t) {
	        String res = new String("");
	        for(int i = 0; i < s.length(); i++) {
	      //Original was if(s.charAt(i) = t.charAt(i))
	            if(s.charAt(i) == t.charAt(i))
	      //Original was res = "0";
	                res += "0";
	            else
	      //Original was res = "1";
	                res += "1";
	        }

	        return res;
	    }
	 
	 public static void main(String[] args) {

	        String testS = "10101";
	        String testT = "00101";
	      
	        System.out.println("Testing solution. Should be 10000");
	        System.out.println(stringsXOR(testS, testT));

	    }
	
}
