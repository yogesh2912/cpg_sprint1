package com.capgemini.pecunia.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.capgemini.pecunia.dto.LoanRequest;
import com.capgemini.pecunia.exception.InvalidAccountIdException;
import com.capgemini.pecunia.exception.InvalidAmountException;
import com.capgemini.pecunia.exception.InvalidCreditScoreException;
import com.capgemini.pecunia.exception.InvalidRoiException;
import com.capgemini.pecunia.exception.InvalidTenureException;
import com.capgemini.pecunia.exception.InvalidUserexception;

public class LoanRequestServiceTest {
	
	@Test
	void testInvalidAccountNumber() {
		LoanRequestService loanObj=new LoanRequestService();
		LoanRequest loan=new LoanRequest(1243567582632L,1005.0,16,665,13,"pending","study-loan");
		
		assertThrows(InvalidAccountIdException.class,()->loanObj.addLoanDetailsService(loan));
	}
	
	@Test
	void testInvalidAmount() {
		LoanRequestService loanObj=new LoanRequestService();
		LoanRequest loan=new LoanRequest(124356758263L,105.0,16,665,13,"pending","study-loan");
		
		assertThrows(InvalidAmountException.class,()->loanObj.addLoanDetailsService(loan));
	}
	
	@Test
	void testInvalidTenure() {
		LoanRequestService loanObj=new LoanRequestService();
		LoanRequest loan=new LoanRequest(124356758263L,1025.0,11,665,13,"pending","study-loan");
		
		assertThrows(InvalidTenureException.class,()->loanObj.addLoanDetailsService(loan));
	}
	
	@Test
	void testInvalidCreditScore() {
		LoanRequestService loanObj=new LoanRequestService();
		LoanRequest loan=new LoanRequest(124356758263L,1025.0,13,6654,13,"pending","study-loan");
		
		assertThrows(InvalidCreditScoreException.class,()->loanObj.addLoanDetailsService(loan));
	}
	
	@Test
	void testInvalidRoi() {
		LoanRequestService loanObj=new LoanRequestService();
		LoanRequest loan=new LoanRequest(124356758263L,1025.0,14,664,3,"pending","study-loan");
		
		assertThrows(InvalidRoiException.class,()->loanObj.addLoanDetailsService(loan));
	}
	
	@Test
	void testInvalidLoanRequest() {
		LoanRequestService loanObj=new LoanRequestService();
		LoanRequest loan=null;
		
		assertThrows(NullPointerException.class,()->loanObj.addLoanDetailsService(loan));
	}
	
	@Test
	void test() throws Exception{
		LoanRequestService loanObj=new LoanRequestService();
		LoanRequest loan=new LoanRequest(123456789632L,1005.0,16,665,13,"pending","study-loan");
		assertTrue(loanObj.addLoanDetailsService(loan));
	}
	
	@Test
	void testInvalidUser() throws Exception {
		LoanRequestService loanObj=new LoanRequestService();
		LoanRequest loan=new LoanRequest(213457689632L,1005.0,16,665,13,"pending","study-loan");
		//assertFalse(loanObj.addLoanDetailsService(loan));
		assertThrows(InvalidUserexception.class,()->loanObj.addLoanDetailsService(loan));
	}
	
	

}
