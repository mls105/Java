package com.lightbend.lagom.maven_archetype_lagom_java.main.Static;

import com.lightbend.lagom.maven_archetype_lagom_java.main.Abstraction.Animal;

/**
 * Static should be used for class level field/methods that are shared values amount the class
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
