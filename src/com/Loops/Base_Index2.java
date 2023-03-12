package com.Loops;

import java.util.Scanner;

public class Base_Index2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the base");
		int x=sc.nextInt();
		System.out.println("Enter the Index");
		int y=sc.nextInt();
		
		int i=1;
		int power=1;
		while(i<=y)
		{
			power=power*x;
			i++;
		}
		System.out.println(power);

	}

}
