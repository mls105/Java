package com.DataStructuresAndAlgorithms.Arrays;

/**
 * Arrays - contiguous memory space
 * 
 * [0,....N]
 */
public class Arrays {
	
	public static void arrayExamples()
	{
		//arrays need to be allocated at initialization
		int intArray[] = new int[4]; 
		
		// get - width of the type, multiply by the offset, puts it at the memory address and retrieves it (not exact but simplest explanation)
		// delete - set to null. can't really delete.
		// insert - overwrites it. doesn't grow the array. 
		
		// all O(1) - constant time. instant operation. we do a constant amount of things no matter what the input is
		// does not grow with input
		
		
		intArray[0]= 10;
		intArray[1]= 100;
		intArray[2]= 1000;
		intArray[3]= 10000;
	}
	


}
