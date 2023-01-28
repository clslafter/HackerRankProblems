package com.hackerrank.interviewprep.solutions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * There is a large pile of socks that must be paired by color. 
 * Given an array of integers representing the color of each sock, 
 * determine how many pairs of socks with matching colors there are.
 */

public class SalesByMatch2 {
	
	public static int sockMerchant(int n, List<Integer> ar) {
		//Sort the collection
		//If the color is the same as the one next to it
		//add to the pairs count and skip the one after the one next to it
		//if not, check the one next to it
		Collections.sort(ar);
		
		int pairs = 0;
		for(int i = 0; i < ar.size()-1;) {
			if(ar.get(i) == ar.get(i+1)) {
				pairs++;
				i += 2;
			} else {
				i++;
			}
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
