package com.While;
import java.util.Scanner;
public class CheckPrime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any num");
		int num=sc.nextInt();
		int i=2;
		boolean isprime=true;

		while(i<num)
		{
			if(num%i==0)
			{
				isprime=false;
				break;
			}
			i++;
		}
		if(isprime==true)
		{
			System.out.println("number is prime");
		}
		else
		{
			System.out.println("number is not prime");
		}
	}

}
