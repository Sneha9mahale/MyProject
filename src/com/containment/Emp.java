package com.containment;

public class Emp {
	int empid;
	String empname;
	float empsalary;
	Address adr;
	//public void getEmployeeDetail(int empid,float empsalary,String empname,Address adr)
	Emp(int empid,float empsalary,String empname)
	{
		System.out.println("Para Constructor Of Employee");
		this.empid=empid;
		this.empname=empname;
		this.empsalary=empsalary;
		//this.adr=adr;
	}
	public void showEmployeeDetails()
	{
		System.out.println("Employee ID : "+empid);
		System.out.println("Employee Name : "+empname);
		System.out.println("Employee Salary : "+empsalary);
		adr.showAddress();
	}
	public void setAddress(Address ad)
	{
		adr=ad;
	}

	

}
