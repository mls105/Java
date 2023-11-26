package com.lightbend.lagom.maven_archetype_lagom_java.main.PrimitiveTypes;

public class PrimitiveDataTypes {
	
	/** -128 to 127 - 1 byte = 8 bits */
	public byte myByte = 12;
	
	/** -32,768 to 32,767 - 2 bytes = 16 bits never use this really */
	short myShort = 1234;
	
	/** -2,147,483,648 to 2,147,483647 - 4 bytes */
	int myInt = 2837;
	
	/* -9,223,372,036,854,775,808 to -9,223,372,036,854,775,807 - 8 bytes */
	long myLongWithL = 2147483648l;
	long myLongWithOutL = 2147483647;
	
	/** about 6 decimal places */
	float myFloat = 6.3f; //java assumes double

	/** about 15 decimal places */
	double mydouble = 45.213434;
	
	//true or false
	boolean myBoolean = false;
	boolean morethan1000 = (myInt > 1000);
	
	//one character
	char myChar = 'W';
}
