package com.lightbend.lagom.maven_archetype_lagom_java.main.Serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Serialization is the process of converting an object into a sequence of bytes which 
 * can be persisted to a disk or can be sent through streams. The reverse process is 
 * deserialization. JVM independent (Can be serialized/deserialized on any platform)
 * 
 * This is used to send data over a network to save space or to store in a database.
 * @author 18603
 *
 */
public class Serialization {
	
	public static void createSerializableEmployee()
	{
		Employee employee = new Employee();
		employee.setName("Mark");
		employee.setAddress("Florida");
		employee.setGrade('B'); //transient
		
		try
		{
			FileOutputStream fileOut = new FileOutputStream("D:\\EclipseFiles\\Serializable\\SerializableTest.txt");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(employee);
			out.close();
			fileOut.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// serialize the given object and save it to file
	public static void serialize(Object obj, String fileName) throws IOException 
	{
		FileOutputStream fos = new FileOutputStream(fileName);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(obj);

		fos.close();
	}
}
