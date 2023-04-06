package com.array;
import java.util.Scanner;
public class DeleteElement {
	static void delete(int a[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter index");
		int index=sc.nextInt();
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<=i;j++)
			{
			if(j==index)
			{
				j=index+1;
				System.out.print(a[j]);
				break;
			}
			System.out.print(a[j]);
			}
		}
		
	}

	public static void main(String[] args) {
		int a[]= {1,2,5,7,8};
		delete(a);
		

	}

}
