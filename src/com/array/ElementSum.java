package com.array;

import java.util.Scanner;

public class ElementSum {
	
	public static void sum(int nu[])
	{
		int sum=0;
	for(int i=0;i<nu.length;i++)
	{
		sum=sum+nu[i];
	}
	System.out.println(sum);
	}
	public static void main(String[] args) {
		int a[]=new int[5] ;
		System.out.println("Enter number:");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		ElementSum.sum(a);

	}

}
