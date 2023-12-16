package com.lightbend.lagom.maven_archetype_lagom_java.main.Optionals;

public class Bird {
	String name;
	int age;

	public Bird(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
//	public boolean equals(Object obj)
//	{
//		
//	}

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
	
}
