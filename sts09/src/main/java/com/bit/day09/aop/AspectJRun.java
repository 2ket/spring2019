package com.bit.day09.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AspectJRun {
//	@Before("execution(* com.bit.day09.model.Day09Dao.*Bean(..))")
	public void befor(JoinPoint joinPoint) {
		System.out.println("before run...");
	}
	
	@AfterReturning(value="execution(* com.bit.day09.model.Day09Dao.func*(..))", returning="obj")
	public void after(Object obj) {
		System.out.println("after run...:"+obj);
	}
	
	public void around(ProceedingJoinPoint joinPoint) {
		
	}
}
