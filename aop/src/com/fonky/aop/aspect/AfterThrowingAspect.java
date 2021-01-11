package com.fonky.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(6)
public class AfterThrowingAspect {
	
	@AfterThrowing(
			pointcut="execution(* com.fonky.aop.dao.AccountDAO.findAccounts(..))",
			throwing="exc")
	public void afterReturningFindAccounts(JoinPoint joinpoint, Throwable exc) {
		System.out.println("======> Executig @AfterThrowing in " + joinpoint.getSignature().toShortString() + ", exception is: " + exc);

		
	}
}
