package com.lightbend.lagom.maven_archetype_lagom_java.main.Polymorphism;

import org.junit.Test;


public class AnimalTest 
{
    /**
     * 
     */
    @Test
    public void testAnimal()
    {
    	Animal myAnimal = new Animal();
    	myAnimal.eat();
    }
    
    /**
     * 
     */
    @Test
    public void testDog()
    {
    	Dog myDog = new Dog();
    	myDog.setColor("Brown");
    	//overriding
    	myDog.eat();
    	//overloading
    	myDog.eat(6);
    	
    }
}
