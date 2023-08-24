package com.lightbend.lagom.maven_archetype_lagom_java.main.Abstraction;

/**
 * Abstract classes are not instantiated! just a blue print! 
 * @author 18603
 *
 */
public abstract class Animal {
	//forces variables 
	int age;
	String name;
	
	public abstract void makeNoise();
	
	//concrete method
	public void printName()
	{
		System.out.println("My name is " + name);
	}

}
