package com.aartek.advice;



import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ExecutionTimeTrackerAdvice {

	Logger logger=LoggerFactory.getLogger(ExecutionTimeTrackerAdvice.class);
	
	@Around("@annotation(com.aartek.advice.TrackExecutionTime)")//calling of custom annotation created for tracking time execution for methods
	public Object trackTime(ProceedingJoinPoint pjp) throws Throwable {
	long startTime=System.currentTimeMillis();
	Object obj=pjp.proceed();//it will behave as after returning advice
	long endTime=System.currentTimeMillis();
	logger.info("Method Name :"+pjp.getSignature()+"Time taken to Execute :"+(endTime-startTime)+"milliseconds");
	return obj;
	}
}
