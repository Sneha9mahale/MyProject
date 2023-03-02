package com.While;
import java.util.Scanner;
public class Sum_oddDigit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number:");
		int num=sc.nextInt();
		int sum=0;
		while(num>0)
		{
			int r=num%10;
			if(r%2!=0)
			{
				
				sum=sum+r;
			}
			num=num/10;
		}
		System.out.println(sum);

	}

}
