package com.lightbend.lagom.maven_archetype_lagom_java.main.POJOvsBean;

import java.io.Serializable;

/**
 * Bean
 * 
 * No arg constructor
 * properties/instance variables must be private
 * public getters and setter
 * must be serializable (tells java it can be written to databases and files)
 * 
 * @author 18603
 *
 */
public class Bean implements Serializable{
	//no args constructor automatically created in java
	private int someInt;
	private String someString;
	
	public int getSomeInt() {
		return someInt;
	}
	public void setSomeInt(int someInt) {
		this.someInt = someInt;
	}
	public String getSomeString() {
		return someString;
	}
	public void setSomeString(String someString) {
		this.someString = someString;
	}
	
}
