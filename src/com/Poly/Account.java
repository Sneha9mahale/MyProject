package com.Poly;

public class Account {
	private int acno;
	private String name;
	protected float balance;
	public static String bankName="ICICI Bank";
	public static float iRate=7.2f;
	
	Account(int a,String nm,float b)
	{
		acno=a;
		name=nm;
		balance=b;
	}
	public static void changeRate(float Rate)//Static Method
	{
		iRate=Rate;
	}
	void showAccountDetails()
	{
		System.out.println("Customer Name : "+name);
		System.out.println("Customer Account no : "+acno+" is with "+Account.bankName);
		System.out.println("Customer Balance : "+balance);
		System.out.println("Interest Rate Applicable =: "+iRate);
	}

	public static void main(String[] args) {
		Account o1=new Account(1235,"Mr.Anil",1235.f);
		Account o2=new Account(5643,"Ms.kulkarni",45864.3f);
		o1.showAccountDetails();
		o2.showAccountDetails();
		Account.changeRate(7.8f);
		o1.showAccountDetails();
		o2.showAccountDetails();
	}
	
}
