package com.lightbend.lagom.maven_archetype_lagom_java.main.DesignPattern.CreationalDesignPattern.SingletonTest;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.lightbend.lagom.maven_archetype_lagom_java.main.DesignPatterns.CreationalDesignPattern.Singleton.LazyInitialization;

public class LazyInitializationTest {
	
	@Test
	public void staticBlockInitializationTest() {
		LazyInitialization lazyInitialization = LazyInitialization.getInstance();
		LazyInitialization lazyInitialization2 = LazyInitialization.getInstance();

		assertTrue(lazyInitialization == lazyInitialization2); // memory location is the same!
	}
	
	//test would fail but it will vary
//	@Test
//	public void checkThreadUnSafeSingleton() throws InterruptedException {
//		
//		
//	    int threadsAmount = 100;
//	    Set<LazyInitialization> singletonSet = Collections.newSetFromMap(new ConcurrentHashMap<>());
//
//	    ExecutorService executorService = Executors.newFixedThreadPool(threadsAmount);
//
//	    for (int i = 0; i < threadsAmount; i++) {
//	        executorService.execute(() -> {
//	        	LazyInitialization singleton = LazyInitialization.getInstance();
//	            singletonSet.add(singleton);
//	        });
//	    }
//
//	    executorService.shutdown();
//	    executorService.awaitTermination(1, TimeUnit.MINUTES);
//
//	    Assert.assertEquals(1, singletonSet.size());
//	}
}
