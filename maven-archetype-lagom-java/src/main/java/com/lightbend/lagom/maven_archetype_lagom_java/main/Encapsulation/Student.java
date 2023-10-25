package com.lightbend.lagom.maven_archetype_lagom_java.main.Encapsulation;


/**
 * Encapsulation is the practice of keeping fields within a class private, then providing access to those fields via public methods. 
 * Encapsulation is a protective barrier that keeps the data and code safe within the class itself. We can then reuse 
 * objects like code components or variables without allowing open access to the data system-wide.
 * 
 * @author 18603
 *
 */
public class Student {
	
	public String name;
	public int age;

	public void setAge(int age) 
	{
		this.age = age;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public String getName()
	{
		return name;
	}

}