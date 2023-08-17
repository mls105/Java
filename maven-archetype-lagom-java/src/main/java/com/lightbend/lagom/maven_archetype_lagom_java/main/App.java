package com.lightbend.lagom.maven_archetype_lagom_java.main;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        testPolymorphism();
        
    }
    
    public static void testPolymorphism()
    {
    	Animal myAnimal = new Animal();
    	myAnimal.eat();
    }
}
