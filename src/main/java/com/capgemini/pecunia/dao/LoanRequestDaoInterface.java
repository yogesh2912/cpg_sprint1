package com.capgemini.pecunia.dao;

import com.capgemini.pecunia.dto.LoanRequest;
import com.capgemini.pecunia.exception.InvalidUserexception;

public interface LoanRequestDaoInterface {
	
	public boolean addLoanDetailsDao(LoanRequest loanBean) throws InvalidUserexception;

}
