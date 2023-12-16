package com.lightbend.lagom.maven_archetype_lagom_java.main.InnerClass;

public class OuterClass {
	int number = 6;

	public void heythere() {
		System.out.println("Hey There");
		
		//this class is only accessible inside the outer class
		class localInnerClass{
			String localInnerClassVar = "woah inner class variable!";
			
			public void printLocalVar()
			{
				System.out.println(localInnerClassVar);
			}
		}
		
		//this is really cool but would you ever use it
		localInnerClass lic = new localInnerClass();
		lic.printLocalVar();

	}

	public static class InnerClass {
		int innerNumber = 8;

		public void whatsUp() {
			System.out.println("What's up from the inner class");
		}
	}
	
	public  class InnerNonStaticClass {
		int innerNumber = 10;

		public void whatsUp() {
			System.out.println("What's up from the non static inner class");
		}
	}

}
