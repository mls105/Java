package com.lightbend.lagom.maven_archetype_lagom_java.main.Static;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StaticBlockTest {
	
	@Test
	public void staticBlockTest()
	{
        // Although we have two objects, static block is
        // executed only once.
		StaticBlock t1 = new StaticBlock();
		StaticBlock t2 = new StaticBlock();
		
		
		assertEquals(t1.getStaticCount(), 1);
		assertEquals(t1.getConstructorCount(), 2);
		
	}

}
