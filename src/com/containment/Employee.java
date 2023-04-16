package com.containment;
import java.util.Scanner;
public class Employee {

	public static void main(String[] args) {
		//Emp e=new Emp();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee Details : ");
		System.out.println("Enter Employee Id : ");
		int id=sc.nextInt();
		System.out.println("Enter Employee Name : ");
		String nm=sc.next();
		System.out.println("Enter Employee Salary : ");
		float sly=sc.nextFloat();
		
		//Address a=new Address();
		System.out.println("Enter Employee Address : ");
		System.out.println("Enter Employee pinNo : ");
		int pn=sc.nextInt();
		System.out.println("Enter Employee Society Name : ");
		String so=sc.next();
		System.out.println("Enter Employee City Name : ");
		String cnm=sc.next();
		Emp e=new Emp(id,sly,nm);
		Address a=new Address(pn,so,cnm);
		e.setAddress(a);
		e.showEmployeeDetails();
	}

}
