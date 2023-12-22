package com.lightbend.lagom.maven_archetype_lagom_java.main.DataStructures.Linear;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.LinkedList;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Queue;

import org.junit.Test;


public class QueueTest {
	

	@Test
	public void queueTest()
	{
		//FIFO
		//Queue is a linear data structure.
		//Enqueue and dequeue O(1)
		//used in algorithms such as bredth first search
		Queue<Person> superMarket = new LinkedList<>();
		
		Person person1 = new Person("John", 21);
		Person person2 = new Person("David", 22);
		Person person3 = new Person("Mark", 20);
		
		superMarket.add(person1);
		superMarket.add(person2);
		superMarket.add(person3);
//		superMarket.offer(person99999); //use in replace of add when capacity has limits
		
		assertTrue(superMarket.peek().equals(person1));
		assertTrue(superMarket.size() == 3);
//		System.out.println(superMarket.poll().toString());
		assertTrue(superMarket.poll().equals(person1)); //remove the last item
		assertTrue(superMarket.size() == 2);
		assertFalse(superMarket.isEmpty());
//		assertTrue(superMarket.contains(person1)); 
		
		
		
		
		//Element with highest priority first
		//Priority Queue is an extension of Queue with priority factor embedded.
		//Enqueue and dequeue O(log n) using Binary heaps
		//used in algorithms such as  Dijkstra’s Algorithm, Prim’s Algorithms, CPU Scheduling.
		Queue<Person> pqSuperMarket = new PriorityQueue<>();
		
		
	}
	
	
	/**
	 * Inner class to help show off queues. 
	 * 
	 */
	public static class Person //TODO: I can't remember why this needs to be static!
	{
		String Name;
		int age;
		
		@Override
		public String toString() {
			return "Person [Name=" + Name + ", age=" + age + "]";
		}
		@Override
		public int hashCode() {
			return Objects.hash(Name, age);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Person other = (Person) obj;
			return Objects.equals(Name, other.Name) && age == other.age;
		}
		public Person(String name, int age) {
			this.Name = name;
			this.age = age;
		}
		public String getName() {
			return this.Name;
		}
		public void setName(String name) {
			this.Name = name;
		}
		public int getAge() {
			return this.age;
		}
		public void setAge(int age) {
			this.age = age;
		}
	}

}
