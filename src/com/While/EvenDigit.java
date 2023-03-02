package com.While;

import java.util.Scanner;

public class EvenDigit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		while(num>0)
		{
			int r=num%10;
			if(r%2==0)
			{
				System.out.print(" "+r);
			}
			num=num/10;
			
		}

	}

}
