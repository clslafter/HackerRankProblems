package com.hackerrank.interviewprep.solutions;
public class AddBinary {
	
	/*
	 * work from back to front
	 * 
	 * 
	 * 0 and a 0 = 0
	 * 0 and a 1 = 1
	 * 1 and a 1 = 0 with a carry
	 * 1 and a 1 with a carry = 1 with a carry
	 * 
	 * work backwards
	 * check each as an if but no else
	 * 
	 */
	 public static String addBinary(String a, String b) {
		
		 // we'll need length first.
		 int i = a.length()-1;
		 int j = b.length()-1;
		 int carry = 0;
		 String returnString = "";
		 while (i >= 0 || j >= 0) {
			 int sum = carry;
			 
			 if (i >= 0) {
				 	sum += a.charAt(i--) - '0';
			 }
			 if (j >= 0) {
				 	sum += b.charAt(j--) - '0';
			 }
			 returnString += (sum % 2);
			 carry = sum / 2;

		 }
		 if (carry > 0) {
			 // add another 1
			 returnString += "1";
		 }
		 StringBuilder sbReturn = new StringBuilder(returnString).reverse();
		 return sbReturn.toString();
		 
	    }
	 public static void main(String args[]) {
		 
		 System.out.println("Testing solution. Should be 101110");

		 System.out.println(addBinary("10001", "11101"));
	 }
}