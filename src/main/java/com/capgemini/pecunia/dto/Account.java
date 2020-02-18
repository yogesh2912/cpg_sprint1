package com.capgemini.pecunia.dto;

import java.time.LocalDate;

public class Account {
	
	private double balance;
	private String accountHolderName;
	private LocalDate dateOfCreation;
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public LocalDate getDateOfCreation() {
		return dateOfCreation;
	}
	public void setDateOfCreation(LocalDate dateOfCreation) {
		this.dateOfCreation = dateOfCreation;
	}
	

	

}
