package com.lightbend.lagom.maven_archetype_lagom_java.main.Serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/**
 * 
 * @author 18603
 *
 */
public class Deserialization implements Serializable {

	/**
	 * we use the serialVersionUID attribute to remember versions of a Serializable class to verify that a loaded class and the serialized object are compatible.

	 * https://www.baeldung.com/java-serial-version-uid
	 */
	private static final long serialVersionUID = -1150771124226321083L; //good practice to update this if changes are made to the class
	public static void deserializeEmployee() throws IOException, ClassNotFoundException
	{
		Employee employee = null;
		
		try 
		{
			FileInputStream fileIn = new FileInputStream ("D:\\EclipseFiles\\Serializable\\SerializableTest.txt");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			
			employee = (Employee) in.readObject();
			in.close();
			fileIn.close();
		}
		finally
		{
			System.out.println("Deserializing! name is " + employee.getName() + " address is " + employee.getAddress());
		}
	}
	
	// deserialize to Object from given file
	public static Object deserialize(String fileName) throws IOException, ClassNotFoundException 
	{
		FileInputStream fis = new FileInputStream(fileName);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object obj = ois.readObject();
		ois.close();
		return obj;
	}

}
