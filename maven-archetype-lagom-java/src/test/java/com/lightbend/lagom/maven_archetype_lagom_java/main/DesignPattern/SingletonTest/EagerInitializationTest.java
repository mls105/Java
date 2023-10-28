package com.lightbend.lagom.maven_archetype_lagom_java.main.DesignPattern.SingletonTest;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.lightbend.lagom.maven_archetype_lagom_java.main.DesignPatterns.Singleton.EagerInitialization;

public class EagerInitializationTest {

	@Test
	public void testEagerInitialization()
	{
		
//		EagerInitialization eagerInitialization = new EagerInitialization(); //won't let you do this!
		
		EagerInitialization eagerInitialization = EagerInitialization.getInstance();
		
		EagerInitialization eagerInitialization2 = EagerInitialization.getInstance();
		
		assertTrue(eagerInitialization == eagerInitialization2); //memory location is the same!
	}
}
