package com.hackerrank.interviewprep.solutions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * You will be given a list of integers, arr, and a single integer k. 
 * You must create an array of length k from elements of arr such that its
 *  unfairness is minimized. Call that array arr'. 
 *  Unfairness of an array is calculated as max(arr') - min(arr')

Where:
- max denotes the largest integer in arr'
- min denotes the smallest integer in arr'
 */

public class MaxMin {
	
	 /*
     * Complete the 'maxMin' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER k
     *  2. INTEGER_ARRAY arr
     */

    public static int maxMin(int k, List<Integer> arr) {
    // Write your code here
    	
    	//sort array
    	//find the k adjacent elements where the difference between the smallest and largest is the minimum
    	//if arr.size >= k, take arr(i + k - 1) - arr(i)
    	//save that as minUnfainess.
    	
    	Collections.sort(arr);
    	int unfairness = 0;
    	int minUnfairness = arr.get(k -1) - arr.get(0);
    	
    	if (k <= arr.size()) {
			for (int i = 0; i < arr.size() - k + 1; i++) {
					unfairness = arr.get(i + k - 1) - arr.get(i);
					if (unfairness < minUnfairness) {
						minUnfairness = unfairness;
					}
			} 
		}
		return minUnfairness;

    }
	
	
	
	public static void main(String[] args) {

		int testK = 4;
		
		List<Integer> testArr = Arrays.asList(1,2,3,4,10,20,30,40,100,200);

		System.out.println("Testing solution. Should be 3");

		System.out.println(maxMin(testK, testArr));

	}

}

