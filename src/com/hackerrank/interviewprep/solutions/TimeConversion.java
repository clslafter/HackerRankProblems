package com.hackerrank.interviewprep.solutions;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/*
 * Given a time in -hour AM/PM format, convert it to military (24-hour) time.

Note: - 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.
- 12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.
 */

public class TimeConversion {
	
	 public static String timeConversion(String s) {
	
		    DateTimeFormatter inputTimeFormat = DateTimeFormatter.ofPattern("hh:mm:ssa");
		    LocalTime time = LocalTime.parse(s, inputTimeFormat);
		    DateTimeFormatter outputTimeFormat = DateTimeFormatter.ofPattern("HH:mm:ss");
		    String output = time.format(outputTimeFormat);
		    return output;
		    
		    
		    }
	 
	 public static void main (String[] args) {
			
		 String time = "12:01:00PM";
			String timeTest2 = "12:01:00AM";
			
			System.out.println("Testing solution. Time 12:01:00Pm should be 12:01:01, Time test 2 should be 00:01:00");
			
			System.out.println(timeConversion(time));
			System.out.println(timeConversion(timeTest2));
			
			
		}

}
