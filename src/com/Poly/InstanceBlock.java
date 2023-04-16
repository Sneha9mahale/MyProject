package com.Poly;

public class InstanceBlock {
	private int acno;
	private String name;
	protected float balance;
	public static String bankName;
	public static float iRate;
	static
	 {
	 System.out.println("Static block1 is executed ");
	 bankName="ICICI BANK";
	 }
	{
		System.out.println("Instance block1 is executed ");
		acno=45678;
		name="Mr.W";
	}
public static void changeRate(float Rate)//Static Method
{
	iRate=Rate;
	System.out.println("Static method is invoked!!!");
}
{
	System.out.println("Instance block2 is executed ");
	balance=36000.78f;
	showAccountDetails();//instance method call in instance block
	changeRate(2.34f);//static method
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
		InstanceBlock i1=new InstanceBlock();
		InstanceBlock i2=new InstanceBlock();
		i1.showAccountDetails();
	}

}
