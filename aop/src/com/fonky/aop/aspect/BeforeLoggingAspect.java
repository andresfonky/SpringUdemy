package com.fonky.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class BeforeLoggingAspect {
	
	@Before("execution(public void addAccount())")
	public void addAccountAdvice() {
		System.out.println("======> Executig @Before advice on addAccount()");
	}
	
	@Before("execution(public void updateAccount())")
	public void updateAccountAdvice() {
		System.out.println("======> Executig @Before advice on updateAccount()");
	}
	
	@Before("execution(public void com.fonky.aop.dao.AccountDAO.addAccount())")
	public void accountDAOAddAccountAdvice() {
		System.out.println("======> Executig @Before advice on AccountDAO.addAccount()");
	}
	
	@Before("execution(public void add*())")
	public void addAnyAdvice() {
		System.out.println("======> Executig @Before advice on add*()");
	}
	
	@Before("execution(* add*())")
	public void anyReturnAdvice() {
		System.out.println("======> Executig @Before advice on any return add*()");
	}
	
	@Before("execution(* com.fonky.aop.dao.*.*(..))")
	public void anyMethodDAOPackageAdvice() {
		System.out.println("======> Executig @Before advice on any method in DAO Package");
	}
	
	@Before("execution(* add*(com.fonky.aop.entity.Account))")
	public void anyAddAccountParamAdvice() {
		System.out.println("======> Executig @Before advice on any method add*(Account)");
	}
	
	@Before("execution(* add*(com.fonky.aop.entity.Account, ..))")
	public void anyAddAccountBooleanParamAdvice() {
		System.out.println("======> Executig @Before advice on any method add*(Account, ..)");
	}
}
