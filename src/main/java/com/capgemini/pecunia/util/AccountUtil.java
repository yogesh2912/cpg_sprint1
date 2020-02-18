package com.capgemini.pecunia.util;

import java.time.LocalDate;

import java.time.format.DateTimeFormatter;
import java.util.HashMap;

import java.util.Map;

import com.capgemini.pecunia.dto.Account;

//this class has a static Map which has accountId as key and Account Object as values.

public class AccountUtil {
	
	private static Map<Long,Account> mapOfAccounts=new HashMap<>();
	
	public AccountUtil() {
		
		DateTimeFormatter myFormat=DateTimeFormatter.ofPattern("dd MM yyyy");
		
		Account a1=new Account();
		a1.setAccountHolderName("Yogesh Upadhyay");
		a1.setBalance(1500.0);
		a1.setDateOfCreation(LocalDate.parse("12 12 2015",myFormat));
		
		mapOfAccounts.put(123456789632L,a1);
		
		Account a2=new Account();
		a2.setAccountHolderName("Shaswat");
		a2.setBalance(1200.0);
		a2.setDateOfCreation(LocalDate.parse("22 02 2013",myFormat));
		
		mapOfAccounts.put(182344628143L,a2);
		
		Account a3=new Account();
		a3.setAccountHolderName("Shubham");
		a3.setBalance(500.0);
		a3.setDateOfCreation(LocalDate.parse("29 12 2015",myFormat));
		
		mapOfAccounts.put(182344682342L,a3);
		
		Account a4=new Account();
		a4.setAccountHolderName("Madhu");
		a4.setBalance(800.0);
		a4.setDateOfCreation(LocalDate.parse("02 02 2018",myFormat));
		
		mapOfAccounts.put(451524682342L,a4);
		
		Account a5=new Account();
		a5.setAccountHolderName("Ashok");
		a5.setBalance(1700.0);
		a5.setDateOfCreation(LocalDate.parse("01 10 2015",myFormat));
		
	    mapOfAccounts.put(963524682342L,a5);
	
		
	}
	
	public Map<Long,Account> getMapOfAccount(){
		return mapOfAccounts;
	}
	

}

