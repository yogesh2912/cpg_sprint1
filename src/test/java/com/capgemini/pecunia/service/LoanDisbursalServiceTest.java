package com.capgemini.pecunia.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.pecunia.dao.LoanDisbursalDao;
import com.capgemini.pecunia.dto.LoanRequest;
import com.capgemini.pecunia.exception.NoLoanRequestException;
import com.capgemini.pecunia.util.LoanRequestUtil;

public class LoanDisbursalServiceTest {
	
	@Test
	@BeforeEach
	void NoLoanRequest() throws Exception {
		LoanDisbursalService loanObj=new LoanDisbursalService();
		
		assertThrows(NoLoanRequestException.class,()->loanObj.retrieveAll());
	}
	
	@Test
	void testAccepted() throws Exception {
		LoanDisbursalService loanObj=new LoanDisbursalService();
		
		List<LoanRequest> loanRequest=new ArrayList<LoanRequest>();
		loanRequest.add(new LoanRequest(182344628143L,1005.0,16,665,13,"pending","study-loan"));
		
		List<LoanRequest> loanRequest1=new ArrayList<LoanRequest>();
		loanRequest1.add(new LoanRequest(182344628143L,1005.0,16,665,13,"Accepted","study-loan"));
		
		
		LoanRequestUtil loanBean=new LoanRequestUtil();
		loanBean.setListOfLoans(loanRequest);
		
		assertEquals(loanRequest,loanObj.retrieveAll());
		
	}
	
	@Test
	void testRejected() throws Exception {
		LoanDisbursalService loanObj=new LoanDisbursalService();
		
		List<LoanRequest> loanRequest=new ArrayList<LoanRequest>();
		loanRequest.add(new LoanRequest(182344628143L,1005.0,16,900,13,"pending","study-loan"));
		
		
		LoanRequestUtil loanBean=new LoanRequestUtil();
		loanBean.setListOfLoans(loanRequest);
		
		assertEquals(loanRequest,loanObj.retrieveAll());
		
	}
	
	

}
