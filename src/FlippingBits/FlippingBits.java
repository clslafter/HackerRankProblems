package FlippingBits;

import java.util.Arrays;
import java.util.List;

/*
 * You will be given a list of 32 bit unsigned integers. 
 * Flip all the bits ( and ) and return the result as an unsigned integer.
 */

public class FlippingBits {
	
	 /*
     * Complete the 'flippingBits' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts LONG_INTEGER n as parameter.
     */

    public static long flippingBits(long n) {
    // convert the long into a binary number
    //add the padding
    //flip the ones to zeros and the zeros to ones
    //convert the binary into a long
    	
    String originalBinary = Long.toBinaryString(n);
   
    
    String paddedBinary = String.format("%32s", originalBinary).replaceAll(" ", "0");
   
    String flippedBinary = "";
    
    for(int i = 0; i<paddedBinary.length(); i++) {
    	if(paddedBinary.charAt(i) == '1') {
    		
    		flippedBinary += "0";
    	} 
    	else {
    		
    		flippedBinary += "1";
    	}
    }
    
    
    long flippedNum = Long.parseLong(flippedBinary, 2);
    	
    return flippedNum;

    }
    
public static void main (String[] args) {
		
		long testNum = 1L;
		
		System.out.println("Testing solution. Should be 4294967294");
		
		System.out.println(flippingBits(testNum));
		
		
		
	}

}
