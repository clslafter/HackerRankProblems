package com.hackerrank.interviewprep.solutions;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/*
 * Given a square matrix, calculate the absolute 
 * difference between the sums of its diagonals.
 */

public class DiagonalDifference {
	
	 /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
    // Add the 0 position of the 0 array to the 1 position of the 1 array, etc...
    // Add the last position of the 0 array to the 2nd to last position of the 1 array, etc...
    // Subtract the second integer from the first
    // Return absolute value using either ternary or Math.abs(2)
    	
    	int num1 = 0;
    	int num2 = 0;
    	
    	for(int i = 0; i<arr.size(); i++) {
    		num1 += arr.get(i).get(i);
    		num2 += arr.get(i).get(arr.get(i).size()-1-i);
    	}

    	int result = Math.abs(num1 - num2);
    	
    	return result;

    }

    public static void main(String[] args) {
    	
    	List<List<Integer>> testArray2d = Arrays.asList(Arrays.asList(1,2,3),Arrays.asList(4,5,6),Arrays.asList(9,8,9));
    	
    	System.out.println("Testing 2d Array.asList");
    	
    	Iterator<List<Integer>> itr=testArray2d.iterator();
	      while(itr.hasNext())
	        {
	          Object arr = itr.next();
	          System.out.println(arr);
	          
	        }
	      
	      System.out.println("Testing solution. Should be 2.");
    	
	      System.out.println(diagonalDifference(testArray2d));
	      
    }

}
