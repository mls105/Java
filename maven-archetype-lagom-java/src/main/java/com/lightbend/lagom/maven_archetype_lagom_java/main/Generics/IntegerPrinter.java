package com.lightbend.lagom.maven_archetype_lagom_java.main.Generics;

public class IntegerPrinter {
	Integer thingToPrtint;
	
	public IntegerPrinter(Integer thingToPrtint)
	{
		this.thingToPrtint = thingToPrtint;
	}
	
	public void print()
	{
		System.out.println(thingToPrtint);
	}
}
