package com.array;

import java.util.Scanner;

public class Initialize {

	public static void main(String[] args) {
		//1st method
		/*int arr[]=new int[5];
		arr[0]=5;
		arr[1]=12;
		arr[2]=13;
		arr[3]=34;
		arr[4]=25;*/
		
		//2nd method
		//int arr[]= {2,5,7,56,78};
		
		//3rd method
		/*int a[]=new int[] {1,12,34,56,76};
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}*/
		
		int a[]=new int[5] ;
		System.out.println("Enter number:");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

}
