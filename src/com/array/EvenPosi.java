package com.array;

import java.util.Scanner;

public class EvenPosi {

	public static void main(String[] args) {
		int a[]=new int[5] ;
		System.out.println("Enter number:");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
		if(i%2==0)
		{
			continue;
		}
		System.out.println(a[i]);
		}

	}
}


