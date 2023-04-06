package com.OOPS;

public class BankAccess {

	public static void main(String[] args) {
		AccessHome ac=new AccessHome();
		//ac.id=11;(error private)
		ac.nm="Sneha mahale";
		ac.bal=14000;
		ac.compnm="Think Quotient";
		//ac.openAccount();(error)
		ac.fillAccountDetails(12, "Dipak", 15000,"TQ");
		ac.displayDetails();
		ac.addBalance();

	}

}
