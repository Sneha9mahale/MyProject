package com.Poly;
import com.OOPS.AccessHome;
public class BankHome {

	public static void main(String[] args) {
		AccessHome ac=new AccessHome();
		//ac.id=11;(private)
		ac.nm="Sneha mahale";
		//ac.bal=14000;(protected)
		//ac.compnm="Think Quotient";(default);
		//ac.openAccount();
		ac.fillAccountDetails(12, "Dipak", 15000,"TQ");
		//ac.displayDetails();
		//ac.addBalance();

	}

}
