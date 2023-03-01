package com.condition;
import java.util.Scanner;
public class Nested_ex {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int ag,wt;
		System.out.println("Enter age");
		ag=sc.nextInt();
		System.out.println("Enter weight");
		wt=sc.nextInt();
		if(ag>18)
		{
			if(wt>=50)
			{
				System.out.println("Eligible");
			}
			else
			{
				System.out.println("Weight is less");
			}
		}
		else
		{
			System.out.println("Not Eligible");
		}
	}

}
