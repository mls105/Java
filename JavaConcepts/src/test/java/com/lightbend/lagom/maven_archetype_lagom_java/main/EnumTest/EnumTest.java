package com.lightbend.lagom.maven_archetype_lagom_java.main.EnumTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.lightbend.lagom.maven_archetype_lagom_java.main.Enums.DaysOfTheWeek;

public class EnumTest {
	
	@Test
	public void enumTest()
	{
		
		//do not need to instantiate enums
//		DaysOfTheWeek day = new DaysOfTheWeek()
		DaysOfTheWeek day =  DaysOfTheWeek.FRIDAY;
		assertTrue(day == DaysOfTheWeek.FRIDAY);

		assertEquals(DaysOfTheWeek.enumIndexFromInt(5), DaysOfTheWeek.FRIDAY);
		assertEquals(DaysOfTheWeek.bestDayOfTheWeekFromInt(100), DaysOfTheWeek.SATURDAY);
	}

}
