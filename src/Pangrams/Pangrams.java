package Pangrams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
 * A pangram is a string that contains every letter of the alphabet. 
 * Given a sentence determine whether it is a pangram in the English alphabet. 
 * Ignore case. Return either pangram or not pangram as appropriate.
 */

public class Pangrams {
	
	/*
     * Complete the 'pangrams' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String pangrams(String s) {
    
    	//Make a list with 26 indeces. 0-25
    	//For each letter in the string, get the character's ascii value
    	//increment by 1 the ascii value - 97 index in the list
    	//Look through list, if any value is zero, return not pangram
    	//If all values are at least one, return pangram
    	
    	List<Integer> alphabet = IntStream.generate(() -> 0).limit(26).boxed().collect(Collectors.toList());
    	
    	for(int i = 0; i < s.length(); i++) {
    		char letter = Character.toLowerCase(s.charAt(i));
    		int ascii = letter;
    		
    		if(ascii >= 97 && ascii <= 122) {
    			int index = ascii - 97;
    			int count = alphabet.get(index);
    			alphabet.set(index, count + 1);
    		}
    		
    	}
    	
    	if(alphabet.contains(0)) {
    		return "not pangram";
    	}
    	
    	return "pangram";

    }
    
    public static void main(String args[]) {

    	String testString = "The quick brown fox jumps over the lazy dog";
    	
		 System.out.println(pangrams(testString));
	 }

}
