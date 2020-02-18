package com.capgemini.pecunia.dao;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.pecunia.dto.LoanRequest;
import com.capgemini.pecunia.exception.NoLoanRequestException;
import com.capgemini.pecunia.service.LoanDisbursalService;
import com.capgemini.pecunia.service.LoanRequestService;
import com.capgemini.pecunia.ui.LoanRequestUi;
import com.capgemini.pecunia.util.LoanRequestUtil;

public class LoanDisbursalDaoTest {
	
	LoanDisbursalDao loanObj;
	
	@BeforeEach
	void init() {
		loanObj=new LoanDisbursalDao();
	}
	
	@Test
	void NoLoanRequest() throws Exception {
		assertThrows(NoLoanRequestException.class,()->loanObj.retrieveLoanListDao());
	}
	
	@Test
	void returnsList() throws Exception {
		
	    
		List<LoanRequest> loanRequest=new ArrayList<LoanRequest>();
		loanRequest.add(new LoanRequest(182344628143L,1005.0,16,665,13,"pending","study-loan"));
		
		LoanRequestUtil.setListOfLoans(loanRequest);
		
		
		Object [] testOutput= loanObj.retrieveLoanListDao().toArray();
		
		Object [] expected=new Object[1];
		expected[0]=new LoanRequest(182344628143L,1005.0,16,665,13,"pending","study-loan");
		
		
		
		assertArrayEquals(expected,testOutput);
		
	}
	
	@Test
	void returnsNull() {
		LoanRequestUtil loanBean=new LoanRequestUtil();
		loanBean.setListOfLoans(null);
		assertThrows(NullPointerException.class,()->loanObj.retrieveLoanListDao());
		
	}
	
	

}
