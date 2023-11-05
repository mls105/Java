package com.lightbend.lagom.maven_archetype_lagom_java.main.DesignPatterns.CreationalDesignPattern.Singleton;

public class ThreadSafeSingleton {
	
	private static ThreadSafeSingleton theOnlyInstance = null;
	
	private ThreadSafeSingleton(){
	}
	
	//thread safe but low performance
	public static synchronized ThreadSafeSingleton getInstance() {
		
		if(theOnlyInstance == null)
		{
			theOnlyInstance = new ThreadSafeSingleton();
		}
		return theOnlyInstance;
	}
	
	public static ThreadSafeSingleton getInstanceUsingDoubleLocking()
	{
		if(theOnlyInstance == null) {
			
			synchronized (ThreadSafeSingleton.class)
			{
				if(theOnlyInstance == null)
				{
					theOnlyInstance = new ThreadSafeSingleton();
				}
			}
		}
		return theOnlyInstance;
	}
}
