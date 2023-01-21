package PermutingTwoArrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


/*
 * There are two n-element arrays of integers,A and B. 
 * Permute them into some A' and B' such that the relation 
 * A'i + B'i >= k holds for all i where 0 <= i <= n.

There will be q queries consisting of A, B, and k. 
For each query, return YES if some permutation A',B' satisfying the relation exists. 
Otherwise, return NO.
 */

public class PermutingTwoArrays {
	
	public static String twoArrays(int k, List<Integer> A, List<Integer> B) {
	    // reorder A from smallest to largest integers
		//reorder B from largest to smallest integers
		//test each index number to see if it satisfies A'i + B'i >= k
		//for the first one that does not, return NO
		//return YES if all tests pass
		
		Collections.sort(A);
		
		Collections.sort(B, Collections.reverseOrder());
		
		for(int i = 0; i < A.size(); i++) {
			if (A.get(i) + B.get(i) < k) {
				return "NO";
			}
		}
		
		
		return "YES";

	    }
	
	public static void main(String args[]) {

    	int testK1 = 10;
    	List<Integer> testA1 = Arrays.asList(2,1,3);
    	List<Integer> testB1 = Arrays.asList(7,8,9);
    	
    	
    	int testK2 = 5;
    	List<Integer> testA2 = Arrays.asList(1,2,2,1);
    	List<Integer> testB2 = Arrays.asList(3,3,3,4);
    	
    	
    	System.out.println("Testing solution. Should be YES");
		 System.out.println(twoArrays(testK1, testA1, testB1));
		 System.out.println("Testing solution. Should be NO");
		 System.out.println(twoArrays(testK2, testA2, testB2));
	 }
	

}
