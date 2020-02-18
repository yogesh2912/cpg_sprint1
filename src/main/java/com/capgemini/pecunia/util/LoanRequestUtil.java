package com.capgemini.pecunia.util;

import java.util.ArrayList;
import java.util.List;

import com.capgemini.pecunia.dto.LoanRequest;

public class LoanRequestUtil {
	
	

	private static List<LoanRequest> listOfLoans=new ArrayList<LoanRequest>();
	
	public LoanRequestUtil() {
		//listOfLoans.add(new LoanRequest(182344628143L,1005.0,16,665,13,"pending","study-loan"));
		//listOfLoans.add(new LoanRequest(123456789632L,1000.0,15,800,5.5,"pending","study-loan"));
		//listOfLoans.add(new LoanRequest(46352682386255L,2000.0,13,900,11.8,"pending","farming-loan"));//here accountId length is greater than 12
		//listOfLoans.add(new LoanRequest(182344628143L,2000.0,11,910,13.9,"pending","car-loan")); //here tenure is less than 12
		//listOfLoans.add(new LoanRequest(182344682342L,900.0,14,915,12.95,"pending","home-loan")); //here amount is less than 1000
		//listOfLoans.add(new LoanRequest(451524682342L,-1100.0,15,999,13.1,"pending","tour-loan"));//here amount is negative
		//listOfLoans.add(new LoanRequest(963524682342L,1200.0,15,1001,5.5,"pending","tour-loan")); //here the credit score is more than 1000
		//listOfLoans.add(new LoanRequest(666624682342L,1600.0,100,899,15,"pending","farming-loan")); //here rate of interest is greater than 14
		
		//System.out.println(listOfLoans.get(7).getRoi());
		
	}
	
	public List<LoanRequest> getListOfLoans(){
		return listOfLoans;
	}
	
	public static void setListOfLoans(List<LoanRequest> listOfLoans) {
		LoanRequestUtil.listOfLoans = listOfLoans;
	}

}
