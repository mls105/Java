package com.DataStructuresAndAlgorithms.BigO;

//** Big O Examples */
public class BigO {
	
	/**
	 * 1 - growth is with respect to input
	 * 2 - constants are dropped
	 * 3 - worse case is usually what we measure
	 * 
	 * Big O         - upper bound
	 * little omega  - lower bound
	 * Big theta     - average case
	 * Big Omega     - best case
	 * 
	 * 
	 */
	
	public int sum(int length)
	{
		// big O is a generalization of time/space
		// Look for loops. where do you loop over the input 
		
		/******* Example 1 *********/
		// O(N) linear!
		int sum =0;
		for(int i = 0; i < length; i++) //1 loop!
		{
			sum = sum + i;
		}
		
		return sum;
	}
	
	public int Doublesum(int length)
	{
		/******* Example 2 *********/
		// O(N) linear!
		int sum =0;
		for(int i = 0; i < length; i++) //1 loop
		{
			sum = sum + i;
		}
		
		for(int i = 0; i < length; i++)// hey another loop!
		{
			sum = sum + i;
		}
		
		// O(2N) right? 
		// nope! drop constants
		// we don't care about constants because numbers grow disproportionality large that it's insignificant
		
		// theoretical vs practical
		// O(100N) is faster than O(N^2) but practically for smaller inputs it wouldn't
		
		return sum;
	}
	
	public int stringSum(String someString)
	{
		int sum =0;
		for(int i = 0; i < someString.length(); i++) 
		{
			char c = someString.charAt(i);
			if(c == 'E')
			{
				return sum; 
			}
		}
		
		// this is still O(N)
		// we consider worse case
		return sum;
	}
	
	public int stringSumDoubleLoop(String someString)
	{
		int sum = 0;
		
		//for every single character
		for(int i = 0; i < someString.length(); i++)
		{
			//go over every single character
			for(int j = 0; j < someString.length(); j++) 
			{
				char c = someString.charAt(j);
				sum += c;
			}
		}
		
		//O(N^2)
		
		return sum;
	}
	
	public int stringSumTripleLoop(String someString)
	{
		int sum = 0;
		
		//for every single character
		for(int i = 0; i < someString.length(); i++)
		{
			//go over every single character
			for(int j = 0; j < someString.length(); j++) 
			{
				for(int k = 0; k < someString.length(); k++) 
				{
					//and again think of a matrice
					char c = someString.charAt(k);
					sum += c;
				}
			}
		}
		
		//O(N^3)
		return sum;
	}
	
	
	// O(N log N)   => Quick Sort              Half the amount of space for each search
	// O(log N)     => Binary Search Tree
	


}
