package com.lightbend.lagom.maven_archetype_lagom_java.main.Polymorphism;

public class Animal {
	public String name;
	public String color;
	
	public Animal(String name, String color) {
		this.name = name;
		this.color = color;
	}

	public Animal() {
	}

	public void eat()
	{
		System.out.println("munch!");
	}
	
	public void makeNoise() 
	{
		System.out.println("yap yap yap!");
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
