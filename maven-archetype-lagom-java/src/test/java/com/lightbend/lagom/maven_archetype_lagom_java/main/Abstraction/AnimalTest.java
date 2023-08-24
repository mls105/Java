package com.lightbend.lagom.maven_archetype_lagom_java.main.Abstraction;

import org.junit.Test;

public class AnimalTest {
    /**
     * 
     */
    @Test
    public void testAbstraction()
    {
    	Cat cat = new Cat(2, "fluffy");
    	cat.makeNoise();
    	cat.printName();
    	cat.born("today!");
    }
}
