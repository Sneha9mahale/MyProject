package com.OOPS;

public class EmployeeDemo {
	int id;
	String name;
	boolean ischeck;

	public static void main(String[] args) {
		EmployeeDemo emp;
		emp=new EmployeeDemo();
		System.out.println(emp.id);
		System.out.println(emp.name);
		emp.id=101;
		emp.name="sneha";
		System.out.println(emp.id);
		System.out.println(emp.name);
		EmployeeDemo emp1=new EmployeeDemo();
		emp1.id=11;
		emp1.name="neha";
		System.out.println(emp1.id);
		System.out.println(emp1.name);
		
		

	}

}
