package com.fonky.aop;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.fonky.aop.configuration.AopConfiguration;
import com.fonky.aop.dao.AccountDAO;
import com.fonky.aop.dao.MembershipDAO;
import com.fonky.aop.entity.Account;
import com.fonky.aop.service.TrafficFortuneService;

public class MainDemoApp {
	
	public static void main(String[] args) {
		//38.334 PointCut
		// read spring config java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfiguration.class);
		
		// get bean from spring
		AccountDAO accountDAO = context.getBean("accountDAO", AccountDAO.class);
		MembershipDAO membershipDAO = context.getBean("membershipDAO", MembershipDAO.class);
		TrafficFortuneService fortuneService = context.getBean("trafficFortuneService", TrafficFortuneService.class);
		
		accountDAO.addAccount();
		System.out.println();
		
		membershipDAO.addAccount();
		System.out.println();
		
		membershipDAO.addSillyMember();
		System.out.println();
		
		membershipDAO.addPlatiniumMember();
		System.out.println();
		
		accountDAO.addAccount(new Account("Chad", "Platinum"));
		System.out.println();
		
		accountDAO.addAccount(new Account("Andres", "Gold"), true);
		System.out.println();
		
		accountDAO.doWork();
		System.out.println();
		
		membershipDAO.goToSleep();
		System.out.println();
		
		accountDAO.getAccount();
		System.out.println();
		
		List<Account> accounts = accountDAO.findAccounts(false);
		System.out.println(accounts);
		System.out.println();
		
		try {
			List<Account> throwing = accountDAO.findAccounts(true);
			System.out.println(throwing);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println();
		
		String today = fortuneService.getFortune(false);
		System.out.println("My today Fortune is : " + today);
		
		String tomorrow = fortuneService.getFortune(true);
		System.out.println("My tomorrow Fortune is : " + tomorrow);
		
		System.out.println( "Finished");
		context.close();
	}

}
