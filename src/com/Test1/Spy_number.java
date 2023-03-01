package com.Test1;
import java.util.Scanner;
public class Spy_number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num,r;
		int sum=0;
		int product=1;
		System.out.println("Enter any number to check spy or not");
		num=sc.nextInt();
		while(num>0)
		{
			r=num%10;
			sum=sum+r;
			product=product*r;
			num=num/10;
		}
		System.out.println(sum);
		System.out.println(product);

		if(sum==product)
		{
			System.out.println("Number is spy");
		}
		else
		{
			System.out.println("Number is not spy");
		}
	}

}
