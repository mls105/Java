package com.lightbend.lagom.maven_archetype_lagom_java.main.Slf4jLoggingTest;

import com.lightbend.lagom.maven_archetype_lagom_java.main.slf4jMavenDependency.*;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.slf4j.LoggerFactory;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.read.ListAppender;


/**
 * Could cause issue with multiple slf4j bindings https://www.baeldung.com/slf4j-classpath-multiple-bindings
 * @author 18603
 *
 */
public class Slf4jLoggingTestWithListener {
	
	    @Test
	    public void testLogging()
	    {
	        // get Logback Logger 
	        Logger fooLogger = (Logger) LoggerFactory.getLogger(Slf4jLogging.class);

	        // create and start a ListAppender
	        ListAppender<ILoggingEvent> listAppender = new ListAppender<>();
	        listAppender.start();

	        // add the appender to the logger
	        fooLogger.addAppender(listAppender);

	        // call method under test
	        Slf4jLogging log = new Slf4jLogging();

	        log.testLog();
	        
	        
	        // JUnit assertions
	        List<ILoggingEvent> logsList = listAppender.list;
	        assertEquals(Slf4jLogging.logString, logsList.get(0)
	                                      .getMessage());
	    }
	}
