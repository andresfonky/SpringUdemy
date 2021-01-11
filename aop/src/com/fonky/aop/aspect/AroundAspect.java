package com.fonky.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(8)
public class AroundAspect {
	
	@Around("execution(* com.fonky.aop.service.*.getFortune(..))")
	public Object aroundGetFortune(ProceedingJoinPoint join) throws Throwable {
		System.out.println("======> Executig @Around for getFortune on method: " + join.getSignature().toShortString());
		
		long begin = System.currentTimeMillis();
		
		Object result = null;
		
		try {
			result = join.proceed();
		} catch (Exception e) {
			System.out.println("       - " + e.getMessage());
			result = "Major accident! But no worries, your private helicopter is on the way";
			// Rethrow exception
			//throw e;
		}
		
		long end = System.currentTimeMillis();
		
		long duration = end - begin;
		
		System.out.println("       - Duration: " + duration/1000.0 + " seconds");

		return result;
	}
}
