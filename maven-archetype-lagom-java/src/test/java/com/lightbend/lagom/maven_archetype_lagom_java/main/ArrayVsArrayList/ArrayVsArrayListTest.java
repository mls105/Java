package com.lightbend.lagom.maven_archetype_lagom_java.main.ArrayVsArrayList;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class ArrayVsArrayListTest {
	
	
	@Test
	public void arrayTesting()
	{
		//fixed!
		//Arrays can hold primitives or objects
		String[] friendsArray = new String [4];
		//[0][1][2][3]
		String[] friendsArray2 = {"John", "Chris", "Eric", "Luke"};
		
		
		//not a fixed size!
		//ArrayList can hold objects only. Can get around this using the wrapper class
		ArrayList<String> friendsArrayList = new ArrayList<>();
		ArrayList<String> friendsArrayList2 = new ArrayList<>(Arrays.asList("John", "Chris", "Eric", "Luke"));
		
		assertTrue(friendsArray2[1].equals((friendsArrayList2).get(1)));
		
		//field vs method call
		assertTrue(friendsArray2.length == friendsArrayList2.size());
		
		//can't add elements to array
		//array lists can add elements!
		
		friendsArrayList2.add("Sayer");
		assertTrue(5 == friendsArrayList2.size());
		
		System.out.println(friendsArray); //will print out the memory address
		System.out.println(friendsArrayList2); //will print out all the elements
		
		//just use array lists :-)
		
	}

}
