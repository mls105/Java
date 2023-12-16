package com.lightbend.lagom.maven_archetype_lagom_java.main.Static;

public class StaticBlock {
    // static variable
    static int a = 10;
    static int b;
    private static int  staticCount = 0;
    private static int  constructorCount = 0;
     
	// Case 1: Static variable
    static int i;
    // Case 2: non-static variables
    int j;
 
    // Case 3: Static block
    // Start of static block
    static
    {
        i = 10;
        System.out.println("static block called ");
        staticCount++; //track how many times static is executed
    }
    
    StaticBlock()
    {
    	System.out.println("Constuctor called");
    	constructorCount++;
    }
    
    public static int getStaticCount() {
		return staticCount;
	}

	public static void setStaticCount(int staticCount) {
		StaticBlock.staticCount = staticCount;
	}

	public static int getConstructorCount() {
		return constructorCount;
	}

	public static void setConstructorCount(int constructorCount) {
		StaticBlock.constructorCount = constructorCount;
	}
}
