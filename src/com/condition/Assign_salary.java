package com.condition;
import java.util.Scanner;
public class Assign_salary {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int salary;
		float hra;
		System.out.println("Enter salary");
		salary=sc.nextInt();
		if(salary>=10000)
		{
			hra=(20/100)*salary;
			System.out.println(hra);
		}

	}

}
