package com.array2nd;
import java.util.Scanner;
import java.util.Arrays;
class Employ
{
int eid;
String ename;
int salary;
Employ(int eid,String ename,int salary)
{
	this.eid=eid;
	this.ename=ename;
	this.salary=salary;
}
public String toString()
{
	return eid+" "+ename+" "+salary;
}
}

public class Deapartment{
	int did;
	String dname;
	Employ e;
	
	Deapartment(int did,String dname,Employ e)
	{
		this.did=did;
		this.dname=dname;
		this.e=e;
	}
	
	public String toString()
	{
		return did+" "+dname+" "+e;
	}


	public static void main(String[] args) {
		Deapartment []dept=new Deapartment[3];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<dept.length;i++)
		{
			System.out.println("Enter dept id :");
			int did=sc.nextInt();
			System.out.println("Enter dept name :");
			String dname=sc.next();
			System.out.println("Enter Data for Employee : ");
			System.out.println("Enter emp id :");
			int eid=sc.nextInt();
			System.out.println("Enter emp name :");
			String ename=sc.next();
			System.out.println("Enter Salary : ");
			int salary=sc.nextInt();
		
			Employ e=new Employ(eid,ename,salary);
			dept[i]=new Deapartment(did,dname,e);
	
	        //dept[i]=new Deapartment( did, dname,new Employee(eid,ename,salary));
		}
		System.out.println("//////////////////////////////////////////");
		for(int i=0;i<dept.length;i++)
		{
			System.out.println(dept[i]);
		}
		System.out.println("//////////////////////////////////////////");
		for(Deapartment d: dept)
		{
			System.out.println(d);
		}
		
		

	}

}
