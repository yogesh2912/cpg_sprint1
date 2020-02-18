package com.capgemini.pecunia.dto;

public class LoanRequest {
	
	//instance variables of Loan Class
		private long accountId;
		private double amount;
		private int tenure;
		private int creditScore;
		private double roi;
		private String status;
		private String type;
		
		//getters and setter for instance variables of Loan Class
		public long getAccountId() {
			return accountId;
		}
		public void setAccountId(long accountId) {
			this.accountId = accountId;
		}
		public double getAmount() {
			return amount;
		}
		public void setAmount(double amount) {
			this.amount = amount;
		}
		public int getTenure() {
			return tenure;
		}
		public void setTenure(int tenure) {
			this.tenure = tenure;
		}
		public int getCreditScore() {
			return creditScore;
		}
		public void setCreditScore(int creditScore) {
			this.creditScore = creditScore;
		}
		public double getRoi() {
			return roi;
		}
		public void setRoi(double roi) {
			this.roi = roi;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		
		//parametarized Constructor
		public LoanRequest(long accountId, double amount, int tenure, int creditScore, double roi, String status, String type) {
			super();
			this.accountId = accountId;
			this.amount = amount;
			this.tenure = tenure;
			this.creditScore = creditScore;
			this.roi = roi;
			this.status = status;
			this.type = type;
		}
		
		

}
