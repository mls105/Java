package com.lightbend.lagom.maven_archetype_lagom_java.main.Equals;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.lightbend.lagom.maven_archetype_lagom_java.main.Optionals.Bird;

public class EqualsExampleTest {

	/**
	 * == to compare primitives (boolean, byte, char, short, int, long, float and double)
	 */
	@SuppressWarnings({ "unused", "null" })
	@Test
	public void  equalsTest()
	{
		int someInt = 3;
		int anotherInt = 3;
		
		assertTrue(someInt == anotherInt);

		String someString = "string";
		String anotherString = "string";
		
		//checking memory location!!
		assertTrue(someString == anotherString);
		
		String newString = new String("string");
		String anotherNewString = new String("string");

		assertFalse(newString == anotherNewString);
		
		assertTrue(newString.equals(anotherNewString));
		
		Bird bird1 = new Bird("Birdy boi", 2);
		Bird bird2 = new Bird("Birdy boi", 2);
		//not equal because it's using the default equals in the object class!!
		assertFalse(bird1.equals(bird2));
		
		//must override the equals in the bird class
		Bird nullBird = null;
		// null pointer!
		assertNull(nullBird.getName().equals("Birdy boi"));
		//string literal can be compared to null and not throw a null pointer
		assertNotNull("Birdy boi".equals(nullBird.getName()));
		

		
	}
}
