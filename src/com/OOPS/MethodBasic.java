package com.OOPS;

public class MethodBasic {
	float profitEarned;
	String actor;
	String producer;
	int yearOfRelease;
	void acceptDetails()
	{
		profitEarned =120000;
		actor="Leonardo";
		producer="Mr.James";
		yearOfRelease=1997;
	}
	void acceptDetails(int y,float p,String a,String pr)
	{
		profitEarned =p;
		actor=a;
		producer=pr;
		yearOfRelease=y;
	}
	void showDetails()
	{
		System.out.println("Movie profit is : "+profitEarned);
		System.out.println("Movie actor is :  "+actor);
		System.out.println("Movie producer is :  "+producer);
		System.out.println("Movie ayear of release is :  "+yearOfRelease);
		
	}

	public static void main(String[] args) {
		MethodBasic titanic=new MethodBasic();
		titanic.showDetails();
		System.out.println("after calling acceptdetails,States in titanic : ");
		titanic.acceptDetails();
		titanic.showDetails();
		MethodBasic uri=new MethodBasic();
		uri.acceptDetails();
		uri.showDetails();
		System.out.println("after parameter pass");
		titanic.acceptDetails(1997,12000,"Leonardo","mr.james");
		uri.acceptDetails(2000,23000,"Vicky","Rohit");
		titanic.showDetails();
		uri.showDetails();
	}

}
