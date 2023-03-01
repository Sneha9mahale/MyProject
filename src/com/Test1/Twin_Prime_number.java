package com.Test1;
import java.util.Scanner;
public class Twin_Prime_number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1,num2,sub;
		System.out.println("Enter first number");
		num1=sc.nextInt();
		System.out.println("Enter Second number");
		num2=sc.nextInt();
		boolean isprime=true;
		for(int i=2;i<num1;i++)
			{
				if(num1%i==0)
				{
					isprime=false;
				}
			}
			if(isprime==true)
			{
				System.out.println(num1+"is prime");
			}
			else
			{
				System.out.println(num1+"is not prime");
				
			}
			for(int i=2;i<num2;i++)
			{
				if(num2%i==0)
				{
					isprime=false;
				}
			}
			if(isprime==true)
			{
				System.out.println(num2+"is prime");
			}
			else
			{
				System.out.println(num2+"is not prime");
			}
			sub=num1-num2;
			if(sub==2)
			{
				System.out.println("number is twin prime");
			}
			else
			{
				System.out.println("not");
			}
		}

	}

