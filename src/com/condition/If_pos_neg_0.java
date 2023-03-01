package com.condition;

import java.util.Scanner;

public class If_pos_neg_0 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("Enter Number :");
		num=sc.nextInt();
		if(num>1)
		{
			System.out.println("Number is positive");
		}
		else if(num==0)
		{
			System.out.println("Number is Zero");
		}
		else if(num<1)
		{
			System.out.println("Number is negitive");
		}
		else 
		{
			System.out.println("Number is Invalid");
		}

	}

}
