package com.condition;
import java.util.Scanner;
public class Assign_salary {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int salary;
		float hra,da,gs;
		System.out.println("Enter salary");
		salary=sc.nextInt();
		if(salary<=10000)
		{
			hra=salary*(20/100f);
			System.out.println(hra);
			da=salary*(80/100f);
			System.out.println(da);
		}
		else if(salary<=20000)
		{
			hra=salary*(25/100f);
			System.out.println(hra);
			da=salary*(90/100f);
			System.out.println(da);
			gs=salary+hra+da;
			System.out.println("Gross salary = "+gs);
		}
		else if(salary>20000)
		{
			hra=salary*(30/100f);
			System.out.println(hra);
			da=salary*(95/100f);
			System.out.println(da);
		}
		else
		{
			System.out.println("less than 10000");
		}
		
		

	}

}
