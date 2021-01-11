package com.fonky.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class PointcutAspect {

	@Before("com.fonky.aop.aspect.PointcutDefinitions.forDAOPackage()")
	public void anyMethodDAOPackageAdvice() {
		System.out.println("======> Executig Pointcut forDAOPackage");
	}
	
	@Before("com.fonky.aop.aspect.PointcutDefinitions.forDAOPackage()")
	public void performApiAnalytics() {
		System.out.println("======> Executig Pointcut forDAOPackage - API Analytics");
	}

	@Before("com.fonky.aop.aspect.PointcutDefinitions.forDAOPackage() && !(com.fonky.aop.aspect.PointcutDefinitions.forDAOPackageGet() || com.fonky.aop.aspect.PointcutDefinitions.forDAOPackageSet())")
	public void anyMethodDAOPackageAdviceExceptGetAndSet() {
		System.out.println("======> Executig Pointcut forDAOPackage except Getters and Setters");
	}
}
