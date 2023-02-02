package com.hackerrank.interviewprep.solutions;

/*
 * A teacher asks the class to open their books to a page number. 
 * A student can either start turning pages from the front of the 
 * book or from the back of the book. They always turn pages one at a time. 
 * When they open the book, page 1 is always on the right side:
 * 
 * When they flip page 1, they see pages 2 and 3. 
 * Each page except the last page will always be printed on both sides. 
 * The last page may only be printed on the front, given the length of the book. 
 * If the book is n pages long, and a student wants to turn to page p, 
 * what is the minimum number of pages to turn? 
 * They can start at the beginning or the end of the book.

Given n and p, find and print the minimum number of pages that must be turned 
in order to arrive at page p.
 */

public class DrawingBook {
	
	/*
     * Complete the 'pageCount' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER p
     */

    public static int pageCount(int n, int p) {
    // Determine max nuumber of page turns from front to back of book
    // Divide n/2
    	int maxTurns = n/2;
    // Determine number of page turns to p from front
    // Divide p/2
    	int turnsFromFront = p/2;
    // Determine number of page turns from the back of the book
    // (n/2) - (p/2)
    	int turnsFromBack = maxTurns - turnsFromFront;
    // Return the smaller number
    	if(turnsFromBack < turnsFromFront) {
    		return turnsFromBack;
    	}
    	
    	return turnsFromFront;
    }

public static void main (String[] args) {
	
		int testN = 5;
		int testP = 3;
    	
    	
    	System.out.println("Testing solution. Should be 1");
    	
    	System.out.println(pageCount(testN, testP));
    	
    }

}
