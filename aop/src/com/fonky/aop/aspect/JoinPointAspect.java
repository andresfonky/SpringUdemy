package com.fonky.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(100)
public class JoinPointAspect {
	
	@Before("com.fonky.aop.aspect.PointcutDefinitions.forDAOPackage()")
	public void printMethod(JoinPoint joinpoint) {
		System.out.println("======> Executig JoinPoint Method: " + joinpoint.getSignature().getName());
	
		Object[] args = joinpoint.getArgs();
		
		for(Object o: args) {
			System.out.println("        - " + o);
		}
	}
}
