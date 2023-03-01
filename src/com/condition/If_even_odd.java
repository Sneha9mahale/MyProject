package com.condition;
import java.util.Scanner;
public class If_even_odd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("Enter Number :");
		num=sc.nextInt();
		if(num%2==0)
		{
			System.out.println("Number is even");
		}
		else
		{
			System.out.println("Number is Odd");
		}

	}

}
