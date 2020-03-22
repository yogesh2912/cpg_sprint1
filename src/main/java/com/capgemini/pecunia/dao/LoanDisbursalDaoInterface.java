package com.capgemini.pecunia.dao;

import java.util.List;

import com.capgemini.pecunia.dto.LoanRequest;

public interface LoanDisbursalDaoInterface {
	
	public List<LoanRequest> retrieveLoanListDao () throws Exception;

}
