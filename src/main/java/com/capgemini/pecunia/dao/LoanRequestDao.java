package com.capgemini.pecunia.dao;

import java.util.List;
import java.util.Map;

import com.capgemini.pecunia.dto.Account;
import com.capgemini.pecunia.dto.LoanRequest;
import com.capgemini.pecunia.exception.InvalidUserexception;
import com.capgemini.pecunia.util.AccountUtil;
import com.capgemini.pecunia.util.LoanRequestUtil;

public class LoanRequestDao implements LoanRequestDaoInterface  {
	
	AccountUtil accountUtilObj=new AccountUtil();
	LoanRequestUtil loanUtilObj=new LoanRequestUtil();
	
	//this function checks if accountId of loan request has a valid account or not does the processing accordingly.
	public boolean addLoanDetailsDao(LoanRequest loanBean) throws InvalidUserexception{
		
		Map<Long,Account> mapOfAccounts=AccountUtil.getMapOfAccount();
		List<LoanRequest> listOfLoans=loanUtilObj.getListOfLoans();
		
		
		if(mapOfAccounts.containsKey(loanBean.getAccountId())) {
			return listOfLoans.add(loanBean);
		}
		else {
			throw new InvalidUserexception("You are not a valid user.");
		}
		
		
	}

}
