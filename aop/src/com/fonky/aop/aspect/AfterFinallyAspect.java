package com.fonky.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(4)
public class AfterFinallyAspect {
	
	@After("com.fonky.aop.aspect.PointcutDefinitions.forDAOPackage()")
	public void AfterReturningDAO(JoinPoint join) {
		System.out.println("======> Executig @After (finally) forDAOPackage on method: " + join.getSignature().toShortString());
	}
}
