package com.capgemini.pecunia.dao;

import java.util.List;

import com.capgemini.pecunia.dto.LoanRequest;
import com.capgemini.pecunia.exception.NoLoanRequestException;
import com.capgemini.pecunia.service.LoanDisbursalService;
import com.capgemini.pecunia.util.LoanRequestUtil;

public class LoanDisbursalDao {
	
	LoanRequestUtil loanUtil=new LoanRequestUtil();
	
	LoanDisbursalService loanObj =new LoanDisbursalService();
	
	public List<LoanRequest> retrieveLoanListDao () throws Exception {
		
		
		List<LoanRequest> listOfLoans =loanUtil.getListOfLoans();
		
		System.out.println(listOfLoans);
		
			
			if((listOfLoans==null)) {
				throw new NullPointerException();
			}
			
			if((listOfLoans.size()==0)) {
				throw new NoLoanRequestException("No Loan Request are present");
				//System.out.println("No Loan Request Exception");
			}
			else {
				return listOfLoans;
				
			}
		
		
		
	}

}
