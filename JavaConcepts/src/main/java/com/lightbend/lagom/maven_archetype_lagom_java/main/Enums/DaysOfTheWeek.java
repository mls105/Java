package com.lightbend.lagom.maven_archetype_lagom_java.main.Enums;

//extends enum automatically
public enum DaysOfTheWeek{
	
	//ctrl shift x = eclipse shortcut to all caps
	SUNDAY(70, 0),
	MONDAY(10, 1),
	TUESDAY(30, 2),
	WEDNESDAY(50, 3),
	THURSDAY(60, 4),
	FRIDAY(80, 5),
	SATURDAY(100, 6);
	
	//make it final so people don't change it
	private final int bestDayOfTheWeek;
	private final int enumIndex;
	
	DaysOfTheWeek(int bestDayOfTheWeek, int enumIndex){
		this.bestDayOfTheWeek = bestDayOfTheWeek;
		this.enumIndex = enumIndex;
	}
	
	public static DaysOfTheWeek bestDayOfTheWeekFromInt(int bestDayOfTheWeek)
	{
		for(DaysOfTheWeek enumType : DaysOfTheWeek.values())
		{
			if(enumType.bestDayOfTheWeek == bestDayOfTheWeek)
			{
				return enumType;
			}
		}
		throw new IllegalArgumentException(String.format("%s is not valid.", bestDayOfTheWeek));
	}
	
	public static DaysOfTheWeek enumIndexFromInt(int enumIndex)
	{
		for(DaysOfTheWeek enumType : DaysOfTheWeek.values())
		{
			if(enumType.enumIndex == enumIndex)
			{
				return enumType;
			}
		}
		throw new IllegalArgumentException(String.format("%s is not valid.", enumIndex));
	}
	
	public int getBestDayOfTheWeek()
	{
		return bestDayOfTheWeek;
	}
	
	public int getEnumIndex()
	{
		return enumIndex;
	}
}
