package com.fonky.aop.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class PointcutDefinitions {
	
	@Pointcut("execution(* com.fonky.aop.dao.*.*(..))")
	protected void forDAOPackage() {
	}
	
	@Pointcut("execution(* com.fonky.aop.dao.*.get*(..))")
	protected void forDAOPackageGet() {
	}
	
	@Pointcut("execution(* com.fonky.aop.dao.*.set*(..))")
	protected void forDAOPackageSet() {
	}
}
