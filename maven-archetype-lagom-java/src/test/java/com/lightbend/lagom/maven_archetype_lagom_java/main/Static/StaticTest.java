package com.lightbend.lagom.maven_archetype_lagom_java.main.Static;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StaticTest {
    /**
     * 
     */
    @Test
    public void testStatic()
    {
    	int var = StaticExample.staticVar;
    	
    	assertEquals(StaticExample.multiply(3, 2), 6);  	
    }
}
