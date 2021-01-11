package com.fonky.aop.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.fonky.aop.entity.Account;

@Component
public class AccountDAO {
	
	private Account account;
	
	public List<Account> findAccounts(boolean tripWire){
		System.out.println(this.getClass() + ": Finding Accounts!!");
		
		if(tripWire) {
			throw new RuntimeException("No soup for you!!");
		}

		List<Account> accounts = new ArrayList<>();
		
		accounts.add(account);
		accounts.add(new Account("John", "Silver"));
		accounts.add(new Account("Chad", "Platinum"));
		accounts.add(new Account("Luca", "Gold"));

		return accounts;
	}

	public void addAccount() {
		System.out.println(this.getClass() + ": Adding an Account!!");
	}
	
	public void addAccount(Account a) {
		System.out.println(this.getClass() + ": Adding a account " + a + "!");
	}
	
	public void addAccount(Account account, boolean vip) {
		System.out.println(this.getClass() + ": Adding vip (" + vip +") account " + account + "!");
		this.account = account;
	}
	
	public boolean doWork() {
		System.out.println(this.getClass() + ": doWork()!!");
		return false;
	}
	
	public Account getAccount() {
		System.out.println(this.getClass() + ": Get Account: " + this.account);
		return this.account;
	}

	public void setAccount(Account account) {
		System.out.println(this.getClass() + ": Set Account");
		this.account = account;
	}
}
