package com.array;
import java.util.Scanner;
import java.util.Arrays;
public class Employee {
	int id;
	String name;
	double salary;
	Employee(int id,String name,double salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	@Override
	public String toString()
	{
		return id+" "+name+" "+salary;
	}

	public static void main(String[] args) {
		Employee e[]=new Employee[3];
		e[0]=new Employee(1,"SNEHA",6800);
		e[1]=new Employee(2,"SNEHAL",87000);
		e[2]=new Employee(3,"NEHA",99900);
		
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<e.length;i++)
		{
			System.out.println("Enter id:");
			int sid=sc.nextInt();
			System.out.println("Enter name :");
			String sname=sc.next();
			System.out.println("Enter Salary :");
			double ssal=sc.nextDouble();
			e[i]=new Employee( sid, sname, ssal);
		}
		for(int i=0;i<e.length;i++)
		{
			System.out.println(e[i]);
		}
		System.out.println(Arrays.toString(e));		
		//1st method
		System.out.println(e[0].id+" "+e[0].name+" "+e[0].salary);
		System.out.println(e[1].id+" "+e[1].name+" "+e[1].salary);
		System.out.println(e[2].id+" "+e[2].name+" "+e[2].salary);
		//2nd method
		for(Employee emp : e)
		{
			System.out.println(emp);
		}

	}

}
