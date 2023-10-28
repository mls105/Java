package com.lightbend.lagom.maven_archetype_lagom_java.main.DesignPatterns.Singleton;

public class EagerInitialization {

	private static EagerInitialization theOnlyInstance = new EagerInitialization();
	
	/**
	 * n eager initialization, the instance of the singleton class is created at the time of class loading. 
	 * The drawback to eager initialization is that the method is created even though the client application might not be using it.
	 * 
	 * If your singleton class is not using a lot of resources, this is the approach to use. But in most of the scenarios, 
	 * singleton classes are created for resources such as File System, Database connections, etc. We should avoid the instantiation 
	 * unless the client calls the getInstance method. Also, this method doesn’t provide any options for exception handling.
	 * 
	 */
	private EagerInitialization(){
	}
	
	public static EagerInitialization getInstance() {
		return theOnlyInstance;
	}

}
