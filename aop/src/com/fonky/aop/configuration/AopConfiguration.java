package com.fonky.aop.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.fonky.aop")
public class AopConfiguration {

	public AopConfiguration() {
		// TODO Auto-generated constructor stub
	}

}
