package com.array;

import java.util.Scanner;
import java.util.Arrays;
public class Sorting {
	public static void arraysort(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int []arr=new int[5];
		System.out.println("Enter array element : ");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println(Arrays.toString(arr));
		Sorting.arraysort(arr);
		System.out.println(Arrays.toString(arr));

	}

}
