package com.lightbend.lagom.maven_archetype_lagom_java.main.Strings;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class EqualsAndHashCodeTest {

	
	@Test
	public void testToString()
	{
		EqualsAndHashCode eahc1 = new EqualsAndHashCode();
		eahc1.s = "someString";
		eahc1.someInt = 2;
		
		EqualsAndHashCode eahc2 = new EqualsAndHashCode();
		eahc2.s = "someString";
		eahc2.someInt = 2;
		
		assertTrue(eahc1.equals(eahc2));
		
		
		
	}
}
