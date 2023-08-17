package com.lightbend.lagom.maven_archetype_lagom_java.main;

public class Animal {
	private String name;
	private String color;
	
	public void eat()
	{
		System.out.println("munch!");
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getColor()
	{
		return color;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setColor(String color)
	{
		this.color = color;
	}

}
