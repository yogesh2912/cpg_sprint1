package com.capgemini.pecunia.service;

import java.util.List;
import java.util.Map;

import com.capgemini.pecunia.dao.LoanDisbursalDao;
import com.capgemini.pecunia.dto.Account;
import com.capgemini.pecunia.dto.LoanRequest;
import com.capgemini.pecunia.exception.NoLoanRequestException;
import com.capgemini.pecunia.util.AccountUtil;

public class LoanDisbursalService {
	
	AccountUtil mapOfAccounts=new AccountUtil();
	
	
	
	public List<LoanRequest> retrieveAll() throws Exception{
		
		LoanDisbursalDao loanObj=new LoanDisbursalDao();
		
		List<LoanRequest> listOfLoans;
		Map<Long,Account>accountObj=mapOfAccounts.getMapOfAccount();
		
		try {
			listOfLoans=loanObj.retrieveLoanListDao();
			
			for(LoanRequest indexLoan:listOfLoans) {
				if(indexLoan.getCreditScore()<670) {
					indexLoan.setStatus("Accepted");
					double currentBalance=accountObj.get(indexLoan.getAccountId()).getBalance();
					
					
					Account aa=accountObj.get(indexLoan.getAccountId());
					
					aa.setBalance(indexLoan.getAmount()+currentBalance);
		
					accountObj.put(indexLoan.getAccountId(),aa);
				
					
				}
				else {
					indexLoan.setStatus("Rejected");
				}
					
			}
			
			return listOfLoans;

		}
		catch(NullPointerException ee) {
			throw ee;
			//System.out.println(ee);
		}
		catch(NoLoanRequestException ee) {
			throw ee;
			//System.out.println(ee);
		}
		catch(Exception ee) {
			throw ee;
		}
		
	
		//return null;
		
	}

}
