package com.lightbend.lagom.maven_archetype_lagom_java.main.AnnotationsProcessing;

import javax.annotation.processing.*;

public class EmployeeBuilder {
	
	private int age;
	private String name;
	private String address;
	
	public EmployeeBuilder name(String name) {
		this.name = name;
		return this;
	}
	
	public EmployeeBuilder age(int age) {
		this.age = age;
		return this;
	}
	
	public EmployeeBuilder address(String address) {
		this.address = address;
		return this;
	}
	
	public Employee build() {
		return new Employee(age, name, address);
	}

}
