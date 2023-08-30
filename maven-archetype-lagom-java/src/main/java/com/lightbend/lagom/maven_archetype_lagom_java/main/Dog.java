package com.lightbend.lagom.maven_archetype_lagom_java.main;

public class Dog extends Animal {
	private int breed;
	
	//(Polymorphism) method overriding - child class Dog that implements the same method in the parent class
	public void eat() 
	{
		System.out.println("chomp! chomp!");
	}
	
	//(Polymorphism) method overloading - same name different paramters 
	public void eat(int numberOfChomps) 
	{
		for(int i = 0; i<numberOfChomps; i++)
		{
			System.out.print("chomp! ");
		}
		
	}
	
	public int getBreed() 
	{
		return breed;
	}
	
	public void setBreed(int breed) 
	{
		this.breed = breed;
	}

}
