package com.capgemini.pecunia.service;

import com.capgemini.pecunia.dao.LoanRequestDao;

import com.capgemini.pecunia.dto.LoanRequest;
import com.capgemini.pecunia.exception.InvalidAccountIdException;
import com.capgemini.pecunia.exception.InvalidAmountException;
import com.capgemini.pecunia.exception.InvalidCreditScoreException;
import com.capgemini.pecunia.exception.InvalidRoiException;
import com.capgemini.pecunia.exception.InvalidTenureException;
import com.capgemini.pecunia.exception.InvalidUserexception;

public class LoanRequestService implements LoanRequestServiceInterface{
	LoanRequestDao loanObj=new LoanRequestDao();
	
	//this function validates different conditions on loan request 
	public boolean addLoanDetailsService (LoanRequest loanBean) throws Exception {
	
			if(loanBean==null) {
				throw new NullPointerException();
			}
			

			long accountId=loanBean.getAccountId();
			String str=Long.toString(accountId);
			
			if((str.length()!=12)) {
				throw new InvalidAccountIdException("Account Id should be of 12 digits");
			}
			if(!(loanBean.getAmount() >= 1000 && loanBean.getAmount()<=10000000)) {
				throw new InvalidAmountException("Amount should be between 1000 and 10000000");
			}
			if(!(loanBean.getTenure()>=12 && loanBean.getTenure()<=240)) {
				throw new InvalidTenureException("Tenure should be between 12 and 240");
			}
			if(!(loanBean.getCreditScore()>=100 && loanBean.getCreditScore()<=999)) {
				throw new InvalidCreditScoreException("Credit Score should be between 100 and 999");
			}
			if(!(loanBean.getRoi()>=4 && loanBean.getRoi()<=15)) {
				throw new InvalidRoiException("Rate of interest sholud be between 4 and 15");
			}
			else {
				try {
					return loanObj.addLoanDetailsDao(loanBean);
				}
				catch(InvalidUserexception ee) {
					throw ee;
				}
				
				
			}
			
	
			
	}
}
