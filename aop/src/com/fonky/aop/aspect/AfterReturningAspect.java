package com.fonky.aop.aspect;

import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.fonky.aop.entity.Account;

@Aspect
@Component
@Order(5)
public class AfterReturningAspect {
	
	@AfterReturning(
			pointcut="execution(* com.fonky.aop.dao.AccountDAO.findAccounts(..))",
			returning="result")
	public void afterReturningFindAccounts(JoinPoint joinpoint, List<Account> result) {
		System.out.println("======> Executig @AfterReturning FindAccounts result is: " + result);

		convertAccountNamestoUpperCase(result);
	}

	@AfterReturning(
			pointcut="com.fonky.aop.aspect.PointcutDefinitions.forDAOPackage()",
			returning="result")
	public void AfterReturningDAO(JoinPoint joinpoint, Object result) {
		System.out.println("======> Executig @AfterReturning forDAOPackage in method" + joinpoint.getSignature().toShortString() + " with result is: " + result);
	}
	
	private void convertAccountNamestoUpperCase(List<Account> result) {
		for(Account account: result) {
			String upper = account.getName().toUpperCase();
			account.setName(upper);
		}
	}
}
