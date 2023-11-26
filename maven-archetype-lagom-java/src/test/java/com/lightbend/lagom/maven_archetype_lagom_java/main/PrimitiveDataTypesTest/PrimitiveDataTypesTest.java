package com.lightbend.lagom.maven_archetype_lagom_java.main.PrimitiveDataTypesTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import dev.mccue.guava.math.DoubleMath;

public class PrimitiveDataTypesTest {

	/**
	 * 
	 */
	@Test
	public void primitiveTest()
	{
		double d1 = 0.00000000001;
		double d2 = 0.00000000001;
		double epsilon = 0.000000000001;
		
		assertEquals(d1, d2, epsilon);
		
		double d3 = d1 + d2;
		double d4 = 0.00000000002;
		double d5 = 0.00000000003;
		
		System.out.println(Double.compare(d1, d2));
		System.out.println(Double.compare(d3, d4));
		System.out.println(Double.compare(d4, d5));
		
		float f1 = 0.0000000000001f;
		float f2 = 0.0000000000001f;
		
		float f3 = f1 + f2;
		float f4 = 0.0000000000002f;
		float f5 = 0.0000000000003f;
		
		
		System.out.println(Double.compare(f1, f2));
		System.out.println(Double.compare(f3, f4));
		System.out.println(Double.compare(f4, f5));
		
		DoubleMath.fuzzyEquals(d1, d2, epsilon);
		DoubleMath.fuzzyEquals(f1, f2, epsilon);
	}
}
