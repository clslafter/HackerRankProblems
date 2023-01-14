package LonelyInteger;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * Given an array of integers, where all elements but one occur twice, find the unique element.
 */

public class LonelyInteger {
	
    public static int lonelyinteger(List<Integer> a) {
    // Write your code here
    Map<Integer, Integer> search = new HashMap<>();
    
    for (int i = 0; i < a.size() ; i++  ){
        
        if(search.containsKey(a.get(i))) {
            int value = search.get(a.get(i));
            value++;
            search.replace(a.get(i), value);
           
        }
       else 
        search.put(a.get(i), 1);
       
    }
    

    for(Map.Entry<Integer, Integer> entry: search.entrySet()){
        if(entry.getValue() == 1) {
            return entry.getKey();
        }
        
    } 

    return 0;

    }

    
public static void main (String[] args) {
		
		List<Integer> testArray = Arrays.asList(1,1,2,3,2);
		
		System.out.println("Testing solution. Should be 3");
		
		System.out.println(lonelyinteger(testArray));
		
		
		
	}
}
