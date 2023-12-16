package com.lightbend.lagom.maven_archetype_lagom_java.main.Annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


/**
 * @Target will set what you can use the @Interface on. 
 * Not allowed for variables or functions. Must be a class.
 * 
 * 
 * Type = classes
 * Method = method amazing!
 * 
 * 
 * 
 *@Target({ElementType.METHOD, ElementType.TYPE}) // can put multiple
 *@Retention(RetentionPolicy.CLASS) // keeps through compilation but gone at run time
 *@Retention(RetentionPolicy.SOURCE) // gone before compilation. like suppress warnings
 * 
 * 
 * @author 18603
 *
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME) //keep this annotation around through running of the program. so other things can use it will it's running
public @interface VeryStinky{

}
