package com.lightbend.lagom.maven_archetype_lagom_java.main.Static;

import com.lightbend.lagom.maven_archetype_lagom_java.main.Abstraction.Animal;

/**
 * 
 * 								-Characteristics of static keyword-
 * 
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
 * 
 * 											-Advantages-
 * 
 * 
 *  Memory efficiency: Static members are allocated memory only once during the execution of the program, 
 *  which can result in significant memory savings for large programs.
 *  
 *  Improved performance: Because static members are associated with the class rather than with individual 
 *  instances, they can be accessed more quickly and efficiently than non-static members. 
 *  
 *  Global accessibility: Static members can be accessed from anywhere in the program, regardless of whether 
 *  an instance of the class has been created.
 * 
 *  Encapsulation of utility methods: Static methods can be used to encapsulate utility functions that don’t 
 *  require any state information from an object. This can improve code organization and make it easier to 
 *  reuse utility functions across multiple classes.
 *
 *  Constants: Static final variables can be used to define constants that are shared across the entire program.
 *
 *  Class-level functionality: Static methods can be used to define class-level functionality that doesn’t require 
 *  any state information from an object, such as factory methods or helper functions.
 *  
 * 
 * @author 18603
 *
 */
public class BigFoot extends Animal {

	private String name;
	private int age;
	private int found = 0;
	private static int totalNumOfBigFoots = 0; //common value shared between all objects created by the class
	public static final int MAX_NUM_OF_SIGHTINGS = 0; //final variable - can only be assigned once! big foot must stay hidden! 
	
	
	/**
	 * 	Static variables:
	 * 
	 * When a variable is declared as static, then a single copy of the variable is created and 
	 * shared among all objects at the class level. Static variables are, essentially, global variables. All instances of 
	 * the class share the same static variable.
	 * 
	 */
	
	/**
	 * Static blocks:
	 * 
	 * If you need to do the computation in order to initialize your static variables, you can declare a static block that gets 
	 * executed exactly once, when the class is first loaded. 
	 * 
	 * Consider the following java program demonstrating the use of static blocks. 
	 * 
	 */
	
	/**
	 * 
	 * 	Static methods:
	 * 
	 *  When a method is declared with the static keyword, it is known as the static method. The most common example of a 
	 *  static method is the main( ) method. As discussed above, Any static member can be accessed before any objects of its 
	 *  class are created, and without reference to any object. Methods declared as static have several restrictions: 
     *
	 *  They can only directly call other static methods.
	 *  They can only directly access static data.
	 *  They cannot refer to this or super in any way.
	 * 
	 */
	
	
	/**
	 * Static Classes:
	 * 
     * A class can be made static only if it is a nested class. We cannot declare a top-level class with a static modifier 
     * but can declare nested classes as static. Such types of classes are called Nested static classes. Nested static class 
     * doesn’t need a reference of Outer class. In this case, a static class cannot access non-static members of the Outer class. 
	 * 
	 * 
	 */
	
	/**
	 * 
	 * When to use static variables and methods?
     * Use the static variable for the property that is common to all objects. For example, in class Student, all students 
     * share the same college name. Use static methods for changing static variables.
	 * 
	 */


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
