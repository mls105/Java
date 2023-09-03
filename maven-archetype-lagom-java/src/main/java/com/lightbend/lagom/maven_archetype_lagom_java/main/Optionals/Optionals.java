package com.lightbend.lagom.maven_archetype_lagom_java.main.Optionals;

import java.util.Optional;

//container that has something in it or doesn't
public class Optionals {
	
	
	public static void testFindBirdByName()
	{
		Bird myBird = findBirdByName("birdyBoy"); //null pointer if the bird DNE need to add a not null check
		if(myBird != null) 
		{
			System.out.println(myBird.getAge());
		}
		else
		{
			// DNE!
		}
		
		Optional <Bird> optionalBird = findBirdByNameUsingOptional("mr bird");
//		optionalBird.get().getAge(); //no such element will be thrown if you call get() on an empty optional. just as bad as null pointer
		
		
		//this looks suspiciously like the null check but with extra steps
		//end result IS the same but it's known to the developer that hey this is very possible that it DNE
		if(optionalBird.isPresent())
		{
			optionalBird.get().getAge();
		}
		else
		{
			//DNE
		}

		//optional - contains the bird or doesnt! 	
	}
	
	
	//fetch a bird (from the database but in this case we just create it for the example)
	private static Bird findBirdByName(String name)
	{
		Bird bird = new Bird(name, 3);
		//		return bird;
		//uh oh there is no bird by that name in the database
		return null;
	}
	
	private static Optional<Bird> findBirdByNameUsingOptional(String name)
	{
		Bird bird = new Bird(name, 3);
		//		return bird;
		//uh oh there is no bird by that name in the database
		
		//Optional.of(bird); //only used if you knwo for sure the object is not null// will throw and exception if it is null
		
		return Optional.ofNullable(bird); //if null then it will create an empty cat
	}
}
