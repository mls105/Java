package com.lightbend.lagom.maven_archetype_lagom_java.main.Static;

import com.lightbend.lagom.maven_archetype_lagom_java.main.Abstraction.Animal;

/**
 * Static should be used for class level field/methods that are shared values amount the class
 * 
 * Shared memory allocation: 
 * Static variables and methods are allocated memory space only once during the execution of the 
 * program. This memory space is shared among all instances of the class, which makes static members 
 * useful for maintaining global state or shared functionality. 
 * 
 * Accessible without object instantiation: 
 * Static members can be accessed without the need to create an instance of the class. This makes 
 * them useful for providing utility functions and constants that can be used across the entire program.
 * 
 * Associated with class, not objects: 
 * Static members are associated with the class, not with individual objects. This means that changes 
 * to a static member are reflected in all instances of the class, and that you can access static members 
 * using the class name rather than an object reference.
 * 
 * Cannot access non-static members: 
 * Static methods and variables cannot access non-static members of a class, as they are not associated 
 * with any particular instance of the class.
 * 
 * Can be overloaded, but not overridden: 
 * Static methods can be overloaded, which means that you can define multiple methods with the same name 
 * but different parameters. However, they cannot be overridden, as they are associated with the class 
 * rather than with a particular instance of the class.
 * 
 * @author 18603
 *
 */
public class BigFoot extends Animal {

	private String name;
	private int age;
	private int found = 0;
	private static int totalNumOfBigFoots = 0; //common value shared between all objects created by the class
	public static final int MAX_NUM_OF_SIGHTINGS = 0; // big foot must stay hidden!
	
	@Override
	public void makeNoise() {
		System.out.println("Sneaky!!");
	}
	
	public BigFoot()
	{
		//every time a big foot is created it will increment
		totalNumOfBigFoots++;
		//big foot must stay hidden!
		found = MAX_NUM_OF_SIGHTINGS;
	}
	

	//non-static MUST be called on the individual object
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getFound() {
		return found;
	}

	public void setFound(int found) {
		this.found = found;
	}
	
	public static int getBigFootCount()
	{
		return totalNumOfBigFoots;
	}

	public static int getMaxNumOfSightings() {
		return MAX_NUM_OF_SIGHTINGS;
	}

}
