package com.capgemini.pecunia.util;

import java.util.ArrayList;


import java.util.List;

import com.capgemini.pecunia.dto.LoanRequest;


//this class has a static List which will store list of loan request.

public class LoanRequestUtil {
	
	

	private static List<LoanRequest> listOfLoans=new ArrayList<>();
	
	
	public List<LoanRequest> getListOfLoans(){
		return listOfLoans;
	}
	
	public static void setListOfLoans(List<LoanRequest> listOfLoans) {
		LoanRequestUtil.listOfLoans = listOfLoans;
	}

}
