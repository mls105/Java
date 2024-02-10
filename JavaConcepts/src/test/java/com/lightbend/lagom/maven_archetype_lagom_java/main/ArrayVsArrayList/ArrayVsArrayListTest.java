package com.lightbend.lagom.maven_archetype_lagom_java.main.ArrayVsArrayList;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.List;

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
		
		friendsArrayList2.add("Sawyer");
		assertTrue(5 == friendsArrayList2.size());
		
		System.out.println(friendsArray); //will print out the memory address
		System.out.println(friendsArrayList2); //will print out all the elements
		
		//just use array lists :-)
	}
	
	
	//TODO: Move this to its own folder to break down how enhanced for loops work
	
	/**
	 * Will not throw the exception because the iteration in enhanced for loops will return false for the "next" 
	 * iterable value when you modify the second to last position in the list. checkForComodification is never 
	 * called and therefore no exception is thrown
	 * 
	 */
	@Test
	public void forEachLoopRemoveElementFromArrayListTest()
	{
		ArrayList<String> collection = new ArrayList<String>();
		collection.add("Apple");
		collection.add("Banana"); 
		collection.add("Cherry");
//		collection.add("Kiwi"); //if you add another element you will get your exception
		
		//for-each loops are pretty but some of the functionality is hidden
		//they use iterators: https://docs.oracle.com/javase/1.5.0/docs/guide/language/foreach.html
		for (String element : collection) 
		{
			System.out.println("Trying to remove element: " + element);
		    if (element.equals("Banana")) {
		    	System.out.println("about to remove");
		        collection.remove(element); //you removed the element! The collection is now resized 2 and will stop iterating!
		        System.out.println("Removed");
		    }
		    
		}
		
		//checkForComodification
		
	}
	
	@Test(expected = ConcurrentModificationException.class)
	public void forEachLoopRemoveElementFromListTest() throws InterruptedException
	{
		List<String> collection = new ArrayList<String>();
		collection.add("Apple");
		collection.add("Banana");
		collection.add("Cherry");
//		collection.add("Kiwi");
		
		int i = 0;
		for (String element : collection) 
		{
			i++;
		    if (element.equals("Apple")) {
		        collection.remove(element);
		    }
		    else
		    {
		    	
		    	System.out.println("else case hit");
		    }
		    System.out.println(i);
		}
	}
	
	@Test(expected = ConcurrentModificationException.class)
	public void whilstRemovingDuringIteration_shouldThrowException() throws InterruptedException {
//	@Test
//	public void whilstRemovingDuringIteration_shouldThrowException(){

	    List<Integer> integers = new ArrayList<Integer>();
	    integers.add(1);
	    integers.add(2);
	    integers.add(3);

	    for (Integer integer : integers) {
	        integers.remove(1);
	    }
	}

}
