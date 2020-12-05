package com.aartek.advice;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


//we have created custom annotation

@Target(ElementType.METHOD)//this denotes that the annotation(TrackExecutionTime) we created will target only at method level.
@Retention(RetentionPolicy.RUNTIME)//Indicates how long annotations with the annotated type are to be retained. 
public @interface TrackExecutionTime {

}
