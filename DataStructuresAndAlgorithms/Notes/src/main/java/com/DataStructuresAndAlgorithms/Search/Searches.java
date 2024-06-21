package com.DataStructuresAndAlgorithms.Search;

public class Searches {
	
	/*
	 *    a[0,... N]
	 *    
	 */
	public static boolean linearSearch(int intArray[], int value)
	{
		//start at position 0 and walk through until you find the value
		// indexOf() => linear search!
		
		boolean found = false;
		for(int i =0; i< intArray.length; i++)
		{
			if(intArray[i] == value)
			{
				//value found
				found = true;
				break;
			}
		}
		
		// big O - O(N) as input grows so does time. linear growth 
		// growth wrt time
		// constants are dropped
		// measure by worst case - value doesn't exist! loop through the whole array
		return found;

	}
	
	
	/*
	 * 
	 * 
	 * 
	 */
	public static boolean binarySearch(int intArray[], int value)
	{
		boolean found = false;
		
		
		// Is it ordered? (this is helpful, we can make assumptions and jump around in the array)
		// worst case we jump by 10% each time and reach the end without finding it
		// (10 operations of jumping) (10 + .1N) ignore constants O(N)
		// practically this is better but theoretically its still the same as linear search
		
		
		//What if we start in the center and check our value.
		// If its less than we go to the start, greater than we go to the end
		// 1/2N
		// instead of iterating over the entire half lets half it again
		// no scanning!
		// continue halfing
		// array of size N * 1/2 * 1/2 * 1/2 etc (N/2, N/4, N/8, N/16)
		// n/2^k = 1
		// log 2 ^ N 
		// log N
		
		// remember that logarithm is just the inverse of taking the exponent of something
		
		// exponent         2 ^ 3 = 8
		// log base 2 of 8 = 3
		// read it as 2 to the "what power" is 8 ?
		
		// log base 4 of 64 = x
		// same as 4 ^ x = 64 (4 to the what power is 64?)
		
		
		
		
		
		
		
		
		
		
		return found;
	}

}
