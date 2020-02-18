package com.capgemini.pecunia.service;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
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
	void testAccepted() throws Exception {
		
		List<LoanRequest> loanRequest=new ArrayList<LoanRequest>();
		loanRequest.add(new LoanRequest(182344628143L,1005.0,16,665,13,"pending","study-loan"));
		
		//LoanRequestUtil loanBean=new LoanRequestUtil();
		LoanRequestUtil.setListOfLoans(loanRequest);
		
		LoanDisbursalService loanObj=new LoanDisbursalService();
		
		Object [] testOutput= loanObj.retrieveAll().toArray();
		
		
		Object [] expected=new Object[1];
		expected[0]=new LoanRequest(182344628143L,1005.0,16,665,13,"Accepted","study-loan");
		
		
		
		assertArrayEquals(expected,testOutput);
		
	}
	
	@Test
	void testRejected() throws Exception {
		List<LoanRequest> loanRequest=new ArrayList<LoanRequest>();
		loanRequest.add(new LoanRequest(182344628143L,1005.0,16,900,13,"pending","study-loan"));
		
		//LoanRequestUtil loanBean=new LoanRequestUtil();
		LoanRequestUtil.setListOfLoans(loanRequest);
		
		LoanDisbursalService loanObj=new LoanDisbursalService();
		
		Object [] testOutput= loanObj.retrieveAll().toArray();
		
		
		Object [] expected=new Object[1];
		expected[0]=new LoanRequest(182344628143L,1005.0,16,900,13,"Rejected","study-loan");
		
		
		
		assertArrayEquals(expected,testOutput);
		
	}
	
	@Test
	void testNoLoan() {
		List<LoanRequest> loanRequest=new ArrayList<LoanRequest>();
		
		LoanRequestUtil.setListOfLoans(loanRequest);
		
		LoanDisbursalService loanObj=new LoanDisbursalService();
		
		assertThrows(NoLoanRequestException.class,()->loanObj.retrieveAll());
		
	}
	
	@Test
	void testNull() {
		List<LoanRequest> loanRequest=null;
		
		
		LoanRequestUtil.setListOfLoans(loanRequest);
		
		LoanDisbursalService loanObj=new LoanDisbursalService();
		
		assertThrows(NullPointerException.class,()->loanObj.retrieveAll());
		
	}
	
	

}
