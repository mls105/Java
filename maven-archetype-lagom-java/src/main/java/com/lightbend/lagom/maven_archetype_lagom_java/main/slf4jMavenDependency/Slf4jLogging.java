package com.lightbend.lagom.maven_archetype_lagom_java.main.slf4jMavenDependency;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Slf4jLogging {
	
	public static String logString = "Hey look at me I'm logging this";
	public static final Logger log = LoggerFactory.getLogger(Slf4jLogging.class);
	
	public void testLog()
	{
		log.info(logString);
	}


}
