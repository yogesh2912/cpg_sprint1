package com.capgemini.pecunia.dao;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.pecunia.dto.LoanRequest;
import com.capgemini.pecunia.exception.InvalidUserexception;

public class LoanRequestDaoTest {
	
	@Test
	void testAddloanRequest() throws Exception{
		LoanRequestDao loanObj=new LoanRequestDao();
		LoanRequest loan=new LoanRequest(182344628143L,1005.0,16,665,13,"pending","study-loan");
		assertEquals(true,loanObj.addLoanDetailsDao(loan));
	}
	
	@Test
	void testNotAValidUser () {
		LoanRequestDao loanObj=new LoanRequestDao();
		LoanRequest loan=new LoanRequest(213422689632L,1005.0,16,665,13,"pending","study-loan");
		assertThrows(InvalidUserexception.class,()->loanObj.addLoanDetailsDao(loan));
	}

}
