package com.While;
import java.util.Scanner;
public class Decimal_to_Binary {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int num=sc.nextInt();
		int r=0;
		while(num>0)
		{
			r=num%2;
			num=num/2;
			System.out.print(r);
		}
			
	}

		

	}


