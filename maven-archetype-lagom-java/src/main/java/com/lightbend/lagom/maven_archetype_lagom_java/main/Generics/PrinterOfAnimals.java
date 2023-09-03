package com.lightbend.lagom.maven_archetype_lagom_java.main.Generics;

import com.lightbend.lagom.maven_archetype_lagom_java.main.Abstraction.Animal;

//bounded generic
public class PrinterOfAnimals<T extends Animal> {
	T thingToPrtint;

	public PrinterOfAnimals(T thingToPrtint) {
		this.thingToPrtint = thingToPrtint;
	}

	public void print() {
		//we have access to the abstract class animal!
		thingToPrtint.print();
		System.out.println(thingToPrtint);
	}
}
