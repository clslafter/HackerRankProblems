package Week1Test;

import java.util.Arrays;
import java.util.List;

/*
 * Sean invented a game involving a 2nx2n matrix where each 
 * cell of the matrix contains an integer. He can reverse any 
 * of its rows or columns any number of times. The goal of the game 
 * is to maximize the sum of the elements in the nxn submatrix located in 
 * the upper-left quadrant of the matrix.
Given the initial configurations for q matrices, 
help Sean reverse the rows and columns of each matrix in the best 
possible way so that the sum of the elements in the 
matrix's upper-left quadrant is maximal.
 */

public class FlippingTheMatrix {

	/*
     * Complete the 'flippingMatrix' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY matrix as parameter.
     */
	
	public static int flippingMatrix(List<List<Integer>> matrix) {
		//Not necessary to actually flip the rows or columns.
		// For each position in matrix nxn, find the largest integer in the possible
		//mirrored positions and then sum them up.
		
		// Since the matrix is 2nX2n, the n is found by dividing by 2
		int n = matrix.size()/2;
		int maxSum = 0;
		//i,j<n because we're only dealing with the sum of the numbers in the nXn matrix
		for (int i = 0; i < n ; i++) {
		    for(int j = 0; j < n ; j++) {
		    	//Bottom right mirrored position of the matrix
		            int num4 = matrix.get((matrix.size() - 1 - i)).get(matrix.size() - 1 - j);
		         //Bottom left mirrored position of the matrix   
		            int num3 = matrix.get((matrix.size() - 1 - i)).get(j);
		           //Top right mirrored position of the matrix
		            int num2 = matrix.get((i)).get(matrix.size() - 1 - j);
		           //Top left actual position in the nXn matrix
		            int num1 = matrix.get((i)).get(j);
		          //Add the largest number of the 4 to the Sum for the n positions
		            maxSum += Math.max(num1, Math.max(num2, Math.max(num3, num4)));
		} }
		    return maxSum;
		}
	
	 public static void main(String[] args) {

	       List <List<Integer>> testMatrix = Arrays.asList(Arrays.asList(112,42,83,119),Arrays.asList(56,125,56,49),Arrays.asList(15,78,101,43),Arrays.asList(62,98,114,108));
	      
	        System.out.println("Testing solution. Should be 414");
	        System.out.println(flippingMatrix(testMatrix));

	    }
	
	
}
