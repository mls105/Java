package com.lightbend.lagom.maven_archetype_lagom_java.main.Static;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BigFootTest {

	
	@Test
	public void bigFootTest()
	{
		BigFoot bigFoot = new BigFoot();
		
		assertEquals(BigFoot.getBigFootCount(), 1); //always access static methods and fields through the class not the object!
		assertEquals(bigFoot.getBigFootCount(), 1); //not readable because the dev can think its referencing the object not the class
		
		BigFoot bigFoot2 = new BigFoot();
		assertEquals(BigFoot.getBigFootCount(), 2);
		
		assertEquals(BigFoot.MAX_NUM_OF_SIGHTINGS, 0);
	}
}
