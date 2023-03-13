package com.array;

import java.util.Scanner;

public class AlternateElement {

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
			if(i<a.length)
			{
			a[i]=a[i+1];
			System.out.println(a[i]);
			}
		}
		

	}

}
