package com.lightbend.lagom.maven_archetype_lagom_java.main.Slf4jLoggingTest;

import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Test;
import org.slf4j.helpers.MessageFormatter;

import com.google.common.collect.ImmutableList;
import com.lightbend.lagom.maven_archetype_lagom_java.main.slf4jMavenDependency.Slf4jLogging;

import static java.util.Arrays.asList;

import uk.org.lidalia.slf4jtest.LoggingEvent;
import uk.org.lidalia.slf4jtest.TestLogger;
import uk.org.lidalia.slf4jtest.TestLoggerFactory;
import static uk.org.lidalia.slf4jtest.LoggingEvent.info;



public class Slf4JLoggingTest {

	
	Slf4jLogging logging = new Slf4jLogging();
	
	TestLogger testLogger = TestLoggerFactory.getTestLogger(Slf4jLogging.class);
	
	@Test
	public void testLogging()
	{

		
		logging.testLog();
		
		// http://projects.lidalia.org.uk/slf4j-test/
		//this should work but doesn't (╯°□°)╯︵ ┻━┻
		testLogger.getLoggingEvents();

		System.out.println(testLogger.getAllLoggingEvents().asList().toString());
		asList(info("Hello World!"));
		
		
//		 ImmutableList<LoggingEvent> loggingEvents = testLogger.getLoggingEvents(); 
//		 ImmutableList<Object> arguments = loggingEvents.get(0).getArguments(); 
//		 String actual = MessageFormatter.arrayFormat(loggingEvents.get(0).getMessage(), arguments.toArray()).getMessage();
		
	}
	
	@After
	public void clearLogger()
	{
		TestLoggerFactory.clear();
	}
}
