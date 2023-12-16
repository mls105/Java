package com.lightbend.lagom.maven_archetype_lagom_java.main.Abstraction;

import com.lightbend.lagom.maven_archetype_lagom_java.main.Interface.Life;

/**
 * can only extend one class but can implement as many as you want!
 * @author 18603
 *
 */
public class Cat extends Animal implements Life {
	private int age;
	private String name;
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//constructor
	public Cat(int age, String name)
	{
		this.age = age;
		this.name = name;
	}	
	
	//method over riding (run time - Dynamic polymorphism)
	@Override
	public void makeNoise()
	{
		System.out.println("meow!");
	}

	@Override
	public void born(String born) {
		System.out.println("I was born " + born);
		
	}
}