package com.lightbend.lagom.maven_archetype_lagom_java.main.MapsTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.LinkedHashMap;

import org.junit.Test;

import com.google.common.collect.ImmutableSet;

public class MapsTest {
	
	@Test
	public void HashMapTest()
	{
//		HashMap<String, Integer> empIDs = new HashMap<String, Integer>();
		//Java 7 - Don't need to add String and Integer again. Can't be primitives
		HashMap<String, Integer> empIDs = new HashMap<>();
		empIDs.put("Matt", 12345);
		empIDs.put("John", 54321);
		empIDs.put("Carl", 86753);
		empIDs.put("David", 34125);
		empIDs.put("Sawyer", 12221);
		
		
		assertEquals(empIDs.get("Carl").intValue(), 86753);
		
		assertFalse(empIDs.containsKey("Geroge"));
		
		assertTrue(empIDs.containsValue(12221));
		
		//put updates values if the key exists
		empIDs.put("Sawyer", 22222);
		
		assertFalse(empIDs.containsValue(12221));

		//will only update if the value exists. Otherwise it does nothing
		empIDs.replace("DNE", 98765);
		
		assertTrue(empIDs.containsKey("Matt"));
		empIDs.remove("Matt");
		
		assertFalse(empIDs.containsKey("Matt"));
		
		
		
		//order is not how you put them in!!
		System.out.println(empIDs);
	}
	
	@Test
	public void LinkedHashMapTest()
	{
		
		LinkedHashMap<String, Integer> empIDsLinked = new LinkedHashMap<>();
		empIDsLinked.put("Matt", 12345);
		empIDsLinked.put("John", 54321);
		empIDsLinked.put("Carl", 86753);
		empIDsLinked.put("David", 34125);
		empIDsLinked.put("Sawyer", 12221);
		
		System.out.println(empIDsLinked);
		
	}
	
	
	@Test
	public void ImmutableSetTest()
	{
		ImmutableSet.Builder<String> b = ImmutableSet.builder();
		b.add("1a");
		b.add("1b");
		b.add("1c");
		b.add("1d");
		b.add("1e");
		b.add("2f");
		b.add("2g");
		b.add("2h");
		b.add("2i");
		b.add("2j");
		b.add("2k");
		
		b.build();
		System.out.println(b.build());
	}

}
