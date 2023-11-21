package com.lightbend.lagom.maven_archetype_lagom_java.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import org.junit.Test;


/**
 * Unit test for simple App.
 */
public class AppTest 
{

    @Test
    public void appTest()
    {
    	ArrayList<String> a = new ArrayList<>();
    	a.set(0, "a");
    	
    	Collections.unmodifiableList((Arrays.asList(a.toArray())));
    	
    }
    
}
