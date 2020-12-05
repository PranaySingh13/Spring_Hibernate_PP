package com.aartek.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;

@Aspect
@Component
public class CentralizedLoggingAdvice {

	Logger log=LoggerFactory.getLogger(CentralizedLoggingAdvice.class);
	
	//execution(* basePackage.Allpackages.Allclasses.Allmethods(any N args)
	@Pointcut(value="execution(* com.aartek.*.*.*(..))")
	public void myPointCut() {
		
	}
	
	@Around("myPointCut()")
	public Object applicationLogger(ProceedingJoinPoint pjp) throws Throwable {
	
		ObjectMapper mapper=new ObjectMapper(); //this will convert array object into JSON Format
		String methodName=pjp.getSignature().getName();//To get the Method Name
		String className=pjp.getTarget().getClass().toString();//To get the Class Name
	
		Object[] array=pjp.getArgs();
		log.info("Method Invoked = "+className+" : "+methodName+"()"+"arguments :"+mapper.writeValueAsString(array));
		Object object=pjp.proceed();
		log.info(className+" : "+methodName+"()"+"Response :"+mapper.writeValueAsString(array));
		return object;
	}
}
