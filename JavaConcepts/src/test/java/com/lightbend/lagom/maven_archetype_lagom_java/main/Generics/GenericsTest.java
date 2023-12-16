package com.lightbend.lagom.maven_archetype_lagom_java.main.Generics;

import java.util.ArrayList;

import org.junit.Test;

import com.lightbend.lagom.maven_archetype_lagom_java.main.Abstraction.Cat;
import com.lightbend.lagom.maven_archetype_lagom_java.main.Polymorphism.Dog;


public class GenericsTest {
	@Test
	public void testGenerics()
	{
		
		IntegerPrinter integerPrinter = new IntegerPrinter(23);
		integerPrinter.print();
		
		DoublePrinter doublePrinter = new DoublePrinter(23.0);
		doublePrinter.print();
		
		//don't need to make classes for each 
		Printer<Integer> genericPrinterInteger = new Printer<>(23);
		genericPrinterInteger.print();
		
		//generics dont work with primitive types! no int, doubles. need to use the wrapper class
		Printer<Double> genericPrinterDouble = new Printer<>(23.0);
		genericPrinterDouble.print();
		
		
		ArrayList<Object> catList = new ArrayList<>();
		catList.add(new Cat(2,"Fluffy"));
		catList.add(new Dog()); //Very bad!!!! java accepts it though
		Cat myOtherCat = (Cat) catList.get(0); //java doesn't know this is a list of only Cats. Need to cast it but this isn't safe
//		Cat myCatMyOtherCatDoesntKnowAbout = (Cat) catList.get(1); //uh oh! it's a dog! this is a run time class cast exception
		

		//Keep the right class in the list!! If we used <Object> instead of <Cats> we would have typesafe issues!
		ArrayList<Cat> cats = new ArrayList<>();
		cats.add(new Cat(2,"Fluffy"));
		Cat myCat = cats.get(0);
		
		
		
		PrinterOfAnimals<Cat> printerOfAnimals = new PrinterOfAnimals<>(new Cat(3, "Rascal"));
		printerOfAnimals.print();
		
		
		Generics genericsTest = new Generics();
		genericsTest.shout("Fluffy");
		genericsTest.shout(12345);
		genericsTest.shout(myCat);
		genericsTest.shout(myOtherCat);
		
		//shows off how to use wildCards!
		genericsTest.printTheLists();
		
	}
}
