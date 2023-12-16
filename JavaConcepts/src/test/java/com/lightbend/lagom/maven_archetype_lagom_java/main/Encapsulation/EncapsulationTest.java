package com.lightbend.lagom.maven_archetype_lagom_java.main.Encapsulation;

import org.junit.Test;

public class EncapsulationTest {

	
	@Test
	public void testStudent()
	{
		Student s = new Student();
		s.setAge(2);
		s.setName("Steve");
		
		s.getAge();
		s.getName();
	}
}
