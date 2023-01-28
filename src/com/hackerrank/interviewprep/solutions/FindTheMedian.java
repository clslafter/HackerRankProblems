package com.hackerrank.interviewprep.solutions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * The median of a list of numbers is essentially 
 * its middle element after sorting. The same number of elements 
 * occur after it as before. Given a list of numbers with an odd number of elements, find the median?
 */


public class FindTheMedian {
	 /*
     * Complete the 'findMedian' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */
    public static int findMedian(List<Integer> arr) {
    // sort the List
    //Find the number at the index of list.size/2
    Collections.sort(arr);
    int index = arr.size()/2;
    return arr.get(index);
}
	
	
	
	
	 public static void main(String[] args) {

	       List <Integer> testArr = Arrays.asList(0,1,2,4,6,5,3);
	      
	        System.out.println("Testing solution. Should be 3");
	        System.out.println(findMedian(testArr));

	    }
	

}
