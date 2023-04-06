package com.array2nd;

import java.util.Scanner;

public class SameSalary {
	int id;
	String name;
	float salary;

	SameSalary(int id, String name, float salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public String toString() {
		return id + " " + name + " " + salary;
	}


	public static void main(String[] args) {
		SameSalary s[] = new SameSalary[3];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < s.length; i++) {
			System.out.println("Enter id:");
			int id = sc.nextInt();
			System.out.println("Enter name");
			String name = sc.next();
			System.out.println("Enter Salary");
			float salary = sc.nextFloat();

			s[i] = new SameSalary(id, name, salary);

		}

	

	}
}
