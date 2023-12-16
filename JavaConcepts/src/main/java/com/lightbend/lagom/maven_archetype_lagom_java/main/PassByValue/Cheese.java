package com.lightbend.lagom.maven_archetype_lagom_java.main.PassByValue;

public class Cheese {
	private int levelOfStinkiness;
	
	public int getLevelOfStinkiness()
	{
		return levelOfStinkiness;
	}
	
	public void setLevelOfStinkiness(int levelOfStinkiness)
	{
		this.levelOfStinkiness = levelOfStinkiness;
	}

}
