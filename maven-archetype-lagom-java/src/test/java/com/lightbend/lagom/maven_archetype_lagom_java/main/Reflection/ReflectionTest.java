package com.lightbend.lagom.maven_archetype_lagom_java.main.Reflection;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.Test;

public class ReflectionTest {
	
	@Test
	public void testReflection() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, NoSuchMethodException, InvocationTargetException
	{
		Reflection reflection = new Reflection(0, "privateString");
		
		Field privateString = reflection.getClass().getDeclaredField("privateString");
		privateString.setAccessible(true);
		privateString.set(reflection, "changedString");
		
		assertTrue("changedString".equals(reflection.getPrivateString()));
		assertFalse("privateString".equals(reflection.getPrivateString()));

		String s = "Hey this is private!";
		Method reflectionMethod = reflection.getClass().getDeclaredMethod("thisIsPrivate");
		reflectionMethod.setAccessible(true);
		String checkPrivateString = (String) reflectionMethod.invoke(reflection);
		assertTrue(s.equals(checkPrivateString));
		
		Method privateAddMethod = reflection.getClass().getDeclaredMethod("privateFunctionAdd", int.class, int.class);
		privateAddMethod.setAccessible(true);
		int sum = (int) privateAddMethod.invoke(reflection, 1, 2);
		assertTrue(sum == 3);
	}

}
