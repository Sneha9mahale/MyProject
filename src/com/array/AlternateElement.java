package com.array;

import java.util.Scanner;

public class AlternateElement {

	public static void main(String[] args) {
		System.out.println("Enter number:");
		Scanner sc=new Scanner(System.in);
		int a[]=new int[6];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<a.length;i=i+2)
		{
			int temp=a[i];
			a[i]=a[i+1];
			a[i+1]=temp;
		}
		for(int arr:a)
		{
			System.out.println(arr);
		}
		

	}

}
