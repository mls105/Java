package com.lightbend.lagom.maven_archetype_lagom_java.main.OptionalsTest;

import org.junit.Test;

import com.lightbend.lagom.maven_archetype_lagom_java.main.Optionals.Optionals;

public class OptionalsTest {
    @Test
    public void testStatic()
    {
    	Optionals.testFindBirdByName();
    }
}
