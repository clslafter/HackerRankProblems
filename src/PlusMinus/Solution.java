package PlusMinus;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
    // Write your code here
    //Loop through the array.
    //For each value that is positive, divide the number of elements
    //by the total size of the array.
    //Same for negative and zero.
    //Use printF for decimal places precision
        int numPositive = 0;
        int numNegative = 0;
        int numZero = 0;
    for (Integer integer : arr) {
       
        if (integer > 0) {
            numPositive++;
        }
        if (integer < 0) {
            numNegative++;
        }
        if (integer == 0) {
            numZero++;
        }
    }
    double ratioPositive = (double) numPositive / (double) arr.size();
    System.out.printf("%.6f%n", ratioPositive);
    double ratioNegative = (double) numNegative / (double) arr.size();
    System.out.printf("%.6f%n", ratioNegative);
    double ratioZero = (double) numZero / (double) arr.size();
   System.out.printf("%.6f", ratioZero);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
