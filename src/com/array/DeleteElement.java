package com.array;
import java.util.Scanner;
public class DeleteElement {
	static void delete(int a[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter index");
		int index=sc.nextInt();
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==index)
			{
				continue;
//				for(int j=i+1;j<a.length-1;j++)
//				{
//					a[i]=a[j];
//					a[j]=a[j+1];
//				}
			}
		}
		for(int arr:a)
		{
		System.out.println(arr);
		}
		
	}

	public static void main(String[] args) {
		int a[]= {1,2,5,7,8};
		delete(a);
		

	}

}
