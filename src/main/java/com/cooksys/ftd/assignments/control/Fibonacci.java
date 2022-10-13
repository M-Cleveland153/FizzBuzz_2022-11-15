package com.cooksys.ftd.assignments.control;

import java.io.InterruptedIOException;
import java.util.Arrays;

import com.cooksys.ftd.assignments.control.util.MissingImplementationException;

/**
 * The Fibonacci sequence is simply and recursively defined: the first two elements are `1`, and
 * every other element is equal to the sum of its two preceding elements. For example:
 * <p>
 * [1, 1] =>
 * [1, 1, 1 + 1]  => [1, 1, 2] =>
 * [1, 1, 2, 1 + 2] => [1, 1, 2, 3] =>
 * [1, 1, 2, 3, 2 + 3] => [1, 1, 2, 3, 5] =>
 * ...etc
 */
public class Fibonacci {

    /**
     * Calculates the value in the Fibonacci sequence at a given index. For example,
     * `atIndex(0)` and `atIndex(1)` should return `1`, because the first two elements of the
     * sequence are both `1`.
     *
     * @param i the index of the element to calculate
     * @return the calculated element
     * @throws IllegalArgumentException if the given index is less than zero
     */
	public static int atIndex(int i) throws IllegalArgumentException {
		if (i < 0) {
			System.out.println("Index value must be non-negative.");
    		throw new IllegalArgumentException();
    		
		} else if (i == 0 || i == 1) {
			return 1;
		} else {
			int[] fibArray = new int[i + 1];
			fibArray[0] = 1;
			fibArray[1] = 1;

			for (int j = 2; j < fibArray.length; j++) {
				fibArray[j] = fibArray[j - 2] + fibArray[j - 1];
			}

			return fibArray[i];

		}

	}

    /**
     * Calculates a slice of the fibonacci sequence, starting from a given start index (inclusive) and
     * ending at a given end index (exclusive).
     *
     * @param start the starting index of the slice (inclusive)
     * @param end   the ending index of the slice(exclusive)
     * @return the calculated slice as an array of int elements
     * @throws IllegalArgumentException if either the given start or end is negative, or if the
     *                                  given end is less than the given start
     */
    public static int[] slice(int start, int end) throws IllegalArgumentException {

        if(start>end || start < 0 || end < 0) {
        	System.out.println("indices error");
        	throw new IllegalArgumentException(); 

        } 
        
        if (end<3) {
        	int[] fibArray = {1,1};
        	System.out.println(Arrays.toString(fibArray));
    		return Arrays.copyOfRange(fibArray, start, end);
			
		} else {
			int[] fibArray = new int[end];
    		fibArray[0] = 1;
    		fibArray[1] = 1;
    		
    		for(int j = 2; j < fibArray.length; j++) {
            	fibArray[j] = fibArray[j-2] + fibArray[j-1]; 
            	System.out.println("value at index " + j + ":" + fibArray[j]);
            }        
        	System.out.println(Arrays.toString(fibArray));
    		return Arrays.copyOfRange(fibArray, start, end);
		}	
    }

    /**
     * Calculates the beginning of the fibonacci sequence, up to a given count.
     *
     * @param count the number of elements to calculate
     * @return the beginning of the fibonacci sequence, up to the given count, as an array of int elements
     * @throws IllegalArgumentException if the given count is negative
     */
    public static int[] fibonacci(int count) throws IllegalArgumentException {

    	if(count < 0) {
        	System.out.println("Count value must be greater than zero.");
        	throw new IllegalArgumentException();
        } else if (count == 0) {
        	return new int[0];
        }
        
        int[] fibArray = new int[count];
        if(count == 1) {
        	fibArray[0] = 1;
        	
        }else if(count==2) {
        	fibArray[0] = 1;
        	fibArray[1] = 1;
        }else {
        	fibArray[0] = 1;
        	fibArray[1] = 1;
        	for(int j = 2; j < fibArray.length; j++) {
            	fibArray[j] = fibArray[j-2] + fibArray[j-1]; 
            	System.out.println("value at index " + j + ":" + fibArray[j]);
            }        
        }
        System.out.println(Arrays.toString(fibArray));
    	return fibArray;
    }
}
