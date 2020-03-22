package com.capgemini.pecunia.dao;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.pecunia.dto.LoanRequest;
import com.capgemini.pecunia.exception.InvalidUserexception;
import com.capgemini.pecunia.util.LoanRequestUtil;

public class LoanRequestDaoTest {
	
	LoanRequestDao loanObj;
	
	@BeforeEach
	void init() {
		loanObj=new LoanRequestDao();
	}
	
	//this function test wheather a valid loan request is added to list of loanRequests or not
	@Test
	void testAddloanRequest() throws Exception{
		
		List<LoanRequest> loanRequest=new ArrayList<LoanRequest>();
		loanRequest.add(new LoanRequest(182344628143L,1005.0,16,665,13,"pending","study-loan"));
		
		LoanRequestUtil.setListOfLoans(loanRequest);
		
		
		
		assertEquals(true,loanObj.addLoanDetailsDao(new LoanRequest(182344628143L,1005.0,16,665,13,"pending","study-loan")));
	}
	
	@Test
	void testNotAValidUser () {
		LoanRequest loan=new LoanRequest(213422689632L,1005.0,16,665,13,"pending","study-loan");
		assertThrows(InvalidUserexception.class,()->loanObj.addLoanDetailsDao(loan));
	}

}
