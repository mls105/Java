package com.lightbend.lagom.maven_archetype_lagom_java.main.PassByValueTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.lightbend.lagom.maven_archetype_lagom_java.main.PassByValue.Cheese;

/**
 * pass by value means making a copy
 * pass by reference is passing the memory address of the original
 * 
 * 
 * 100% of the time java is pass by value. obj or primitives it doesnt matter
 * @author 18603
 *
 */
public class PassByValueTest {
	
	@Test
	public void passByValueTest() {
		Cheese myCheese = new Cheese(); //holds the reference to the cheese object in memory
		myCheese.setLevelOfStinkiness(10);
		
		System.out.println(myCheese.getLevelOfStinkiness());
		assertEquals(myCheese.getLevelOfStinkiness(), 10);
		
		plusOneLevelOfStinkiness(myCheese);
		
		assertEquals(myCheese.getLevelOfStinkiness(), 11);
		System.out.println(myCheese.getLevelOfStinkiness());
		
		//create a new object and set it to 756
		increaseLevelOfStinkinessWithNewObject(myCheese);
		//still 11!
		assertEquals(myCheese.getLevelOfStinkiness(), 11);
		System.out.println(myCheese.getLevelOfStinkiness());
	}
	
	/**
	 * Pass by value 
	 * 
	 * copies the memory address
	 * 
	 * the cheese object passed in points to the same memory location
	 * 
	 * Can appear to be pass by reference (value of the memory address of the object!)
	 * 
	 * 
	 * @param cheese
	 */
	private static void plusOneLevelOfStinkiness(Cheese cheese)
	{
		cheese.setLevelOfStinkiness(cheese.getLevelOfStinkiness() + 1);
	}
	
	
	private static void increaseLevelOfStinkinessWithNewObject(Cheese cheese)
	{
		
		cheese = new Cheese(); //brand new cheese object in memory. different address
		cheese.setLevelOfStinkiness(756); // this is a whole new object. no longer pointing to the object passed in
	}

}
