package com.abstraction;
import java.util.Scanner;

public class MidTest {

	public static void main(String[] args) {
		int a[]= {2,12,25,7,9};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number : ");
		int num=sc.nextInt();
		int min=Math.abs(num-a[0]);
		int closest=a[0];
		for(int i =1;i<a.length;i++)
		{
			//System.out.println(a[i]+" " +Math.abs(num-a[i]));
			if(min>Math.abs(num-a[i]))
				{
				min=Math.abs(num-a[i]);
					closest=a[i];	
				
				}
			
		}
		System.out.println(closest);

	}
}


