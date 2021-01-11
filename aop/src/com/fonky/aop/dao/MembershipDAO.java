package com.fonky.aop.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {
	
	public void addAccount() {
		System.out.println(this.getClass() + ": Adding a Membership Account!!");
	}
	
	public void addSillyMember() {
		System.out.println(this.getClass() + ": Adding a Silly Membership Account!!");
	}
	
	public boolean addPlatiniumMember() {
		System.out.println(this.getClass() + ": Adding a Platinium Membership Account!!");
		return true;
	}
	
	public void goToSleep() {
		System.out.println(this.getClass() + ": I'm going to sleep now..");
	}
}
