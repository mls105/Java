package com.lightbend.lagom.maven_archetype_lagom_java.main.Annotations;

import java.lang.reflect.InvocationTargetException;

import org.junit.Test;

public class CreatingAnnotationsTest {
	
	@Test
	public void testingAnnotations() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException
	{
		CreatingAnnotations.testAnnotations();
	}

}
