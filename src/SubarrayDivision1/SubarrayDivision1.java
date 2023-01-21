package SubarrayDivision1;

import java.util.Arrays;
import java.util.List;

/*
 * Two children, Lily and Ron, want to share a chocolate bar. 
 * Each of the squares has an integer on it.

Lily decides to share a contiguous segment of the bar selected such that:

The length of the segment matches Ron's birth month, and,
The sum of the integers on the squares is equal to his birth day.
Determine how many ways she can divide the chocolate.
 */


public class SubarrayDivision1 {
	
	 /*
     * Complete the 'birthday' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY s
     *  2. INTEGER d
     *  3. INTEGER m
     */

    public static int birthday(List<Integer> s, int d, int m) {
    // Check list at index 0 for each index until index = m - 1
    // Add each element. Check to see if the sum = d.
    //If the sum = d, add to a counter
    	int count = 0;
    	for(int i = 0; i <= s.size() - m; i++) {
    		
    		int sum = 0;
    		for(int j = i; j < (i + m); j++) {
    			sum += s.get(j);
    		}
     		if(sum == d) {
     			count++;
     		}	
    	}
    	
    	return count;
    }
	
    public static void main(String args[]) {

    	List<Integer> testS = Arrays.asList(2,2,1,3,2);
    	int testD = 4;
    	int testM = 2;
    	
    	
    	System.out.println("Testing solution. Should be 2");
		 System.out.println(birthday(testS, testD, testM));
		 
	 }

}
