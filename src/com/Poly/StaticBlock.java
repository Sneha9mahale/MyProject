package com.Poly;

public class StaticBlock {
	private int acno;
	private String name;
	protected float balance;
	public static String bankName;
	public static float iRate;
	 StaticBlock(int a,String nm,float b)
	{
		acno=a;
		name=nm;
		balance=b;
	}
	 static
	 {
		 System.out.println("Static block1 is executed ");
		 bankName="ICICI BANK";
	 }
	public static void changeRate(float Rate)//Static Method
	{
		iRate=Rate;
		System.out.println("Static method is invoked!!!");
	}
	
	void showAccountDetails()
	{
		System.out.println("Customer Name : "+name);
		System.out.println("Customer Account no : "+acno+" is with "+Account.bankName);
		System.out.println("Customer Balance : "+balance);
		System.out.println("Interest Rate Applicable =: "+iRate);
	}
	static
	{
		System.out.println("Static block2 is executed ");
		iRate=4.67f;
		changeRate(8.5f);
		}
	

	public static void main(String[] args) {
		StaticBlock o1=new StaticBlock(1235,"Mr.Anil",1235.f);
		StaticBlock o2=new StaticBlock(5643,"Ms.kulkarni",45864.3f);
		o1.showAccountDetails();
		o2.showAccountDetails();
//		StaticBlock.changeRate(7.8f);
//		o1.showAccountDetails();
//		o2.showAccountDetails();
	}
	

}
