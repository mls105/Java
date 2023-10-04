package com.lightbend.lagom.maven_archetype_lagom_java.main.Generics;

import java.util.ArrayList;
import java.util.List;

import com.lightbend.lagom.maven_archetype_lagom_java.main.Abstraction.Animal;
import com.lightbend.lagom.maven_archetype_lagom_java.main.Abstraction.Cat;

public class Generics {
	
	public static <T> void shout(T thingToShout)
	{
		System.out.println(thingToShout + "!!!!!!!!!!!!!");
	}
	
	public static <T, V> void shoutManyThings(T thingToShout, V otherThingToShout)
	{
		System.out.println(thingToShout + "!!!!!!!!!!!!!" + otherThingToShout + "!!!!!!!!!");
	}
	
	public static <T, V> T shoutManyThingsAndReturn(T thingToShout, V otherThingToShout)
	{
		System.out.println(thingToShout + "!!!!!!!!!!!!!" + otherThingToShout + "!!!!!!!!!");
		return thingToShout;
	}
	
	public static void printTheLists()
	{
		List<Integer> intList = new ArrayList<>();
		intList.add(3);
//		prtinList(intList); //can't do this! Integer is a subclass of Object. A list of Integers is not a subclass of a list of Objects
		printListWithWildCard(intList);
		
		List<Cat> catList = new ArrayList<>();
		catList.add(new Cat(4, "Patches"));
		printListWithWildCard(catList);
		prtinListWithWildCardAndExtends(catList);
		
	}
	
	//This does not work!
	public static void printList(List<Object> myList)
	{
		System.out.println(myList);
	}
	
	//must use a wild card
	public static void printListWithWildCard(List<?> myList)
	{
		System.out.println(myList);
	}
	
	//must use a wild card
	public static void prtinListWithWildCardAndExtends(List<? extends Animal> myList)
	{
		System.out.println(myList);
	}

}
