package com.Poly;

public class InstanceConst {
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
}
 InstanceConst() {
	System.out.println("In a default constructor");
	acno=0;
	name=null;
	balance=0.0f;
}
 InstanceConst(int a,String nm,float b)
 {
	 System.out.println("In a parameterised constructor");
	 acno=a;
	 name=nm;
	 balance=b;
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
		InstanceConst c=new InstanceConst();
		InstanceConst c1=new InstanceConst(2345,"Mr.D",54667.76f);
		c.showAccountDetails();
		c1.showAccountDetails();

	}

}
