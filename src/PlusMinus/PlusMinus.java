package PlusMinus;

import java.util.Arrays;
import java.util.List;


/*
 * Given an array of integers, calculate the ratios 
 * of its elements that are positive, negative, and zero. 
 * Print the decimal value of each fraction on a new line with  
 * 6 places after the decimal.
 */

public class PlusMinus {
	
	 public static void plusMinus(List<Integer> arr) {
		    // Write your code here
		    //Loop through the array.
		    //For each value that is positive, divide the number of elements
		    //by the total size of the array.
		    //Same for negative and zero.
		    //Use printF for decimal places precision
		        int numPositive = 0;
		        int numNegative = 0;
		        int numZero = 0;
		    for (Integer integer : arr) {
		       
		        if (integer > 0) {
		            numPositive++;
		        }
		        if (integer < 0) {
		            numNegative++;
		        }
		        if (integer == 0) {
		            numZero++;
		        }
		    }
		    double ratioPositive = (double) numPositive / (double) arr.size();
		    System.out.printf("%.6f%n", ratioPositive);
		    double ratioNegative = (double) numNegative / (double) arr.size();
		    System.out.printf("%.6f%n", ratioNegative);
		    double ratioZero = (double) numZero / (double) arr.size();
		   System.out.printf("%.6f", ratioZero);
		    }
	 
	 public static void main (String[] args) {
			
			List<Integer> testArray = Arrays.asList(-1,1,0);
			
			System.out.println("Testing solution. 0.333333 on a new line three times");
			
			plusMinus(testArray);
			
			
			
		}

}
