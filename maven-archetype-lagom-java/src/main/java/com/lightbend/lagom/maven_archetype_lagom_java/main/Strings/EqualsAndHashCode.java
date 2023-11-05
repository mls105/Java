package com.lightbend.lagom.maven_archetype_lagom_java.main.Strings;

import java.util.Objects;

public class EqualsAndHashCode {
	String s;
	int someInt;
	
	
	@Override
	public String toString()
	{
		//without over riding it will print the class name @ hash value
		return s + " " + someInt;
	}
	

	@Override
	public int hashCode() {
		return Objects.hash(s, someInt);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EqualsAndHashCode other = (EqualsAndHashCode) obj;
		return Objects.equals(s, other.s) && someInt == other.someInt;
	}


//	public boolean equals(EqualsAndHashCode equalsAndHashCode)
//	{
//		if(this.s.equals(equalsAndHashCode.s) && this.someInt == equalsAndHashCode.someInt)
//		{
//			return true;
//		}
//		else 
//		{
//			return false;
//		}
//	}
	
}
