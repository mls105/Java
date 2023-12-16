package com.lightbend.lagom.maven_archetype_lagom_java.main.Generics;

public class DoublePrinter {
	Double thingToPrtint;
	
	public DoublePrinter(Double thingToPrtint)
	{
		this.thingToPrtint = thingToPrtint;
	}
	
	public void print()
	{
		System.out.println(thingToPrtint);
	}
}
