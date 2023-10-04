package com.lightbend.lagom.maven_archetype_lagom_java.main.Annotations;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class CreatingAnnotations {
	
	public static void testAnnotations() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException
	{
		StreetCat possum = new StreetCat("Stinky boi");
		
		if(possum.getClass().isAnnotationPresent(VeryStinky.class))
		{
			System.out.println("this thing is very stinky!!!");
		}
		else
		{
			System.out.println("this thing is not stinky!");
		}
		
		for(Method method : possum.getClass().getDeclaredMethods())
		{
			if(method.isAnnotationPresent(RunImmediatly.class))
			{
				RunImmediatly annotation = method.getAnnotation(RunImmediatly.class);
				annotation.times();
				
				for(int i =0; i<annotation.times(); i++)
				{
					method.invoke(possum);
				}
				
			}
		}
		
		for(Field field : possum.getClass().getDeclaredFields())
		{
			if(field.isAnnotationPresent(ImportantString.class))
			{
				Object obj = field.get(possum);
				
				if(obj instanceof String)
				{
					System.out.println(((String) obj).toUpperCase());
				}
			}
		}
		
		
//		List<Integer> list = new ArrayList<>();
//		list.add(3);
//		list.add(2);
//		list.add(1);
//		
//		
//		for(Integer listInt : list)
//		{
//			System.out.println(listInt);
//		}
		
	}

}
