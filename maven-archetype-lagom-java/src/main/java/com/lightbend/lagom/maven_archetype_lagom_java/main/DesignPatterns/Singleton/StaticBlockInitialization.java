package com.lightbend.lagom.maven_archetype_lagom_java.main.DesignPatterns.Singleton;

public class StaticBlockInitialization {

	private static StaticBlockInitialization theOnlyInstance = null;
	public static String runTimeMessage = "Exception occurred in creating singleton instance";

	/**
	 * exception handled added BUT the object is always created at run time
	 */
	private StaticBlockInitialization() {
		// private constructor to prevent instantiation from outside the class
	}

	// a static block is a set of instructions that is run only once when a class is
	// loaded into memory.
	// A static block is also called a static initialization block.
	// This is because it is an option for initializing or setting up the class at
	// run-time.
	static {

		// created a function so we can test it
		StaticBlockInit();
	}

	public static void StaticBlockInit() {

		try {
			theOnlyInstance = new StaticBlockInitialization();
		} catch (Exception e) {
			// I dont think java even lets the exception happen
			throw new RuntimeException(runTimeMessage);
		}

	}

	public static StaticBlockInitialization getInstance() {
		return theOnlyInstance;
	}

	
	
	/**
	 * Example of a DB connection using this pattern
	 * 
	 */
//	private static Connection con = null;
//
//	public static void StaticBlockInitExampleOfDBConnection() {
//
//		String url = "jdbc:mysql:// localhost:3306/org";
//		String user = "root";
//		String pass = "root";
//
//		try {
//			Class.forName("com.mysql.jdbc.Driver");
//			con = DriverManager.getConnection(url, user, pass);
//		} catch (Exception e) {
//			// I dont think java even lets the exception happen
//			throw new RuntimeException(runTimeMessage);
//		}
//
//	}
//
//	public static Connection getConnection() {
//		return con;
//	}

}
