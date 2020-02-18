package com.capgemini.pecunia.dao;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.capgemini.pecunia.dto.LoanRequest;
import com.capgemini.pecunia.exception.NoLoanRequestException;
import com.capgemini.pecunia.service.LoanRequestService;
import com.capgemini.pecunia.util.LoanRequestUtil;

public class LoanDisbursalDaoTest {
	
	@Test
	void NoLoanRequest() throws Exception {
		LoanDisbursalDao loanObj=new LoanDisbursalDao();
		
		assertThrows(NoLoanRequestException.class,()->loanObj.retrieveLoanListDao());
	}
	
	@Test
	void returnsList() throws Exception {
		
		
		LoanDisbursalDao loanObj=new LoanDisbursalDao();
		
		List<LoanRequest> loanRequest=new ArrayList<LoanRequest>();
		loanRequest.add(new LoanRequest(182344628143L,1005.0,16,665,13,"pending","study-loan"));
		
		List<LoanRequest> loanRequest1=new ArrayList<LoanRequest>();
		loanRequest1.add(new LoanRequest(182344928143L,1005.0,16,665,13,"pending","study-loan"));
		
		LoanRequestUtil loanBean=new LoanRequestUtil();
		loanBean.setListOfLoans(loanRequest);
		
		assertEquals(loanRequest,loanObj.retrieveLoanListDao());
		
	}
	
	@Test
	void returnsNull() {
		LoanDisbursalDao loanObj=new LoanDisbursalDao();
		LoanRequestUtil loanBean=new LoanRequestUtil();
		loanBean.setListOfLoans(null);
		assertThrows(NullPointerException.class,()->loanObj.retrieveLoanListDao());
		
	}
	
	

}
