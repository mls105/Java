package com.lightbend.lagom.maven_archetype_lagom_java.main.DesignPattern.CreationalDesignPattern.SingletonTest;

import java.lang.reflect.Constructor;

import org.junit.Test;

import com.lightbend.lagom.maven_archetype_lagom_java.main.DesignPatterns.CreationalDesignPattern.Singleton.EagerInitialization;

public class ReflectionSingletonTest {

	@Test
    public void destroySingletonWithReflection(){
        EagerInitialization instanceOne = EagerInitialization.getInstance();
        EagerInitialization instanceTwo = null;
        try {
            Constructor[] constructors = EagerInitialization.class.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                // This code will destroy the singleton pattern
                constructor.setAccessible(true);
                instanceTwo = (EagerInitialization) constructor.newInstance();
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(instanceOne.hashCode());
        System.out.println(instanceTwo.hashCode());
    }

}