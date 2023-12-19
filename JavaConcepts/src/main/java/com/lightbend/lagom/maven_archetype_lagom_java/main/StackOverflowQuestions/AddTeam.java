package com.lightbend.lagom.maven_archetype_lagom_java.main.StackOverflowQuestions;

public class AddTeam {
	
	public String sanitize(String string) {

	    String regex = "[^a-zA-Z0-9\\s]";
	    return string.replaceAll(regex, "");
	}

}
