package com.capgemini.pecunia.dao;

import java.util.List;
import java.util.Map;

import com.capgemini.pecunia.dto.Account;
import com.capgemini.pecunia.dto.LoanRequest;
import com.capgemini.pecunia.exception.InvalidUserexception;
import com.capgemini.pecunia.util.AccountUtil;
import com.capgemini.pecunia.util.LoanRequestUtil;

public class LoanRequestDao {
	
	AccountUtil accountUtilObj=new AccountUtil();
	LoanRequestUtil loanUtilObj=new LoanRequestUtil();
	
	public boolean addLoanDetailsDao(LoanRequest loanBean) throws InvalidUserexception{
		
		Map<Long,Account> mapOfAccounts=accountUtilObj.getMapOfAccount();
		List<LoanRequest> listOfLoans=loanUtilObj.getListOfLoans();
		
		
		if(mapOfAccounts.containsKey(loanBean.getAccountId())) {
			boolean result=listOfLoans.add(loanBean);
			return result;
		}
		else {
			throw new InvalidUserexception("You are not a valid user.");
			//System.out.println("You are not a valid User");
			//return false;
		}
		
		
	}

}
