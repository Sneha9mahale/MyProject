package com.OOPS;

public class AccessHome {
	private int id;
	public String nm;
	protected int bal;
	String compnm;
	private void openAccount()
	{
		System.out.println("Please Enter your Details");
	}
	public void fillAccountDetails(int eid,String enm,int ebal,String ecompnm)
	{
		id=eid;
		nm=enm;
		bal=ebal;
		compnm=ecompnm;
		displayDetails();
	}
	void displayDetails()
	{
		System.out.println("Customer name = "+nm);
		System.out.println("Customer id = "+id);
		System.out.println("Customer balance = "+bal);
		System.out.println("Customer company Name = "+compnm);
	}
	protected void addBalance()
	{
		System.out.println("Balance is addded");
	}

	public static void main(String[] args) {
//		AccessHome ac=new AccessHome();
//		ac.id=11;
//		ac.nm="Sneha mahale";
//		ac.bal=14000;
//		ac.compnm="Think Quotient";
//		ac.openAccount();
//		//ac.fillAccountDetails(12, "Dipak", 15000,"TQ");
//		ac.displayDetails();
//		ac.addBalance();
	}

}
