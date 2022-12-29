package MinMaxSum;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

/*
 * Given five positive integers, find the minimum and maximum 
 * values that can be calculated by summing exactly four of the 
 * five integers. Then print the respective minimum and maximum 
 * values as a single line of two space-separated long integers.
 */

class Result {

	/*
	 * Complete the 'miniMaxSum' function below.
	 *
	 * The function accepts INTEGER_ARRAY arr as parameter.
	 */

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
}

public class Solution {
	public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

		
		Result.miniMaxSum(arr);

        bufferedReader.close();
	}
}
