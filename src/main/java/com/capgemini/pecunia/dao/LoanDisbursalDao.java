package com.capgemini.pecunia.dao;

import java.util.List;

import com.capgemini.pecunia.dto.LoanRequest;
import com.capgemini.pecunia.exception.NoLoanRequestException;
import com.capgemini.pecunia.service.LoanDisbursalService;
import com.capgemini.pecunia.util.LoanRequestUtil;

public class LoanDisbursalDao implements LoanDisbursalDaoInterface{
	
	LoanRequestUtil loanUtil=new LoanRequestUtil();
	
	LoanDisbursalService loanObj =new LoanDisbursalService();
	
	
	//this function retrieve list of loan request from util and pass it to the service layer.
	public List<LoanRequest> retrieveLoanListDao () throws Exception {
		
		
		List<LoanRequest> listOfLoans =loanUtil.getListOfLoans();
		
		
			
			if((listOfLoans==null)) {
				throw new NullPointerException();
			}
			
			if((listOfLoans.isEmpty())) {
				throw new NoLoanRequestException("No Loan Request are present");
			}
			else {
				return listOfLoans;
				
			}
		
		
		
	}

}
