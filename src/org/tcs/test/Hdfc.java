package org.tcs.test;

public class Hdfc implements Rbi,WorldBank{

	@Override
	public void savingsInterest() {
 System.out.println("Savings interest is 5 %");		
	}

	@Override
	public void fixedDeposit() {
		System.out.println("FD interest is 3%");
	}
	
	public static void main(String[] args) {
		
		Hdfc h = new Hdfc();
		h.savingsInterest();
		h.fixedDeposit();
		h.carLoan();
	}

	@Override
	public void carLoan() {
		System.out.println("FD interest is 3%");
		
	}

}
