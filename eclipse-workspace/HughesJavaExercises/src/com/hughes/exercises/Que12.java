package com.hughes.exercises;
/**
 * @author Karan
 *
 */
public class Que12 {
	/*
	 CoreJava_Assessment1(Creating the class structure)
	 */

	public static void main(String[] args) {
		
	}
	
	public static class Account{
		int accountId;
		String accountName;
		String Address;
		long depositAmount;
		
		public void getDetails() {
			
		}
		
		public void showDetails() {
			
		}
		
	}
	
	public static class Loan extends Account{
		int loanId;
		String loanType;
		long loanAmmount;
		
		public void getLoan() {
			
		}
		
		public void showLoanDetails() {
			
		}
		
	}
	
	public static class Transaction extends Loan{
		long Amount;
		
		public void depositAmount() {
			
		}
		
		public void withdrawAmount() {
			
		}
		
		public void payLoan() {
			
		}
		
		public void showAccountDetails() {
			
		}
		
	}

}





































