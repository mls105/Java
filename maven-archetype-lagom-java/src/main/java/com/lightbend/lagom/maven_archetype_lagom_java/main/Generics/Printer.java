package com.lightbend.lagom.maven_archetype_lagom_java.main.Generics;

//<> means type parameter. T is standard but you can put whatever
public class Printer <T>{
	T thingToPrtint;
	
	
	public Printer(T thingToPrtint)
	{
		this.thingToPrtint = thingToPrtint;
	}
	
	public void print()
	{
		System.out.println(thingToPrtint);
	}
}
