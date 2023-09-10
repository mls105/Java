package com.lightbend.lagom.maven_archetype_lagom_java.main.Reflection;

/**
 * Class to Show off how to access private fields and methods in java!
 * @author 18603
 *
 */
public class Reflection {
	private int privateInt = 0;
	private String privateString = "this is a private string!";
	
	public Reflection(int privateInt, String privateString) {
		super();
		this.privateInt = privateInt;
		this.privateString = privateString;
	}
	
	@SuppressWarnings("unused")
	private int privateFunctionAdd(int a, int b)
	{
		return a + b;
	}
	
	private String thisIsPrivate()
	{
		String s = "Hey this is private!";
		return s;
	}
	public int getPrivateInt() {
		return privateInt;
	}
	
	public void setPrivateInt(int privateInt) {
		this.privateInt = privateInt;
	}
	
	public String getPrivateString() {
		return privateString;
	}
	
	public void setPrivateString(String privateString) {
		this.privateString = privateString;
	}
	
	
	
}
