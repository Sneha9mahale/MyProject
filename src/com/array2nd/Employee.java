package com.array2nd;

import java.util.Scanner;
import java.util.Arrays;

public class Employee {
	int id;
	String name;
	float salary;

	Employee(int id, String name, float salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public String toString() {
		return id + " " + name + " " + salary;
	}

	public static void main(String[] args) {
		Employee e[] = new Employee[3];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < e.length; i++) {
			System.out.println("Enter id:");
			int id = sc.nextInt();
			System.out.println("Enter name");
			String name = sc.next();
			System.out.println("Enter Salary");
			float salary = sc.nextFloat();

			e[i] = new Employee(id, name, salary);

		}

//		for(Employee emp:e)
//		{
		for (int i = 0; i < e.length; i++)
		{
			if (e[i].salary <= 20000) {
				System.out.println("hii");
				float per = e[i].salary * (10.0f / 100);
				System.out.println(per+" ......");
				e[i].salary = e[i].salary + per;
			}
		}
		System.out.println(Arrays.toString(e));

	}
	
	
}
// System.out.println(emp);
