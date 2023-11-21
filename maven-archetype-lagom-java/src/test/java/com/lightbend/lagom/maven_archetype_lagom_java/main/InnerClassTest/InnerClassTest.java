package com.lightbend.lagom.maven_archetype_lagom_java.main.InnerClassTest;

import org.junit.Test;

import com.lightbend.lagom.maven_archetype_lagom_java.main.InnerClass.OuterClass;

public class InnerClassTest {

	
	@Test
	public void testInnerclass()
	{
		OuterClass outer = new OuterClass();
		outer.heythere();
		
		//how you would have to make the inner class if it wasn't static
//		OuterClass.InnerClass inner = outer.new InnerClass();
		OuterClass.InnerClass inner = new OuterClass.InnerClass();
		inner.whatsUp();
				
	}
}
