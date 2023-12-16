package com.lightbend.lagom.maven_archetype_lagom_java.main.DesignPattern.CreationalDesignPattern.SingletonTest;

import static org.junit.Assert.assertTrue;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.lightbend.lagom.maven_archetype_lagom_java.main.DesignPatterns.CreationalDesignPattern.Singleton.StaticBlockInitialization;

public class StaticBlockInitializationTest {

	@Rule
	public ExpectedException expectedEx = ExpectedException.none();

	@Test
	public void staticBlockInitializationTest() {
		StaticBlockInitialization staticBlockInitialization = StaticBlockInitialization.getInstance();
		StaticBlockInitialization staticBlockInitialization2 = StaticBlockInitialization.getInstance();

		assertTrue(staticBlockInitialization == staticBlockInitialization2); // memory location is the same!

	}
}
