package com.hackerrank.interviewprep.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/*
 * Complete the 'matchingStrings' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts following parameters:
 *  1. STRING_ARRAY strings
 *  2. STRING_ARRAY queries
 */


public class SparseArrays {
	
	   public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
		   
		// Loop through the query string. For each index, loop through the input string.
		//Increase sum for every match.
		//inside outer loop and outside inner loop, add sum to result array.
		List<Integer> result = new ArrayList<>();
		for (String query : queries) {
		    int matchedSum = 0;
		    for (String string : strings) {
		        if(string.equals(query)) {
		            matchedSum++;
		        }
		    }
		    result.add(matchedSum);
		}
		return result;
		    }
	   
	   public static void main (String[] args) {
			
			List<String> testStrings = Arrays.asList("aba", "baba", "aba", "xzxb");
			
			List<String> testQueries = Arrays.asList("aba", "xzxb", "ab");
			
			System.out.println("Testing solution. Should be 2, 1, and 0.");
			
			System.out.println(matchingStrings(testStrings, testQueries));
			
			
			
		}

}
