package com.example.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DemoLoginAspect {
	// Only works for addAccount() method located in AccountDAO class
	@Before("execution(public void com.example.aopdemo.dao.AccountDAO.addAccount())")		
	public void beforeAddAccountAdvice() {
		System.out.println("\n ***** This executes before calling addAccount() method");
	}

	// Works for any method that starts with add with return type of void
	@Before("execution(void add*())")		
	public void beforeAllAddAdvice() {
		System.out.println("\n ***** This executes before calling any method that starts with add");
	}
	
	// Works for addAccount method that takes an Account object as parameter
	@Before("execution(* add*(com.example.aopdemo.Account))")
	public void beforeAddAccountWithAccountParamAdvice() {
		System.out.println("\n ***** This executes before calling an addAccount() method that takes an Account object as parameter");
	}
	
	// Works for addAccount method that takes an Account object as parameter followed by any number of other parameters
	@Before("execution(* add*(com.example.aopdemo.Account, ..))")
	public void beforeAddAccountWithAccountWithOtherParamsAdvice() {
		System.out.println("\n ***** This executes before calling an addAccount() method that takes an Account object followed by any number of other parameters");
	}
	
	// Works for all methods in a specific package located in any class with any parameter(s)
	@Before("execution(* com.example.aopdemo.dao.*.*(..))")
	public void beforeAnyMethodOfAPackage() {
		System.out.println("\n ***** This executes before calling any method of com.example.aopdemo.dao package with any return type and parameters");
	}

}

