package com.lightbend.lagom.maven_archetype_lagom_java.main.StackOverflowQuestions;

public class Date {
	int year; // 1900 to 2100
	int month; // 1 to 12
	int day; // 1 to 31

	public Date(int year, int month, int day) {

		if (year < 1900 || year > 2100) {
			throw new IllegalArgumentException("Year is out of range. Valid range is [1900-2100].");
		} else {
			this.year = year;
		}

		if (month < 1 || month > 12) {
			throw new IllegalArgumentException("Month is out of range. Valid range is [1-12].");
		} else {
			this.month = month;
		}

		if (day < 1 || day > 31) {
			throw new IllegalArgumentException("Day is out of range. Valid range is [1-31].");
		} else {
			this.month = month;
		}
	}
}
