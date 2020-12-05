package com.aartek.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AOPExampleTest {

	//execution(* basePackage.Allpackages.Allclasses.Allmethods(any N args)
	@Before("execution(* com.aartek.controller.ProductController.getAllRecords(..) )")
	public void before(JoinPoint jp) {
	System.out.println("Before Called");
	System.out.println(jp.getSignature().getName());
	}
	
	@After("execution(* com.aartek.controller.ProductController.getAllRecords(..) )")
	public void after(JoinPoint jp) {
		System.out.println("After Called");
		System.out.println(jp.getSignature().getName());
		}
		
}
/*
Spring AOP enables Aspect-Oriented Programming in spring applications.
In AOP, aspects enable the modularization of concerns such as transaction
management, logging or security that cut across multiple types and objects
(often termed crosscutting concerns).
*/
/*
An important term in AOP is advice. It is the action taken by an aspect at
a particular join-point.

Joinpoint is a point of execution of the program, such as the execution of a
method or the handling of an exception. In Spring AOP, a joinpoint always 
represents a method execution.

Pointcut is a predicate or expression that matches join points.

Advice is associated with a pointcut expression and runs at any join point
matched by the pointcut.

Spring uses the AspectJ pointcut expression language by default.
*/
/*
There are five types of advice in spring AOP.

Before advice: Advice that executes before a join point, but which does not
have the ability to prevent execution flow proceeding to the join point 
(unless it throws an exception).

After returning advice: Advice to be executed after a join point completes 
normally: for example, if a method returns without throwing an exception.

After throwing advice: Advice to be executed if a method exits by throwing
an exception.

After advice: Advice to be executed regardless of the means by which a join
point exits (normal or exceptional return).

Around advice: Advice that surrounds a join point such as a method invocation.
This is the most powerful kind of advice. Around advice can perform custom behavior
before and after the method invocation. It is also responsible for choosing whether
to proceed to the join point or to shortcut the advised method execution by returning
its own return value or throwing an exception.
*/		