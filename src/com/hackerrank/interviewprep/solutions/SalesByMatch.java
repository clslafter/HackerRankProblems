package com.hackerrank.interviewprep.solutions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * There is a large pile of socks that must be paired by color. 
 * Given an array of integers representing the color of each sock, 
 * determine how many pairs of socks with matching colors there are.
 */

public class SalesByMatch {

	/*
	 * Complete the 'sockMerchant' function below.
	 *
	 * The function is expected to return an INTEGER. The function accepts following
	 * parameters: 1. INTEGER n 2. INTEGER_ARRAY ar
	 */

	public static int sockMerchant(int n, List<Integer> ar) {
		// Create a hashmap to keep the count
		// For each number in the array, check if it is equal to an
		//existing key in the hashmap
		//If it does not, add a new key value pair to the hashmap
		//with the key being the number and the value being 1.
		//If it does, increase the value of that key by one.
		// Then, go through the value for each key in the hasmap.
		// Add one to the pair count for each multiple of 2.
		

		int pairs = 0;
		HashMap <Integer, Integer> colors = new HashMap<>(); 

		for (int i = 0; i < ar.size(); i++) {
			//If there's something in the HashMap, already
			if(colors.size() > 0) {
			//Check to see if the color already exists as a key in the HashMap
				if(colors.containsKey(ar.get(i))) {
					//If it does, increase the value by one
					colors.put(ar.get(i), colors.get(ar.get(i)) + 1);
				} else {
					//If it doesn't, add the mapping with the value of 1
					colors.put(ar.get(i), 1);
				}
			} //If there is nothing in the HashMap yet
			else {
				colors.put(ar.get(i), 1);
			}
		}
		
		//For each key/value pair in the hashmap, divide the value by 2.
		//Add that number to the pair count.
		for (Map.Entry<Integer, Integer> color : colors.entrySet()) {
			pairs += (color.getValue()/2);
		}
	
		return pairs;
	}

	public static void main(String[] args) {

		int testN = 9;
		List<Integer> testAr = Arrays.asList(10, 20, 20, 10, 10, 30, 50, 10, 20);

		System.out.println("Testing solution. Should be 3");
		System.out.println(sockMerchant(testN, testAr));

	}
}
