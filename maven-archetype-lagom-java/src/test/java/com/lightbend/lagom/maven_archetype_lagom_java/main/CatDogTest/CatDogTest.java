package com.lightbend.lagom.maven_archetype_lagom_java.main.CatDogTest;

import org.junit.Test;

import com.lightbend.lagom.maven_archetype_lagom_java.main.Abstraction.Cat;
import com.lightbend.lagom.maven_archetype_lagom_java.main.Super.CatDog;

public class CatDogTest {

	@Test
	public void testCatDog() 
	{
		
		Cat cat = new Cat(2, "fluffy");
		
		CatDog catDog = new CatDog(cat.getAge(), cat.getName(), 2, "Doggo");
		catDog.makeNoise();
		
	}
}
