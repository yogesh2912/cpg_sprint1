package com.capgemini.pecunia.dao;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import com.capgemini.pecunia.dto.LoanRequest;
import com.capgemini.pecunia.exception.InvalidUserexception;

public class LoanRequestDaoTest {
	
	@Test
	void test() throws InvalidUserexception {
		LoanRequestDao loanObj=new LoanRequestDao();
		LoanRequest loan=new LoanRequest(123456789632L,1005.0,16,665,13,"pending","study-loan");
		assertEquals(true,loanObj.addLoanDetailsDao(loan));
	}
	
	@Test
	void test1() {
		LoanRequestDao loanObj=new LoanRequestDao();
		LoanRequest loan=new LoanRequest(123457689632L,1005.0,16,665,13,"pending","study-loan");
		assertThrows(InvalidUserexception.class,()->loanObj.addLoanDetailsDao(loan));
	}

}
