package com.hackerrank.interviewprep.solutions;

/*
 * Two players are playing a game of Tower Breakers! 
 * Player 1 always moves first, and both players always play optimally.
 * The rules of the game are as follows:
 * 
 * Initially there are n towers.
 * Each tower is of height m.
 * The players move in alternating turns.
 * 
 * In each turn, a player can choose a tower of height x and reduce its height to y, 
 * where 1 <= y < x and  y evenly divides x.
 * If the current player is unable to make a move, they lose the game.
 * 
 * Given the values of n and m, determine which player will win. 
 * If the first player wins, return 1. Otherwise, return 2.
 */

public class TowerBreakers {
	
	 /*
     * Complete the 'towerBreakers' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER m
     */

    public static int towerBreakers(int n, int m) {
   // Resulting tower height is Y
   // Starting tower height is X
   // One divides into anything evenly
   // ***how to define optimally?*** Is it that they will reduce the height to
   // the point they can win or to remove the most amount of blocks at each turn?
    	
   // For this purpose, I will assume optimally means removing the most amount of
   // blocks at each turn.
   // In that case, if there are an odd number of towers, player one will win
   // If there are an even number of towers, player 2 will win.
   // If the tower height is 1, player 2 will win.
    
		return n % 2 == 0 || m == 1 ? 2 : 1;
		
    }
    
    public static void main (String[] args) {
    	
		int testN = 2;
		int testM = 6;
    	
    	
    	System.out.println("Testing solution. Should be 2");
    	
    	System.out.println(towerBreakers(testN, testM));
    	
    }

}
