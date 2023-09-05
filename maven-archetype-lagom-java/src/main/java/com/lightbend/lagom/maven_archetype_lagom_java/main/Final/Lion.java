package com.lightbend.lagom.maven_archetype_lagom_java.main.Final;

import com.lightbend.lagom.maven_archetype_lagom_java.main.Abstraction.Animal;

/**
 * 
 * final class - no more extending the class
 * final method - no subclasses can over ride it
 * final variable - can only be assigned once!
 * 
 *
 */
public final class Lion extends Animal{
	private final String name;
	
	public Lion(String name) {
		this.name = name;
	}

	public String getName()
	{
		return this.name;
	}

	@Override
	public void makeNoise() {
		System.out.println("ROAR!");

	}
	
	//final!! can't be over ridden
//	@Override
//	public final void birth()
//	{
//		System.out.println("I'm alive!");
//	}
	
	public void doThisOnce()
	{
		
	}
	
	
	

}
