package com.lightbend.lagom.maven_archetype_lagom_java.main.StackOverflowQuestionsTest;

import org.junit.Test;

import com.lightbend.lagom.maven_archetype_lagom_java.main.StackOverflowQuestions.Date;

public class DateTest {
	
    @Test
    public void dateTest()
    {


    	Date validDate = new Date(1900, 2, 30);
    	Date invalidYear = new Date(1899, 1, 30);
    	Date invalidMonth = new Date(1900, -1, 3);
    	Date invalidDaye = new Date(1900, 8, 32);
    }
}
