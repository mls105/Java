package com.lightbend.lagom.maven_archetype_lagom_java.main.Super;

import com.lightbend.lagom.maven_archetype_lagom_java.main.Abstraction.Cat;

public class CatDog extends Cat {
	int catAge ;
	String catName;
	int dogAge;
	String dogName;
	
	public CatDog(int catAge, String catName, int dogAge, String dogName) {
		super(catAge, catName);
		//java will automatically do the super() even if you dont create it
		this.dogAge = dogAge;
		this.dogName = dogName;
	}
	
	@Override
	public void makeNoise()
	{
		//can call the super classes methods or variables directly in the sub class
		super.makeNoise();
		System.out.println("ruff!");
	}

}
