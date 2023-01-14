package MinMaxSum;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * Given five positive integers, find the minimum and maximum 
 * values that can be calculated by summing exactly four of the 
 * five integers. Then print the respective minimum and maximum 
 * values as a single line of two space-separated long integers.
 */

public class MinMaxSum {
	
	
	public static void miniMaxSum(List<Integer> arr) {
		// Write your code here

		int min = (int) Collections.min(arr);
		int max = (int) Collections.max(arr);

		long minSum = 0L;
		long maxSum = 0L;

		// check if all numbers are the same. If they are, add four of the five
		Set<Integer> set = new HashSet<Integer>(arr);

		
		if (set.size() == 1) {
			for (int i = 0; i < arr.size() - 1; i++) {
				minSum += arr.get(i);
				maxSum += arr.get(i);
			}
			
		} else {

			for (Integer num : arr) {
				// Add each integer in the array except the smallest
				if (num != max) {
					minSum += num;
				}
			}
			for (Integer num : arr) {
				// Add each integer in the array except the largest
				if (num != min) {
					maxSum += num;
				}
			}

		}
		System.out.println(minSum + " " + maxSum);
	}
	
	public static void main (String[] args) {
		
		List<Integer> testArray = Arrays.asList(1,2,3,4,5);
		
		System.out.println("Testing solution. Min should be 10, max should be 14.");
		
		miniMaxSum(testArray);
		
		
		
	}

}
