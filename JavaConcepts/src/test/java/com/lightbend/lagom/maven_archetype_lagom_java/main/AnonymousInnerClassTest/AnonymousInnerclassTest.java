package com.lightbend.lagom.maven_archetype_lagom_java.main.AnonymousInnerClassTest;

import org.junit.Test;

import com.lightbend.lagom.maven_archetype_lagom_java.main.Polymorphism.Animal;

public class AnonymousInnerclassTest {

	@Test
	public void anonymousInnerClass()
	{
		Animal myAnimal = new Animal();
		myAnimal.makeNoise();
		
		//anonymous inner class - one time use
		Animal bigFoot = new Animal("FurryFoot", "white") {
			public void makeNoise() {
				System.out.println("I have furry big feet!");
			}
		};
		bigFoot.makeNoise();
		
		//Runnable is an interface. Must implement the run method
		Runnable myAnonymousRunnable = new Runnable() {

			@Override
			public void run() {
				System.out.println("run run run!");
				
			}
			
		};
		
		myAnonymousRunnable.run();
		
	}
}
