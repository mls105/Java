package com.lightbend.lagom.maven_archetype_lagom_java.main;

import com.lightbend.lagom.maven_archetype_lagom_java.main.StackOverflowQuestions.TabbedPaneExample;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

    	//Concepts are all testing/shown off in the src/main and/or src/test
        
    	
    	//TODO Make a test with the eclipse shortcuts that are awesome
        //eclipse shorcut type sysout (ctr + space + enter) for prtintln 
    	
    	java.awt.EventQueue.invokeLater( () -> TabbedPaneExample.createAndShowGUI() );
       
    }
    

}
