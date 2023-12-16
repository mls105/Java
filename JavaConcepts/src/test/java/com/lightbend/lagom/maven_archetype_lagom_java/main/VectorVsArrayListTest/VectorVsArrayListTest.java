package com.lightbend.lagom.maven_archetype_lagom_java.main.VectorVsArrayListTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

import org.junit.Test;

//import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
//import org.junit.jupiter.api.Order;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.TestMethodOrder;
//
//@TestMethodOrder(OrderAnnotation.class)
public class VectorVsArrayListTest {

	private int size = 10000000;
	long start = 0;
	long end = 0;
	

	@Test
//	@Order(1)
	public void arrayListTimedTest() {

		/** Array List */
		List<Integer> arrayList = new ArrayList<>();
		start = System.currentTimeMillis();
		for (int i = 0; i < size; i++) {
			arrayList.add(i);
		}
		end = System.currentTimeMillis();
		System.out.println("Added " + size + " elements to array list: " + (end - start) + "ms");

	}

	@Test
	public void vectorTimedTest() {

		/** Vector */
		List<Integer> vector = new Vector<>();
		start = System.currentTimeMillis();
		for (int i = 0; i < size; i++) {
			vector.add(i);
		}
		end = System.currentTimeMillis();
		System.out.println("Added " + size + " elements to vector: " + (end - start) + "ms");
	}
	

	/**
	 * array list is not synchronized!!! not thread safe!!! 
	 * 
	 * @throws InterruptedException
	 */
	@Test
	public void multiThreadedArrayListTimedTest() throws InterruptedException {

		/** Multi-Threaded Array List */
		List<Integer> multiThreadedArrayList = new ArrayList<>();
		start = System.currentTimeMillis();

		Thread t1 = new Thread(() -> {
			for (int i = 0; i < size; i++) {
				multiThreadedArrayList.add(i);
			}

		});

		Thread t2 = new Thread(() -> {
			for (int i = 0; i < size; i++) {
				multiThreadedArrayList.add(i);
			}

		});
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		end = System.currentTimeMillis();

		System.out.println("Added " + size + " elements to multiThreadedArrayList: " + (end - start) + "ms");
		System.out.println("multiThreadedArrayList size is " + multiThreadedArrayList.size());
	}
	
	
	@Test
	public void multiThreadedArrayListThreadSafe() throws InterruptedException {

		/** Multi-Threaded Array List */
		List<Integer> multiThreadedArrayList = Collections.synchronizedList(new ArrayList<>()); //creates a wrapper around your array list
		start = System.currentTimeMillis();

		Thread t1 = new Thread(() -> {
			for (int i = 0; i < size; i++) {
				multiThreadedArrayList.add(i);
			}

		});

		Thread t2 = new Thread(() -> {
			for (int i = 0; i < size; i++) {
				multiThreadedArrayList.add(i);
			}

		});
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		end = System.currentTimeMillis();

		System.out.println("Added " + size + " elements to multiThreadedArrayList: " + (end - start) + "ms");
		System.out.println("multiThreadedArrayList size is " + multiThreadedArrayList.size());
	}
	
	
	@Test
	public void multiThreadedVecotrTimedTest() throws InterruptedException {

		/** Multi-Threaded Array List */
		List<Integer> multiThreadeVector = new Vector<>();
		start = System.currentTimeMillis();

		Thread t1 = new Thread(() -> {
			for (int i = 0; i < size; i++) {
				multiThreadeVector.add(i);
			}

		});

		Thread t2 = new Thread(() -> {
			for (int i = 0; i < size; i++) {
				multiThreadeVector.add(i);
			}

		});
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		end = System.currentTimeMillis();

		System.out.println("Added " + size + " elements to multiThreadedVector: " + (end - start) + "ms");
		System.out.println("multiThreadeVector size is " + multiThreadeVector.size());
	}

}
