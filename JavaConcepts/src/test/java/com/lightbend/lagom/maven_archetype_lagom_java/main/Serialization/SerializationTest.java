package com.lightbend.lagom.maven_archetype_lagom_java.main.Serialization;

import java.io.IOException;

import org.junit.Test;

public class SerializationTest {

	@Test
	public void testSerialization() throws ClassNotFoundException, IOException 
	{
		Serialization.createSerializableEmployee();
		Deserialization.deserializeEmployee();

	}

	@Test
	public void testSerializationClass() throws ClassNotFoundException, IOException 
	{

		String fileName="SerializableTest2.txt";
		Employee employee = new Employee();
		employee.setName("Mark");
		employee.setAddress("Florida");
		employee.setGrade('B'); // transient
		// serialize to file
		try {
			Serialization.serialize(employee, fileName);
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}

		Employee empNew = null;
		try {
			empNew = (Employee) Deserialization.deserialize(fileName);
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("emp Object::"+employee);
		System.out.println("empNew Object::"+empNew); //transient field will not be serialized!!
	}

}
