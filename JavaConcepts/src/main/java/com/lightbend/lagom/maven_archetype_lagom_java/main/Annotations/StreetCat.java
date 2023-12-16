package com.lightbend.lagom.maven_archetype_lagom_java.main.Annotations;

@VeryStinky
public class StreetCat {
	
	@ImportantString
	String name;
	int age;
	
	public StreetCat(String name ) 
	{
		this.name = name;
	}
	
	@RunImmediatly(times = 3)
	public void meow()
	{
		System.out.println("meow!");
	}
	
	public void eat()
	{
		System.out.println("Munch!");
	}

}
