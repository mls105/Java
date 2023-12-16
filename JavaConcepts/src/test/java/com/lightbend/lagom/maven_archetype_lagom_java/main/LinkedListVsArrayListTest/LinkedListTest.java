package com.lightbend.lagom.maven_archetype_lagom_java.main.LinkedListVsArrayListTest;

import java.util.ArrayList;
import java.util.LinkedList;

import org.junit.Test;
public class LinkedListTest {

	@Test
	public void LinkedList()
	{
		//both LL and AL are part of the collections framework and implement list
		//implementation is the big difference between the 2
		LinkedList<String> namesLinkedList = new LinkedList<>(); //java uses double linked list. pointer to next, prev and tail
		namesLinkedList.add("John");
		namesLinkedList.add("Paul");
		namesLinkedList.add("George");
		namesLinkedList.add("Ringo");
		namesLinkedList.get(2); //has to start at 0 and go through ALL values in the LL until it reaches what you want. This is slow!
		
		namesLinkedList.add(1, "Jerry"); //starts at the beginning of the list and then goes to where the value needs to be inserted. It then changes the pointer of prev and next
		//adding and removing a LL is very fast!
		
		String[] names = new String [4]; //normal instantiation of an array!
		ArrayList<String> namesArrayList = new ArrayList<>();  //array list will have a default size and then dynamically resize. This is inefficient! 
		namesArrayList.add("John");
		namesArrayList.add("Paul");
		namesArrayList.add("George");
		namesArrayList.add("Ringo");
		namesArrayList.get(2); //constant time to get the element
		
		namesArrayList.add(1, "Jerry"); //creates a whole new array to fit the new elements
		
		//{"John", "Paul", "George", "Ringo"}; //current array list
		//{,,,}                                // create a whole new array list. copy though the current array list and add the new value!
		// if you need to remove it will have to remove where you want and then shift the entire array list over 
		
		
		
//		Linked List:
//		- inserting or removing a value is VERY fast!
//		- getting values is slow
//		
//		Array List:
//		-getting a value is very fast
//      -inserting values is slow
//
//		tiny list doesn't really matter!
//		if the list is static and doesn't change much and you are just retrieving values then use an array list
//		if the list doesn't need to be retrieved often but you are adding or removing a lot then use a linked list
//      list commands are the same! behind the scenes is much different
		
	}
}
