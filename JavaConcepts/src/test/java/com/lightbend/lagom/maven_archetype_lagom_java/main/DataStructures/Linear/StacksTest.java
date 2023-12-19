package com.lightbend.lagom.maven_archetype_lagom_java.main.DataStructures.Linear;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Stack;

import org.junit.Test;

/**
 * Last in First Out (LIFO)
 * 
 * Ex: stack of trays, drive way with one car width, deck of cards
 */
public class StacksTest {
	
	@Test
	public void stackTest()
	{
		
		//Synchronized - slow!! Recommended to use array lists if synchronization is not needed.
		//Implements Vector
		Stack<Integer> stack = new Stack<>();
		stack.push(0);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		
		assertTrue(stack.peek() == 4);
		assertTrue(stack.size() == 5);
		assertTrue(stack.pop() == 4); //remove the last item
		assertTrue(stack.size() == 4);
		assertFalse(stack.isEmpty());
		assertTrue(stack.search(0) == 4); //distance from the top
	}

}
