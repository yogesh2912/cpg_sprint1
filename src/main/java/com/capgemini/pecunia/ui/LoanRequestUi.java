package com.capgemini.pecunia.ui;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.capgemini.pecunia.dao.LoanDisbursalDao;
import com.capgemini.pecunia.dao.LoanRequestDao;
import com.capgemini.pecunia.dto.Account;
import com.capgemini.pecunia.dto.LoanRequest;
import com.capgemini.pecunia.exception.InvalidAccountIdException;
import com.capgemini.pecunia.exception.InvalidAmountException;
import com.capgemini.pecunia.exception.InvalidCreditScoreException;
import com.capgemini.pecunia.exception.InvalidRoiException;
import com.capgemini.pecunia.exception.InvalidTenureException;
import com.capgemini.pecunia.exception.InvalidUserexception;
import com.capgemini.pecunia.exception.NoLoanRequestException;
import com.capgemini.pecunia.service.LoanDisbursalService;
import com.capgemini.pecunia.service.LoanRequestService;
import com.capgemini.pecunia.util.AccountUtil;

public class LoanRequestUi {
	
	public static void main(String[] args) {
		
		AccountUtil df=new AccountUtil();
		//To Add Loan Request
		
		LoanRequestService loanObj=new LoanRequestService();
		
		try {
			loanObj.addLoanDetailsService(new LoanRequest(182344628143L,1005.0,16,665,13,"pending","study-loan"));
			//loanObj.addLoanDetailsService(new LoanRequest(123456789632L,1005.0,16,500,13,"pending","study-loan"));
			//loanObj.addLoanDetailsService(null);
		}
		catch(NullPointerException ee) {
			System.out.println(ee);
		}
		catch(InvalidAccountIdException ee) {
			System.out.println(ee);
		}
		catch(InvalidAmountException ee) {
			System.out.println(ee);
		}
		catch(InvalidTenureException ee) {
			System.out.println(ee);
		}
		catch(InvalidCreditScoreException ee) {
			System.out.println(ee);
		}
		catch(InvalidRoiException ee) {
			System.out.println(ee);
		}
		catch(InvalidUserexception ee) {
			System.out.println(ee);
		}
		catch(Exception ee) {
			System.out.println("From Exception "+ee);
		}
	
		
		
		
		//To Disbursal Of Loan
		LoanDisbursalService loanObj1=new LoanDisbursalService();
		
		
		try {
			List<LoanRequest> newLoanList=loanObj1.retrieveAll();
			for(LoanRequest ll:newLoanList) {
				System.out.println(ll.getAccountId()+" "+ll.getStatus());
			}
		}
		catch(NullPointerException ee) {
			System.out.println(ee);
		}
		catch(NoLoanRequestException ee) {
			System.out.println(ee);
		}
		catch(Exception ee) {
			System.out.println(ee);
		}
		
		//to See the update Accounts
		
		
		Map<Long,Account> acc=df.getMapOfAccount();
		
		List<Entry<Long,Account>> listOfAccounts=new ArrayList<Entry<Long,Account>>(acc.entrySet());
		
		for(Entry<Long,Account> accObj:listOfAccounts) {
			System.out.println(accObj.getKey()+" "+accObj.getValue().getAccountHolderName()+" "+accObj.getValue().getBalance());
		}
		
	

	}

}
