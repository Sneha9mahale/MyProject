package com.While;
import java.util.Scanner;
public class Armstrong {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number:");
		int num=sc.nextInt();
		int temp=num;
		int r,cube;
		int sum=0;
		while(num>0)
		{
			r=num%10;
			cube=r*r*r;
			sum=sum+cube;
			num=num/10;
		}
		System.out.println(sum);
		num=temp;
		if(sum==num)
		{
			System.out.println("armstrong");
		}
		else
		{
			System.out.println("not armstrong");
		}
	}

}
