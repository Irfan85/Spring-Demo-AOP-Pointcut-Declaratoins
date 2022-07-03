package com.example.aopdemo.dao;

import org.springframework.stereotype.Component;

import com.example.aopdemo.Account;

@Component
public class AccountDAO {
	public void addAccount() {
		System.out.println(getClass() + ": Adding an acount...");
	}
	
	public void addAccount(Account account) {
		System.out.println(getClass() + ": Adding an acount...");
	}
	
	public void addAccount(Account account, boolean isVip) {
		System.out.println(getClass() + ": Adding an acount...");
	}
}
