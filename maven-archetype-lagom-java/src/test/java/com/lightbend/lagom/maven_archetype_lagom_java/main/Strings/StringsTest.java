package com.lightbend.lagom.maven_archetype_lagom_java.main.Strings;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class StringsTest {
    /**
     * 
     */
    @Test
    public void testStringsAreImmutable()
    {
    	String name ="Michael"; //creates a string var..not the object but a refrence
    	name = "John"; //creates a new string object in memory that points to the value
    	
    	String anotherName = "John"; //both point to the same memory location 
    	
    	name = "Matt"; //if we change the variable it won't change anotherNames value
    			
    	
    	String aThirdName = new String("John"); //wont use the pool of string objects
    	
    	
    	System.out.println(anotherName == aThirdName); //false! you created a different object. they arent the same memory location
    	assertFalse(anotherName == aThirdName);
    	
    	
    	System.out.println(aThirdName.equals(anotherName));
    	assertTrue(aThirdName.equals(anotherName));
    	
    	//String objects will never change! security risk of reference changes will never happen!
    	//Strings are thread safe
    }
}
