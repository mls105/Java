package com.lightbend.lagom.maven_archetype_lagom_java.main.DesignPatterns.CreationalDesignPattern.Singleton;

public class LazyInitialization {
	
	private static LazyInitialization theOnlyInstance = null;
	
	private LazyInitialization(){
	}
	
	//invoked only when required but CAN'T handle multiple threads
	public static LazyInitialization getInstance() {
		
		if(theOnlyInstance == null)
		{
			theOnlyInstance = new LazyInitialization();
		}
		return theOnlyInstance;
	}
}
