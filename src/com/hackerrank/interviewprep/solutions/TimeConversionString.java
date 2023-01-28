package com.hackerrank.interviewprep.solutions;

/*
 * Given a time in -hour AM/PM format, convert it to military (24-hour) time.

Note: - 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.
- 12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.
 */

public class TimeConversionString {
	
	 public static String timeConversion(String s) {
	
		    
		 //parse through String and look for P or A. Position 8
		 //If 12 A, 24 hour time is 00
		 //If 12 P, it stays the same
		 //Anything after that gets +12
		 
		 String output = "";
		 
		
		 
		 if(s.substring(0,2).equals("12") && s.substring(8,9).equals("A")) {
			 output += "00";
			 output += s.substring(2,8);
		 }
		 if(!s.substring(0,2).equals("12") && s.substring(8,9).equals("A") || s.substring(8,9).equals("P") && s.substring(0,2).equals("12")) {
			 output += s.substring(0,8);
		 }
		 if(s.substring(8,9).equals("P") && !s.substring(0,2).equals("12")) {
			 int afterNoon = Integer.parseInt(s.substring(0, 2));
			 afterNoon += 12;
			 output += afterNoon;
			 output += s.substring(2,8);	 
		 }
		
		
		 
		    return output;
		    
		    
		    }
	 
	 public static void main (String[] args) {
			
			String time = "12:01:00PM";
			String timeTest2 = "12:01:00AM";
			String timeTest3 = "07:45:00PM";
			
			System.out.println("Testing solution. Time 12:01:00Pm should be 12:01:01, Time test 2 should be 00:01:00, , Time test 3 should be 19:45:00");
			
			System.out.println(timeConversion(time));
			System.out.println(timeConversion(timeTest2));
			System.out.println(timeConversion(timeTest3));
			
			
			
		}

}
