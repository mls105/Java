package com.lightbend.lagom.maven_archetype_lagom_java.main.DesignPatterns.CreationalDesignPattern.Singleton;

import java.io.Serializable;

public class SerializedSingleton implements Serializable {

    private static final long serialVersionUID = -7604766932017737115L;

    private SerializedSingleton(){}

    private static class SingletonHelper {
        private static final SerializedSingleton instance = new SerializedSingleton();
    }

    public static SerializedSingleton getInstance() {
        return SingletonHelper.instance;
    }
    
    
    
    /**
     * The readResolve method allows a class to replace/resolve the object read from the stream before 
     * it is returned to the caller. By implementing the readResolve method, a class can directly control 
     * the types and instances of its own instances being deserialized. 
     * 
     * The readResolve method is called when ObjectInputStream has read an object from the stream and 
     * is preparing to return it to the caller. ObjectInputStream checks whether the class of the object 
     * defines the readResolve method. If the method is defined, the readResolve method is called to 
     * allow the object in the stream to designate the object to be returned. The object returned should 
     * be of a type that is compatible with all uses. If it is not compatible, a ClassCastException will 
     * be thrown when the type mismatch is discovered.
     * 
     * 
     * @return
     */
    protected Object readResolve() {
        return getInstance();
    }


}
