package com.lightbend.lagom.maven_archetype_lagom_java.main.AnnotationsProcessing;

@Builder
public class Employee {
	
	private int age;
	private String name;
	private String address;
	
	public Employee(int age, String name, String address) {
		super();
		this.age = age;
		this.name = name;
		this.address = address;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

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
