package com.capgemini.pecunia.service;

import java.util.List;

import com.capgemini.pecunia.dto.LoanRequest;

public interface LoanDisbursalServiceInterface {
	
	public List<LoanRequest> retrieveAll() throws Exception;

}
