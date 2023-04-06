package com.OOPS;

public class AccessDemo {
	private int acno;
	protected String name;
	private float balance;
	
	public void openAcount()
	{
		fillCustomerDetails(87654, " sneha" ,4000);
	}
	private void fillCustomerDetails(int ano,String nm,float bal)
	{
		acno=ano;
		name=nm;
		balance=bal;
	}
	void showAccountDetails()
	{
		System.out.println("Account number :"+acno);
		System.out.println("name : "+name);
		System.out.println("account balance : "+balance);
	}

//	public static void main(String[] args) {
//		AccessDemo a=new AccessDemo();
//		a.acno=54323;
//		a.name="dipak";
//		a.balance=20000;
//		//a.openAcount();
//		a.showAccountDetails();
//		a.openAcount();
//		a.showAccountDetails();
//	}

}
