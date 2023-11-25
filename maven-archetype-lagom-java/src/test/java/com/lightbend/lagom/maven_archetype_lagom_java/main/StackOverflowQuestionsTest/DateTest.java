package com.lightbend.lagom.maven_archetype_lagom_java.main.StackOverflowQuestionsTest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.lightbend.lagom.maven_archetype_lagom_java.main.StackOverflowQuestions.Date;

public class DateTest {

	@Rule
	public final ExpectedException exception = ExpectedException.none();

	@Test
	public void dateTest() {

		Date validDate = new Date(1900, 2, 30);
		exception.expect(IllegalArgumentException.class);
		Date invalidYear = new Date(1899, 1, 30);
		exception.expect(IllegalArgumentException.class);
		Date invalidMonth = new Date(1900, -1, 3);
		exception.expect(IllegalArgumentException.class);
		Date invalidDay = new Date(1900, 8, 32);
	}
}
