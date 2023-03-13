package com.array;
import java.util.Scanner;
import java.util.Arrays;
public class SortingChar {
	public static void arraysort(char a[])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					char temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		char []arr=new char[5];
		System.out.println("Enter the array element :");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.next().charAt(0);
		}
		System.out.println(Arrays.toString(arr));
		SortingChar.arraysort(arr);
		System.out.println(Arrays.toString(arr));

	}

}
